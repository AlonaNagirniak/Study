import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Input sides of triangle:");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double p = (a+b+c)/2;		
		double S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		
		System.out.println("Area of triangle: " + S);	
	}

}
