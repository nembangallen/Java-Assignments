package assignment;

import java.util.Scanner;

public class Practice15 {
	public int isVanilla(int[] a)
	{	
		int temp=0;
		// {1, 11, 111, 1111 }
//		for (int i = 0; i < a.length; i++) {
//			for (int j = i+1; j < a.length; j++) {
//				if (a[i] > a[j]) {
//					temp = a[i];
//					a[i] = a[j];
//					a[j] = a[i];
//				}
//			}
//		}
		for (int i = 0; i < a.length; i++) {
			if (a[i]>10) {
				for (int j = 0; j < a.length; j++) {
					
				}
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter array size: ");
		int size = scanner.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter array elements: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter "+i+"th element of array: ");
			arr[i] = scanner.nextInt();
		}
	}

}
