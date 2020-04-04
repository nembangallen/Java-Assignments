/* 
 * Qn. 4
 * Description: A JAVA program to count number of square pairs.
 * Author: Allen Nembang
 */
package assignment;

import java.util.Scanner;

public class SquarePair {
	
    static boolean isPerfectSquare(int n) 
    { 
        for (int i = 1; i * i <= n; i++) { 
  
            // If (i * i = n) 
            if ((n % i == 0) && (n / i == i)) { 
                return true; 
            } 
        } 
        return false; 
    } 
	
	public int countSquarePairs(int[] a)
	{	
		int temp=0,flag=0,sum=0, totalPair=0;
//		Sorting in ascending order
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		for (int j = 0; j < a.length; j++) {
			if (a[j] == a[j+1]) {
				System.out.println("Duplicate entries, program is terminated...");
				System.exit(0);
			}
			flag = 1;
			break;
		}
		
		if (flag == 1) {
//			System.out.println("Flag 1");
			for (int i = 0; i < a.length; i++) {
				for (int j = i+1; j < a.length; j++) {
//					System.out.println(a[i] + " "+ a[j]);
					sum = a[i] + a[j];
					if (isPerfectSquare(sum)) {
						totalPair++;
					}
				}
			}
		}

		return totalPair;
	}
	
	public static void main(String[] args) {
		Scanner scannerObj = new Scanner(System.in);
		System.out.println("Enter the size of array that is to be created: ");
		int size = scannerObj.nextInt();
		if (size <= 1) {
			System.out.println("Status: Terminated. More than single element is required.");
			System.exit(0);
		}
			
		int[] arr = new int[size];
		int value =0;
		System.out.println("Enter the numbers of array: ");
//		Taking user input 
		for (int i = 0; i < size; i++) {
			arr[i] = scannerObj.nextInt();
		}
		SquarePair squareObj = new SquarePair();
		value = squareObj.countSquarePairs(arr);
		System.out.println("No. of square pair: "+value);
	}
}
