/*
 * Qn 8
 * Description: Count SumFactor
 * Author: Allen Nembang
 */
package assignment;

import java.util.Scanner;

public class SumFactor {
	public int sumFactor(int[] a)
	{	
		int sum = 0,count=0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] == sum) {
				count++;
			}
		}
		return count;
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
		SumFactor sumFactor = new SumFactor();
		System.out.println("Sum factor of the given array is: "+sumFactor.sumFactor(arr));
	}
}
