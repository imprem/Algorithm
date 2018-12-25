package com.java.ds.sorting;

import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		
		for(int i = 0; i < n; i++) 
		{
			ar[i] = sc.nextInt();
		}
		
		QuickSort qs = new QuickSort();
		System.out.println("Before Sort ....");
		qs.printArr(ar);
		qs.Qsort(ar, 0, ar.length-1);
		System.out.println("\nAfter Sort ....");
		qs.printArr(ar);
	}
	
	public int partition(int ar[], int low, int high) 
	{
		int pivot = ar[high];
		int i = (low - 1);
		
		for(int j = low; j < high; j++)
		{
			
			if(ar[j] <= pivot)
			{
				i++;
				
				int temp = ar[i];
				ar[i] = ar[j];
				ar[j] = temp;
			}
			
		}
		
		int temp = ar[i+1];
		ar[i+1] = ar[high];
		ar[high] = temp;
		
		return i+1;
	}
	
	void Qsort(int ar[], int low, int high)
	{
		if(low < high)
		{
			int pi = partition(ar, low, high);
			
			Qsort(ar, low, pi-1);
			Qsort(ar, pi+1,	high);
		}
	}
	
	public void printArr(int ar[])
	{
		for(int i=0; i<ar.length; i++) 
		{
			System.out.print(ar[i]+" ");
		}
	}

}
