package com.java.ds.sorting;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		
		for(int i = 0; i < n; i++) 
		{
			ar[i] = sc.nextInt();
		}
		
		BubbleSort bs = new BubbleSort();
		System.out.println("Before Sort ....");
		bs.printArr(ar);
		bs.Sort(ar);
		System.out.println("\nAfter Sort ....");
		bs.printArr(ar);
		
		
	}
	
	public void Sort(int ar[]) {
		int l = ar.length;
		
		for(int i = 0; i < l; i++)
		{
			for(int j = 0; j < l-i-1; j++) {
				if(ar[j] > ar[j+1])
				{
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
				}
			}
		}
	}
	
	public void printArr(int ar[]) {
		for(int i=0; i<ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
	}


}
