package Tema5.RPG.Item.Food;

public class Egg extends Food{
    private double power = 10;
    private String name = "Egg";

    public Egg(String name, double power){
        super(name, power);
    }

    //Getters
    public double getPower() {
        return power;
    }

    public String getName() {
        return name;
    }
}
