import java.util.Scanner;

public class Ejemplo3 {
	public static void main (String [] argv) {
	float side;
	float SquareArea;

	System.out.println("Ingresa un valor");

	Scanner inputValue;
	inputValue=new Scanner(System.in);
	side = inputValue.nextFloat();

	SquareArea = side * side;
	System.out.println(SquareArea);
	}
}
