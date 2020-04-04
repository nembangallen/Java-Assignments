/*
 * Qn: 5
 * Description: A Program to find Porcupine Number
 */
package assignment;

import java.util.Scanner;

public class PorcupineNumber {
	static boolean isPrime(int n)
	{	
		int flag=0;
		for (int i = 2; i <= n/2; i++) {
			if (n%i == 0) {
				flag = 1;
				break;
			}
		}
		if (flag == 0)
			return true;
		else
			return false;
	}
	int findPorcupineNumber(int n)
	{
		int flag = 1,x=0,returnValue=0;
		if (isPrime(n)) {
			while(flag == 1)
			{
				n++;
				x=n;
				if (isPrime(n)) {
					if (x % 10 == 9) {
						returnValue = x;
						flag = 0;
						break;	
					}
				}
			}
		}else {
			System.out.println("Given number is not a prime number");
			System.exit(0);
		}
		return returnValue;
	}
	public static void main(String[] args) {
		Scanner scannerObj = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scannerObj.nextInt();
		PorcupineNumber porcupineNumber = new PorcupineNumber();
		System.out.println("Porcupine Number is: "+porcupineNumber.findPorcupineNumber(num));
	}
}
