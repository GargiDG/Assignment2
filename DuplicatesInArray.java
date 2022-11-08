package com.gargi.sorting;

public class DuplicatesInArray {

		public static void main(String[] args) {
			
		//*************For int array**************	
		//Constraint:The elements cannot occur more than twice
			int[] arr = {5,7,1,2,5,7,2,4,-1,-1};
			System.out.println("The duplicate elements are:" );
			for(int i=0; i<arr.length; i++) {
				for(int j=i+1; j<arr.length;j++) {
					if(arr[i]== arr[j]) {
						System.out.print(arr[i]+ " ");
					}
				}
			}
			
		 //******************For String**********************    
		//Constraint:The elements cannot occur more than twice
//			String[] ar = {"iNeuron", "Ineuron", "INEURON", "iNeuron","Java","Java"};
//			System.out.println("The Duplicate/s is/are:");
//			for(int i=0; i<ar.length; i++) {
//				for(int j=i+1; j<ar.length; j++) {
//					if(ar[i].equals(ar[j])) {
//						System.out.print(ar[i]+" ");
//					}
//				}
//							
//			}
			
		}

	}


