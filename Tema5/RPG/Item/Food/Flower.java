package Tema5.RPG.Item.Food;

public class Flower extends Food{
    private double power = 1;
    private String name = "Flower";

    public Flower(String name, double power){
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
