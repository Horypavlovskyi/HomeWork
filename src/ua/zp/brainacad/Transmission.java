package ua.zp.brainacad;

public class Transmission {
    private String type;
    private int gear;

    @Override
    public String toString() {
        return "Transmission{" +
                "type='" + type + '\'' +
                ", gear=" + gear +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public Transmission(String type, int gear) {
        this.type = type;
        this.gear = gear;
    }
}
