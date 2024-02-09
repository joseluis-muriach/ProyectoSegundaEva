package agenda.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name ="hairdressers")

public class Hairdresser implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Con esto cuando creemos un nuevo peluquero se autoincrementara el ID :)
    @Column(name ="id_hairdresser")
    private Long hairdresserID;

    @Column(name="hairdresser_name")
    private String hairdresserName;

    @Column(name="hairdresser_birthday")
    private String hairdresserBirthdate;

    @Column(name="hairdresser_dni")
    private String hairdresserDni;

    public Hairdresser(Long hairdresserID, String hairdresserName, String hairdresserBirthdate, String hairdresserDni) {
        this.hairdresserID = hairdresserID;
        this.hairdresserName = hairdresserName;
        this.hairdresserBirthdate = hairdresserBirthdate;
        this.hairdresserDni = hairdresserDni;
    }

    public Hairdresser() {
    }

    public Long getHairdresserID() {
        return hairdresserID;
    }

    public void setHairdresserID(Long hairdresserID) {
        this.hairdresserID = hairdresserID;
    }

    public String getHairdresserName() {
        return hairdresserName;
    }

    public void setHairdresserName(String hairdresserName) {
        this.hairdresserName = hairdresserName;
    }

    public String getHairdresserBirthdate() {
        return hairdresserBirthdate;
    }

    public void setHairdresserBirthdate(String hairdresserBirthdate) {
        this.hairdresserBirthdate = hairdresserBirthdate;
    }

    public String getHairdresserDni() {
        return hairdresserDni;
    }

    public void setHairdresserDni(String hairdresserDni) {
        this.hairdresserDni = hairdresserDni;
    }
}
