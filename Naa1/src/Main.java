import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		System.out.println("Input five digit number:");
		int number = sc.nextInt();
		System.out.println("Digits:");
		int d1 = (number / 10000) % 10;
		System.out.println(d1);
		int d2 = (number / 1000) % 10;
		System.out.println(d2);
		int d3 = (number / 100) % 10;
		System.out.println(d3);
		int d4 = (number / 10) % 10;
		System.out.println(d4);
		int d5 = number % 10;
		System.out.println(d5);
		
	}

}
