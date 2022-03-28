package Tema5.RPG.Item.Food;

public abstract class Food implements IConsumable {
    private double power;
    private String name;

    //Métodos
    public Food(String name, double power) {
        this.name = name;
        this.power = power;
    }
    
    public void consumeBy(Character character){
        
    }

}
