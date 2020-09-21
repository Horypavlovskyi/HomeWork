package ua.zp.brainacad;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Body body = new Body("Седан","Серебристый");
        Engine engine = new Engine("Инжектор",66);
        Transmission transmission = new Transmission("Механика",5);
        Car sens = new Car(3000,"Daewoo","Sens",body,engine,transmission);
        System.out.println(sens);
        sens.setPrice(sens.getPrice() + 2000);
        System.out.println(sens);
        sens.getBody().setColor("Чёрный");
        System.out.println(sens);
        sens.getEngine().setPower(engine.getPower() * (20) / 100 + engine.getPower());
        System.out.println(sens);
        sens.getBody().setType("Универсал");
        System.out.println(sens);
        sens.getTransmission().setGear(transmission.getGear() + 1);
        System.out.println(sens);


    }
}
