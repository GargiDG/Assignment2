package com.gargi.sorting;

import java.util.Arrays;

		public class SubsetOfArray {
		static boolean isSubset(int arr1[], int arr2[], int m,int n)
		{
		int i = 0, j = 0;
		//when the length of the first array is less than the array to be checked 
		if (m < n)
		return false;
		// Either implement Quick Sort algorithm to sort the two arrays in ascending order
		//or use this already existing sort()
		Arrays.sort(arr1); 
		Arrays.sort(arr2); 
		//the main logic to find subset
		//while elements are still present in both arrays
		while (i < n && j < m) {
		if (arr1[j] < arr2[i])
		 j++;
		else if (arr1[j] == arr2[i]) {
		 j++;
		 i++;
		}
		else if (arr1[j] > arr2[i])
		 return false;
		}
		
		if (i < n)
		    return false;
		else
		    return true;
		}
		
		public static void main(String[] args)
		{
	    //First array from which subset has to be found
		int[] arr1 = { 11, 1, 13, 21, 3, 7 };
		//Second array which is to be checked whether it is a subset of the first array or not
		 int[] arr2 = {13,7,11};
		//int[] arr2 ={13,21,27};
		
		int m = arr1.length;
		int n = arr2.length;
		
		if (isSubset(arr1, arr2, m, n))
		    System.out.println("Second array/arr2 is a subset of the first array/arr1");
		else
		    System.out.println(
		        "Second Array/arr2 is not a subset of the first array/arr1");
		}
		}

	


