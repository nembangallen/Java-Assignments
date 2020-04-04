package assignment;

import java.util.Scanner;

public class Practice13 {
	public int isSquare(int n)
	{	
		for (int i = 1; i < n; i++) {
			if (n/i == i) {
				return 1;
			}
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		Scanner scannerObj = new Scanner(System.in);
		System.out.println("Enter positive number to check square or not: ");
		num = scannerObj.nextInt();
		if (num < 0) {
			System.out.println("Program terminated: Please enter positive number.");
			System.exit(0);
		}
		Practice13 practice13 = new Practice13();
		if (practice13.isSquare(num) == 1)
			System.out.println(num+" is a square number.");
		else
			System.out.println(num+" is not a square number.");
	}

}
