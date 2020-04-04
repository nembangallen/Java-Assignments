/*
 * Qn: 14
 * Description: Check whether the user's input is a stacked number or not.
 * 				a stacked number to be a number that is the sum of the first 
 * 				n positive integers for some n
 * Author: Allen Nembang
 */
package assignment;

import java.util.Scanner;

public class Practice14 {
	public int isStacked(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum+=i;
			if (sum == n) {
				return 1;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		int num=0;
		Scanner scannerObj = new Scanner(System.in);
		System.out.println("Enter positive number to check stacked or not: ");
		num = scannerObj.nextInt();
		Practice14 practice14 = new Practice14();
		if (practice14.isStacked(num) == 1) {
			System.out.println(num+" is a stacked number.");
		}else
			System.out.println(num+" is not a stacked number.");
	}
}
