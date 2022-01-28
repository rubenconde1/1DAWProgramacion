package Tema5;

public class ClockDisplayTest {
    public static void main(String[] args) {
        ClockDisplay reloj1, reloj2;

        reloj1 = new ClockDisplay(2, 59, 55);
        reloj2 = new ClockDisplay(1, 00, 59);

        for (int i = 0; i < 1000; i++) {
            reloj1.timeTick();
            System.out.println(reloj1.getTime());
        }
    }
}
