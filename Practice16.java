package assignment;

import java.util.Scanner;

public class Practice16 {
	 int isSequentiallyBounded(int[] a)
	 {	
		int x=0;
		int index=0;
		 for (int i = 0; i < a.length; i++) {
			 
			if (a[i] <= 1) {
				return 0;
			}

			for (int j = i+1; j < a.length; j++) {
				if (a[i] > a[j]) {
					 return 0;
				}
			}
		 }
		 while(x < a.length)
		 {
			 for (int i = 0; i < a[x]; i++) {
				 if (a[i] == a[x]) {
					
				}
			 }
		 }

		 
//		if (isAscending(a)) {
//			while(i<a.length)
//			{	
//				k = a[i];
//				for (int j = i+1; j < k-1; j++) {
//					if (a[j] == a[i]) {
//						
//					}
//				}
//				i = i+(k-1);
//			}
//
//			for (int j = i+1; j < a[i]-1; j++) {
//				if (a[j] == a[i]) {
//					
//				}
//			}
//		}

		 
		 return 0;
	 }
	public static void main(String[] args) {
		int num=0,returnValue=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = scanner.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter array elements: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter "+i+"th element of array: ");
			num = scanner.nextInt();
			if (num < 0) {
				System.out.println("Negative number is not allowed.");
				System.exit(0);
			}
			arr[i] = num;
		}
		Practice16 practice16 = new Practice16();
		returnValue = practice16.isSequentiallyBounded(arr);
	}
}
