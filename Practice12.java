package assignment;

import java.util.Scanner;

public class Practice12 {
	public int isNUnique(int[] a, int n)
	{	
		int sum=0,count=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				sum = a[i]+a[j];
				if (sum == n) {
					count++;
				}
			}
		}
		if (count == 1)
			return 1;
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int check=0,n=0;
		Scanner scannerObj = new Scanner(System.in);
		System.out.println("Enter the length of array: ");
		int size = scannerObj.nextInt();
		if (size < 2) {
			System.out.println("Program terminated: Array at least contain 2 elements.");
			System.exit(0);
		}
		int arr[] = new int[size];
		System.out.println("Enter array elements: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter "+i+"th element of array: ");
			arr[i] = scannerObj.nextInt();
		}
		System.out.println("Enter the value of n: ");
		n = scannerObj.nextInt();
		Practice12 practice12 = new Practice12();
		check = practice12.isNUnique(arr, n);
		if (check == 1)
			System.out.println("Given array is "+n+"-unique");
		else
			System.out.println("Given array is not "+n+"-unique");
	}

}
