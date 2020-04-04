/*
 * Qn 19/20 
 * Author : Allen Nembang
 */
package assignment;

import java.util.Scanner;

public class Practice20 {
	static boolean check121Array(int[] ar)
	{	
		boolean retValue=false;
		int count1=0,count2=0;
		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == 1) {
				count1++;
			}
			if (ar[i] == 2) {
				count2++;
			}
		}
		if (count1 == ar.length || count2 == ar.length) {
			retValue = false;
		}else
			retValue = true;
		return retValue;
	}
	
	int is121Array(int[] a)
	{
		int index1 =0,retVal=0;
		int newIndex =0;
		int count1=0;
		int count2=0;
		int y=0;
		
		if (!check121Array(a)) {
			System.out.println("Failed: Array contains only 1s or 2s.");
			System.exit(0);
		}
		
//		For loop
		for (int i = 0; i < a.length; i++) {
//			if statement: counting the first 1s before 2
			if (a[i] == 1) {
				index1++;
			}else {
				break;
			}
		}
		// new index for checking numbers of 1 after 2
		newIndex = (a.length-1) - index1;
		
		for (int i = a.length-1; i > newIndex; i--) {
			if (a[i] == 1) {
				count1++;
			}
		}
		
		// check whether number of appearance of 1s before and after 2s is equal
		if (count1 == index1) {
			for (int i = index1; i <= newIndex; i++) {
				if (a[i] == 2) {
					count2++;
				}
			}
			y = (newIndex-index1) + 1;
			if (count2 == y) {
				retVal = 1;
			}
		}
		return retVal;
	}
	public static void main(String[] args) {
		int inputVal=0,returnVal=0;
		Scanner scannerObj = new Scanner(System.in);
		System.out.println("Enter the length of array: ");
		int num = scannerObj.nextInt();
		int arr[] = new int[num];
		System.out.println("Enter only 1 or 2 numbers: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter "+i+"th element of array: ");
			inputVal = scannerObj.nextInt();
			if (inputVal == 1 || inputVal == 2) {
				arr[i] = inputVal;
			}else {
				System.out.println("Status:Error"
						+ " You have entered numbers expect than 1 or 2");
				System.exit(0);
			}
		}
		Practice20 practice20 = new Practice20();
		returnVal = practice20.is121Array(arr);
		if (returnVal == 1)
			System.out.println("Array is a 121 array.");
		else
			System.out.println("Array is not a 121 array.");
	}
}
