package com.gargi.sorting;

public class MergeSortAlgo {
	public static void mergeTwoSortedArr(int[] arr, int low, int mid,int high) {
		//array capable of storing elements from both the arrays
		int[] mergedArr = new int[high-low+1];
		int i= low;
		int j= mid+1;
		//for mergedArr index counter;
		int k =0;
		while(i<=mid && j<=high) {
			if(arr[i]<=arr[j]) {
				mergedArr[k]=arr[i];
				k++;
				i++;
			}else {
				mergedArr[k]=arr[j];
				k++;
				j++;
			}
		}
		//while 2nd half of the array is exhausted but elements still present in first half
	    while(i<=mid) {
	    	mergedArr[k]=arr[i];
	    	k++;
			i++;
	    }
	  //while 1st half of the array is exhausted but elements still present in second half
	    while(j<=high) {
	    	mergedArr[k]=arr[j];
	    	k++;
	    	j++;
	    }
	    //putting back the elements in the original array
	    for(int x=0,m=low; x<mergedArr.length;x++,m++) {
	    	arr[m]=mergedArr[x];
	    }
	}
	 public static void mergeSort(int[] arr, int low, int high) {
		 if(low>=high) {
			return; 
		 }
		 int mid= low+(high-low)/2;
		 //First/left half of the array
		 mergeSort(arr, low, mid);
		 //second/right half of the array
		 mergeSort(arr, mid+1, high);
		 mergeTwoSortedArr(arr, low, mid, high);
	}
	
	 public static void main(String[] args) { 
		 int[] arr = {7,99,4,98,75,56,2,1};
		 int n = arr.length;
		 mergeSort(arr, 0, n-1);
		 System.out.println("After implementing Merge Sort the sorted array is:");
		 for(int i=0; i<n;i++) {
			System.out.print(arr[i]+" "); 
		 }
		 System.out.println();
	 }

	}

