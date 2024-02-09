package agenda.entities;

public class Turn {
    private Long id;
    private String name;
    private String date;
    private String hour;
    private String duration;
    private boolean booked;
    private int hairdresserID ;

    public Turn(Long id, String name, String date, String hour, String duration, boolean booked, int hairdresserID) {
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

    public int getHairdresserID() {
        return hairdresserID;
    }

    public void setHairdresserID(int hairdresserID) {
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
