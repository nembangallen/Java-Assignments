/*
 * Qn: 6
 * Author: Allen Nembang
 */
package assignment;

import java.util.Scanner;

public class GuthrieSequence {
	int isGuthrieSequence(int[] a)
	{	
		int returnValue=0;
		int nextItem = a[0];
		if (a[a.length-1] == 1) {
			for (int i = 0; i < a.length; i++) {
				if (nextItem == a[i]) {
					if (a[i] % 2 == 0) {
						nextItem = a[i] / 2;
					}else {
						nextItem = a[i]*3+1;
					}
					returnValue = 1;
				}else {
					returnValue = 0;
					break;
				}
			}
		}
		return returnValue;
	}
	public static void main(String[] args) {
		int isGuthrie=0;
		Scanner scannerObj = new Scanner(System.in);
		System.out.println("Enter the length of array: ");
		int num = scannerObj.nextInt();
		GuthrieSequence guthrieSequence = new GuthrieSequence();
		int arr[] = new int[num];
		System.out.println("Enter array elements: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter "+i+"th element of array: ");
			arr[i] = scannerObj.nextInt();
		}
		isGuthrie = guthrieSequence.isGuthrieSequence(arr);
		if (isGuthrie == 1)
			System.out.println("Given array is Guthrie sequence.");
		else
			System.out.println("Given array is not a Guthre sequence.");
	}
}
