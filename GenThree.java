/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int rand1=(int)(Math.random()*(b-a))+a;
		System.out.println(rand1);
		int rand2=(int)(Math.random()*(b-a))+a;
		System.out.println(rand2);
		int rand3=(int)(Math.random()*(b-a))+a;
		System.out.println(rand3);
		if((rand1<=rand2)&&(rand1<=rand3))
			System.out.println("The minimal generated number was " + rand1);
		else	
		if((rand2<=rand3)&&(rand2<=rand1))
			System.out.println("The minimal generated number was " + rand2);
		else
			System.out.println("The minimal generated number was " + rand3);
	}
}