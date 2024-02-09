package agenda.entities;

public enum Rol {
    ADMIN("ADMIN"),
    HAIRDRESSER("HAIRDRESSER"),
    CLIENT("CLIENT");
    private final String rol;

    Rol(String rol) {
        this.rol = rol;
    }

    public String getRol() {
        return rol;
    }
}
