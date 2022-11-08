package com.gargi.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {5,4,7,1,98,3,9};
		
		//bubble sort implementation ascending order
		for(int i=0; i<arr.length-1;i++) {
			for(int j=0; j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("The array in ascending sorted order now becomes:");
		for(int x:arr) {
			System.out.print(x + " ");
		}
		System.out.println();
		
		//sorting in descending order
		for(int i=0; i<arr.length-1;i++) {
			for(int j=0; j<arr.length-i-1;j++) {
				if(arr[j]<arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("The array in descending sorted order now becomes:");
		for(int x:arr) {
			System.out.print(x + " ");
		}
	}
	

}
