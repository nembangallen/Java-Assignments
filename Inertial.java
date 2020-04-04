/**
 * Description: If the given array is inertial or not.
 * Author: Allen Nembang
 */
package assignment;

import java.util.Scanner;

public class Inertial {
	
	public int isInertial(int[] a)
	{	
		int flag=0,max=0,temp,retVal=0,evenNum=0,oddNum=0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 1) {
				flag = 1;
				break;
			}
		}
		if(flag == 0) {
			System.out.println("Sorry, this array is not Inertial, "
					+ "since it doesn't contain odd value.");
			System.exit(0);
		}else {
			for (int i = 0; i < a.length; i++) {
				if (a[i] > max) {
					max = a[i];
				}
			}
			if (max % 2 == 0) {
//				Sorting in ascending order
				for (int i = 0; i < a.length; i++) {
					for (int j = i+1; j < a.length; j++) {
						if (a[i] > a[j]) {
							temp = a[i];
							a[i] = a[j];
							a[j] = temp;
						}
					}
				}
//				get the lowest even value
				for (int i = 0; i < a.length; i++) {
					if (a[i] % 2 == 0) {
						evenNum = a[i];
						break;
					}
				}
//				get the lowest odd value
				for (int i = 0; i < a.length; i++) {
					if (a[i] % 2 == 1) {
						oddNum = a[i];
						break;
					}
				}
				if (oddNum > evenNum) {
					retVal = 1;
				}
			}
		}
		return retVal;
	}
	
	public static void main(String[] args) {
		Scanner scannerObj = new Scanner(System.in);
		System.out.println("Enter the size of array that is to be created: ");
		int size = scannerObj.nextInt();
		
		int[] arr = new int[size];
		int value=0;
		System.out.println("Enter the numbers of array: ");
//		Taking user input 
		for (int i = 0; i < size; i++) {
			arr[i] = scannerObj.nextInt();
		}
		Inertial inertial = new Inertial();
		value = inertial.isInertial(arr);
		if (value == 1)
			System.out.println("Array is inertial");
		else
			System.out.println("Array is not inertial");
	}
}
