package session;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Random r= new Random();
        car.setName("Mercedes");
        car.setModel("Benz");
        car.setColor("Black");
        car.setValue(3.0);
        car.setSpeed(r.nextInt());

        System.out.println("Marka "+car.getName()+" model "+ car.getModel()+" color" + car.getColor()+ " объем "+ car.getValue());

        car.GoCar(car.getSpeed());


    }
}
