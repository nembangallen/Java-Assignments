package assignment;

import java.util.Scanner;

public class Centered15 {
	public int isCentered15(int[] a)
	{	
		int sum=0,i=1;
		if (a.length % 2 == 1) {  // {3, 2, 10, 4, 1, 6, 9}
			sum = a[a.length/2];
			if (sum == 15) {
				return 1;
			}else if(sum > 15)
			{
				return 0;
			}else {
				while(sum < 15)
				{
					sum += a[a.length/2 - i] + a[a.length/2 + i];
					if (sum == 15) {
						return 1;
					}
					i++;
					if (i > a.length/2) {
						break;
					}
				}
			}
		}else {    // {2, 10, 4, 1, 6, 9}
				   // {0, 1,  2, 3, 4, 5}
			i = 0;
			while(sum < 15)
			{
				sum += a[a.length/2 + i] + a[a.length/2-1-i];
				if (sum == 15) {
					return 1;
				}
				i++;
				if (i > a.length/2 - 1) {
					break;
				}
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner scannerObj = new Scanner(System.in);
		System.out.println("Enter the length of array: ");
		int num = scannerObj.nextInt();
		int arr[] = new int[num];
		System.out.println("Enter array elements: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter "+i+"th element of array: ");
			arr[i] = scannerObj.nextInt();
		}
		Centered15 centered15 = new Centered15();
		if (centered15.isCentered15(arr) == 1) {
			System.out.println("Array is centered-15");
		}else {
			System.out.println("Array is not centered-15");
		}
	}
}
