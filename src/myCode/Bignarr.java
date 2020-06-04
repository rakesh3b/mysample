package myCode;

import java.util.*; 

import java.io.*; 

	class Bignarr 
	{ 
		 
		static void arrUtil(int arr[], int n) 
		{ 
			int counter = 0; 
			for (int i = 0; i < n; i++) 
				if (arr[i] != 0) 
					arr[counter++] = arr[i]; 
			while (counter < n) 
				arr[counter++] = 0; 
		} 
//test
		
		public static void main (String[] args) 
		{ 
			int intarr[] = {2, 3, 4, 0, 5, 0, 9, 3}; 
			int n = intarr.length; 
			arrUtil(intarr, n); 
			System.out.println("Data "); 
			for (int i=0; i<n; i++) 
				System.out.print(intarr[i]+" "); 
		} 
	} 