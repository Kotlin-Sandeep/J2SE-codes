package com.javaqubes;
//greatest common divisor (GCD), greatest common factor (GCF), highest common factor (HCF), 
// greatest common measure (GCM), or highest common divisor(HCD)
import java.util.Scanner;

public class Hcf {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of First number: -");
		int a = s.nextInt();
		
		System.out.println("Enter the value of Second number: -");
		int b = s.nextInt();
		int hcf = 1;
		
		// way -1
		for (int i = 1; i <= a && i <= b; i++) {
			if(a % i == 0 && b % i == 0)
				hcf = i;
		}
		System.out.println("The HCF of " + a +" and "+ b +" is : " + hcf);
	}
}
