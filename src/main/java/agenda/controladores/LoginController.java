package agenda.controladores;

import agenda.entities.User;
import agenda.repositorios.UsuarioRepository;
import agenda.security.JWTAuthenticationConfig;
import agenda.security.PasswordEncryptor;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LoginController {
    @Autowired
    JWTAuthenticationConfig jwtAuthtenticationConfig;

    @Autowired
    UsuarioRepository usuarioRepository;


    @PostMapping("login")
    public String login(
            @RequestParam("user") String username,
            @RequestParam("encryptedPass") String encryptedPass) throws BadRequestException {

        List<User> users = usuarioRepository.getUsuarios();


        User userEncontrado = null;

        for (User user : users) {
            if (user.getUsername().equals(username) &&
                    PasswordEncryptor.decrypt(user.getEncryptedPass()).equals(encryptedPass)) {
                userEncontrado = user;
                break;
            }
        }

        if (userEncontrado == null) {
            throw new BadRequestException();
        }

        String token = jwtAuthtenticationConfig.getJWTToken(userEncontrado.getUsername(), userEncontrado.getRol());

        return token;
    }
}
