//package agenda.repositorios;
//
//import agenda.entities.Rol;
//import agenda.entities.User;
//import agenda.security.PasswordEncryptor;
//import org.springframework.stereotype.Repository;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Repository
//public class UsuarioRepository {
//    public List<User> getUsuarios(){
//        ArrayList<User> users =  new ArrayList<User>();
//        users.add(new User("aitor", PasswordEncryptor.encrypt("1234"), Rol.ADMIN));
//        users.add(new User("alicia", PasswordEncryptor.encrypt("1111"), Rol.CLIENT));
//        return users;
//    }
//}
