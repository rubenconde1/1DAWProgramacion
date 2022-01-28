package Tema5;

public class HeaterTest {
    public static void main(String[] args) {
        Heater heater1, heater2;

        heater1 = new Heater(20.0, 10.0);
        heater2 = new Heater(10.0, 0.0);

        heater1.warmer();
        heater2.cooler();
        heater1.setTemperature(5.0);
        System.out.println(heater1.getTemperature());
        heater1.setTemperature(20.0);
        heater1.setIncrement(2.0);
        heater1.warmer();
        
    }
}
