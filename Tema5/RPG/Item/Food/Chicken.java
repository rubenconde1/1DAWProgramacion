package Tema5.RPG.Item.Food;

public class Chicken extends Food {
    private double power = 25;
    private String name = "Chicken";

    public Chicken(String name, double power){
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