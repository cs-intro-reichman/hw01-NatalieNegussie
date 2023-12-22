/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
		int num1, num2;
		int number=Integer.parseInt(args[0]);
		num1=number/25;
		num2=number%25;
		System.out.println("Use " +num1 +" quarters and " +num2+ " cents");
	}
}