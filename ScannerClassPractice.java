package methods;

import java.util.Scanner;

public class ScannerClassPractice {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
		System.out.println("Your age : ");
		int age = sc.nextInt();
		System.out.println("Your age : " + age);
		sc.nextLine();
		
		System.out.println("Your Height: ");
		float digit = sc.nextFloat();
		System.out.println("Your Height: " + digit);
		sc.nextLine();
		
		System.out.println("Bank balance? : ");
		double count = sc.nextDouble();
		System.out.println("Your bank balance : " + count);
		sc.nextLine();
		
		System.out.println("Are you adult: ");
		boolean Answer = sc.nextBoolean();
		sc.nextLine(); 
		System.out.println("  " + Answer);
		
		System.out.println("What is your name : ");
		String name = sc.nextLine();
		System.out.println(" " + name);
		
		sc.close();

	}

}
