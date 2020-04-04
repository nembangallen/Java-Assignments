/*
 * Qn 9
 */
package assignment;

import java.util.Scanner;

public class Slove10 {
	static int factorial(int n)
	{
		if(n==0)
			return 1;
		else
			return (n*factorial(n-1));
	}
	public int[] solve10(int x,int y)
	{	
		int xFact = factorial(x);
		int yFact = factorial(y);
		int tFact = factorial(10);
		int sum = xFact+yFact;
		int ar[] = new int[2];
		if (sum == tFact) {
			ar[0] = x;
			ar[1] = y;
		}else {
			System.out.println("Not satisfied the condition.");
			System.exit(0);
		}
		return ar;
	}
	public static void main(String[] args) {
		int x=0,y=0;
		Scanner scannerObj = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		x = scannerObj.nextInt();
		y = scannerObj.nextInt();
		Slove10 slove10 = new Slove10();
		int ar[] = new int[2];
		ar = slove10.solve10(x,y);
		
	}
}
