package session;

public class Car {
    String Name;
    String Model;
    String Color;
    Double Value;
    int Speed;



    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public Double getValue() {
        return Value;
    }

    public void setValue(Double value) {
        Value = value;
    }

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int speed) {
        Speed = speed;
    }
    void GoCar( int speed){
        if (speed >=110){
            System.out.println("Driving too fast ");
        }
        else if (speed >=30 && 110>= speed){
            System.out.println("Driving good");
        }
        else if (speed <= 30)  {
            System.out.println("driving too slow ");

        }
    }
}
