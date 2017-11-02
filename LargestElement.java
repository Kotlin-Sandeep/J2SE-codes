package com.javaqubes;

import java.util.Scanner;

public class LargestElement {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		// reading size of data array from user
		System.out.println("Enter the total no of elements: ");
		int n = s.nextInt();
		// reading no of largest element to be print from user
		System.out.println("Enter the k largest no's: ");
		int k = s.nextInt();
		
		// reading data from user
		int[] data = new int[n];
		System.out.println("Enter the datas: ");
		for (int i = 0; i < data.length; i++) {
			data[i] = s.nextInt();
		}
		
		// Rearranging data 
		int temp=0;
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data.length; j++) {
				if(data[i] > data[j]){
					temp = data[i];
					data[i] = data[j];
					data[j] = temp;
				}
				temp = 0;
			}
		}
		// printing largest data elements
		System.out.println("The largest elements are: ");
		for (int i = 0; i<k ; i++ ) {
			System.out.println(data[i]);
		}
	}

}
