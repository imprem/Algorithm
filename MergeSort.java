package com.java.ds.sorting;

import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		
		for(int i = 0; i < n; i++) 
		{
			ar[i] = sc.nextInt();
		}
		
		MergeSort ms = new MergeSort(); 
		System.out.println("Before Sort ....");
		ms.printArr(ar);
		ms.Msort(ar, 0, ar.length-1);
		System.out.println("\nAfter Sort ....");
		ms.printArr(ar);
	}
	
	public void merge(int ar[], int l, int m, int r) 
	{
		int n1 = m - l + 1; 	
		int n2 = r - m;
		
		int[] L = new int[n1];
		int[] R = new int[n2];
		
		for(int i = 0; i < n1; i++)
		{
			L[i] = ar[l+i];
		}
		for(int j = 0; j < n2; j++)
		{
			R[j] = ar[m+1+j];
		}
		
		
		int i = 0, j = 0;
		
		int k = l;
		while(i < n1 && j < n2) 
		{
			if(L[i] <= R[j]) 
			{
				ar[k] = L[i];
				i++;
				
			}
			else
			{
				ar[k] = R[j];
				j++;
			}
			k++;
		}
		
		while(i < n1) 
		{
			ar[k] = L[i];
			i++;
			k++;
		}
		
		while(j < n2) 
		{
			ar[k] = R[j];
			j++;
			k++;
		}
	}
	
	public void Msort(int ar[], int l, int r)
	{
		if(l < r)
		{
			 int m = (l+r)/2;
			 
			 Msort(ar, l, m);
			 Msort(ar, m+1, r);
			 
			 merge(ar, l, m, r);
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
