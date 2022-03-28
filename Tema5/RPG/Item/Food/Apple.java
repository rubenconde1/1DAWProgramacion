package Tema5.RPG.Item.Food;

public class Apple extends Food {
    private double power = 5;
    private String name = "Apple";

    public Apple(String name, double power){
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
