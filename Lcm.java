package com.javaqubes;

import java.util.Scanner;

public class Lcm {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value of First number: -");
		int a = s.nextInt();
		
		System.out.println("Enter the value of Second number: -");
		int b = s.nextInt();
		
		int lcm = (a > b) ? a : b;
		
		while(true){
			if( lcm % a == 0 && lcm % b ==0){
				break;
			}
			lcm++;
		}
		System.out.println("The LCM of " + a +" and " +b +" is "+lcm);
	}
}