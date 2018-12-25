package com.java.ds.sorting;

import java.util.Scanner;

public class insertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		
		for(int i = 0; i < n; i++) 
		{
			ar[i] = sc.nextInt();
		}
		
		insertionSort is = new insertionSort();
		System.out.println("Before Sort ....");
		is.printArr(ar);
		is.Isort(ar);
		System.out.println("\nAfter Sort ....");
		is.printArr(ar);
	}
	
	public void Isort(int ar[]) {
		int n = ar.length;
		for(int i=1; i<n; ++i) {
			int key = ar[i]; 
            int j = i-1;
            
            while (j>=0 && ar[j] > key) 
            { 
                ar[j+1] = ar[j]; 
                j = j-1; 
            } 
            ar[j+1] = key; 

		}
	}
	
	public void printArr(int ar[]) {
		for(int i=0; i<ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
	}

}
