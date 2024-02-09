package agenda.entities;

import agenda.entities.Rol;

public class User {
    String username;
    String encryptedPass;
    Rol rol;

    public User(String username, String encryptedPass, Rol rol) {
        this.username = username;
        this.encryptedPass = encryptedPass;
        this.rol = rol;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEncryptedPass() {
        return encryptedPass;
    }

    public void setEncryptedPass(String encryptedPass) {
        this.encryptedPass = encryptedPass;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "username='" + username + '\'' +
                ", encryptedPass='" + encryptedPass + '\'' +
                ", rol=" + rol +
                '}';
    }
}
