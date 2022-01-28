package Tema5;

public class Heater {
    private double temperature;
    private double min;
    private double max;
    private double increment;

    

    public Heater(double valueMax, double valueMin) {
        temperature = 15.0;
        max = valueMax;
        min = valueMin;
        increment = 5.0;
    }
    
    public void warmer() {
        double temperatureTotal = temperature + increment;
        if (temperatureTotal <= max) {
            temperature = temperature + increment;
        } else {
            System.out.println("ERROR. El valor de la temperatura excede el máximo.");
        }
    }

    public void cooler() {
        double temperatureTotal = temperature - increment;
        if (temperatureTotal >= min) {
            temperature = temperature - increment;
        } else {
            System.out.println("ERROR. El valor de la temperatura es inferior al mínimo.");
        }
    }

    public void setIncrement(double heaterIncrement) {
        if (heaterIncrement <= 5.0 && heaterIncrement >=1.0 ) {
            this.increment = heaterIncrement;
        } else {
            System.out.println("El valor introducido no está entre 1.0 y 5.0.");
        }
    }

    //Getters y Setters//
    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}
