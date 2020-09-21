package ua.zp.brainacad;

public class Engine {
    private double power;
    private String type;


    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", power=" + power +
                '}';
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public Engine(String type, int power) {
        this.type = type;
        this.power = power;
    }
}
