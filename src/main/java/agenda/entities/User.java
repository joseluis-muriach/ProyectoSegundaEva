package agenda.entities;

import javax.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "users")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_user")
    private Long userID;

    @Column(name="userName")
    private String userName;

    @Column(name="password")
    private String password;

    @Enumerated(EnumType.STRING) //Esto no lo sabia y lo tube que buscar
    @Column(name="rol")
    private Rol rol;

    public User(Long userID, String userName, String password, Rol rol) {
        this.userID = userID;
        this.userName = userName;
        this.password = password;
        this.rol = rol;
    }

    public User() {
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}
