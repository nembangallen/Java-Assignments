package assignment;

import java.util.Scanner;

public class Practice17 {
	
	public int isPacked(int[] a)
	{	
		// {2,2,1}
		int returnVal = 0,k=0,i=0;
		while (i < a.length) {
			k=a[i]; // {3,3,3,2,2}
			for (int j = i+1; j <= k-1; j++) {
				if (a[j] == a[i]) {
					returnVal = 1;
				}else {
					break;
				}
			}
			i+=k;
		}
//			for (int j = i+1; j < a[i]; j++) {
//				if (a[j] == a[i]) {
//					returnVal = 1;
//					System.out.println("Yes");
//				}else {
//					returnVal = 0;
//					break;
//				}
//			}
//		}
		return returnVal;
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
		Practice17 practice17 = new Practice17();
		returnValue = practice17.isPacked(arr);
		if (returnValue == 1)
			System.out.println("Array is packed.");
		else
			System.out.println("Array is not packed.");
	}
}
