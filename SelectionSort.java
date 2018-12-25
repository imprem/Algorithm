package com.java.ds.sorting;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		
		for(int i = 0; i < n; i++) 
		{
			ar[i] = sc.nextInt();
		}
		
		SelectionSort ss = new SelectionSort();
		System.out.println("Before Sort ....");
		ss.printArr(ar);
		ss.sort(ar);
		System.out.println("\nAfter Sort ....");
		ss.printArr(ar);
		
	}

	public void sort(int ar[]) {
		
		for(int i = 0; i < ar.length-1; i++) 
		{
			int index = i;
			for(int j = i+1; j < ar.length; j++)
			{
				if(ar[j] < ar[index])
				{
					index = j;
				}
			}
			
			int temp = ar[index];
			ar[index] = ar[i];
			ar[i] = temp;
		}
	}
	
	public void printArr(int ar[]) {
		for(int i=0; i<ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
	}

}
