package assignment;

import java.util.Scanner;

public class MadhavArray {
	public int isMadhavArray(int[] a)
	{	
		int check=0;
		return check;
	}
	public static void main(String[] args) {
		Scanner scannerObj = new Scanner(System.in);
		System.out.println("Enter the size of array that is to be created: ");
		int size = scannerObj.nextInt();
		System.out.println(size*(size+1)/2);
//		int[] arr = new int[size];
//		int value=0;
//		System.out.println("Enter the numbers of array: ");
//		for (int i = 0; i < size; i++) {
//			arr[i] = scannerObj.nextInt();
//		}
//		MadhavArray madhavArrayObj = new MadhavArray();
//		value = madhavArrayObj.isMadhavArray(arr);
//		if (value == 1)
//			System.out.println("Given array is a Madhav Array.");
//		else
//			System.out.println("Given array is not a Madhav Array.");
	}
}
