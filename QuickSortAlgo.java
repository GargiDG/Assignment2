package com.gargi.sorting;
//import java.util.*;
		public class QuickSortAlgo {
		
		      
			  public static void quickSort(int[] arr, int low, int high) {
				  if(low>high) {	    	
			    	return;
			    }
				//choosing the last index as the pivot in the very beginning
			    int pivot=arr[high];
			    //calculating the subsequent pivot index
			    int pivotIndex = partition(arr, pivot, low, high);
			    //first half
			    quickSort(arr, low, pivotIndex-1);
			    //last half
			    quickSort(arr, pivotIndex+1, high);
			  }
			  
			  /* This function takes last element as pivot,
		       places the pivot element at its correct
		       position, and places all
		       smaller (smaller than pivot) to left of
		       pivot and all greater elements to right
		       of pivot */
		
			  public static int partition(int[] arr, int pivot, int low, int high) {
			    //System.out.println("pivot: " + pivot);
			    int i = low, j = low;
			    while (i <= high) {
			      if (arr[i] <= pivot) {
			        swap(arr, i, j);
			        i++;
			        j++;
			      } else {
			        i++;
			      }
			    }
			   // System.out.println("pivot index: " + (j - 1));
			    return (j - 1);
			  }
		
			  // swapping ith and jth elements of array
			  public static void swap(int[] arr, int i, int j) {
			    //System.out.println("Swapping " + arr[i] + " and " + arr[j]);
			    int temp = arr[i];
			    arr[i] = arr[j];
			    arr[j] = temp;
			  }
		      
			  //print the array after sorting
			  public static void print(int[] arr) {
				System.out.println("The sorted array after implementing quicksort is :");
			    for (int i = 0; i < arr.length; i++) {
			      System.out.print(arr[i] + " ");
			    }
			    System.out.println();
			  }
		
			  public static void main(String[] args) {
				int[] arr= {5,7,23,1,3,98,9,10,2}; 
				//or
				//Take the number of elements and the elements from user  
//			    Scanner sc = new Scanner(System.in);
//			    System.out.println("Enter the number of elements of the array: ");
//			    int n = sc.nextInt();
//			    int[] arr = new int[n];
//			    System.out.println("Enter the elements of the array:");
//			    for (int i = 0; i < n; i++) {
//			      arr[i] = sc.nextInt();
//			    }
				  
			    quickSort(arr, 0, arr.length - 1);
			    print(arr);
			  }

	}

