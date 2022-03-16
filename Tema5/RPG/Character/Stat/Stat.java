package Tema5.RPG.Character.Stat;

public abstract class Stat {
    private int value;

    public Stat(int value) {
        this.value = value;
    }

    //Devuelve el valor actual de la característica.
    public int getValue() {
        return value;
    }

    //Aumenta el valor de la característica en 1.
    public void increase(){
        value++;
    }

    //Disminuye el valor de la característica en 1.
    public void decrease() {
        value--;
    }

    @Override
    //Devuelve el nombre simple de la clase.
    public String toString() {
        return "Stat [value=" + value + "]";
    }

    
}
