package case_study.model.Facillity;

public abstract class Facility {
    private String vila;
    private String house;
    private String room;

    public Facility() {

    }

    public Facility(String vila, String house, String room) {
        this.vila = vila;
        this.house = house;
        this.room = room;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "vila='" + vila + '\'' +
                ", house='" + house + '\'' +
                ", room='" + room + '\'' +
                '}';
    }

    public String getVila() {
        return vila;
    }

    public void setVila(String vila) {
        this.vila = vila;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }
}
