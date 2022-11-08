package com.gargi.sorting;

public class SelectionSorting {

	public static void main(String[] args) {
		int[] arr= {50,6,100,2,37,9,4};
		
		//*********selection sort**********
		for(int i=0; i<arr.length-1;i++) {
			//the 0th index is taken as the smallest in the beginning
			int smallest =i;
			for(int j=i+1;j<arr.length;j++) {
				//if the current jth index holds the value which is less than the smallest position value 
				//make that jth index as the new smallest
				if(arr[j]<arr[smallest]) {
					smallest =j;
				}
				
			}
			//check to not make the swap if both are same
			if(smallest!=i) {
				int temp = arr[smallest];
				arr[smallest]=arr[i];
				arr[i]=temp;
			}
		}
		System.out.println("The array after implementng Selection sort becomes:");
		for(int x: arr) {
			System.out.print(x+" ");
		}
	}

}
