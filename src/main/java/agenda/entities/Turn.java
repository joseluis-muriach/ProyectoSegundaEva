package agenda.entities;

import javax.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="turns", uniqueConstraints = {
        @UniqueConstraint(columnNames = "id_hairdresser")
})
public class Turn implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Lo mismo que vemos en la primera clase
    @Column(name="id_turn")
    private Long id;

    @ManyToOne
    @JoinColumn(name="id_hairdresser", referencedColumnName = "id_hairdresser")
    private Hairdresser hairdresserID ;

    @Column(name="turn_name")
    private String name;

    @Column(name="date")
    private String date;

    @Column(name="hour")
    private String hour;

    @Column(name="session_duration")
    private String duration;

    @Column(name="booked")
    private boolean booked;


    public Turn(Long id, String name, String date, String hour, String duration, boolean booked, Hairdresser hairdresserID) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.hour = hour;
        this.duration = duration;
        this.booked = booked;
        this.hairdresserID = hairdresserID;
    }

    public Turn() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    public Hairdresser getHairdresserID() {
        return hairdresserID;
    }

    public void setHairdresserID(Hairdresser hairdresserID) {
        this.hairdresserID = hairdresserID;
    }

    @Override
    public String toString() {
        return "Turn{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", hour='" + hour + '\'' +
                ", duration='" + duration + '\'' +
                ", booked=" + booked +
                ", hairdresserID=" + hairdresserID +
                '}';
    }
}
