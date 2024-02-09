package agenda.entities;

public class Hairdresser {

    private int id;
    private String name;
    private String birthdate;
    private String dni;

    public Hairdresser(int id, String name, String birthdate, String dni) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
        this.dni = dni;
    }

    public Hairdresser() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
}
