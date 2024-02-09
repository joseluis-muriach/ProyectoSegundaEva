//package agenda.controladores;
//
//import agenda.entities.Rol;
//import agenda.entities.User;
//import agenda.security.Constans;
//import agenda.security.JWTAuthenticationConfig;
//import org.apache.coyote.BadRequestException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//public class Login {
//    @RestController
//    public class LoginController {
//
//        @Autowired
//        JWTAuthenticationConfig jwtAuthenticationConfig;
//
//
//        @PostMapping("login")
//        public String login(
//                @RequestParam("user") String username,
//                @RequestParam("encryptedPass") String encryptedPass) throws BadRequestException {
//
//
//            if (!(username.equals(Constans.USER) && encryptedPass.equals(Constans.PASS))) {
//                throw new BadRequestException();
//            }
//
//
//            String token = jwtAuthenticationConfig.getJWTToken(username, Rol.ADMIN);
//            return token;
//        }
//    }
//}
