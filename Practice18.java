package assignment;

import java.util.Scanner;

public class Practice18 {
	public int getExponent(int n, int p)
	{	
		int x = 0,y=0,z=0;
//		x=n/2;
		if (n%2 == 0) {
			x=n/2;
			do {
				y = x/p; // y = 125/5 y=25 // y = 25/5 = 5 // y = 5/5 = 1
				x=y;  // x = 25 // x=5
				z++; // z=1  // 2 // z=3
			} while (y>=p);
			
		}else {
			x=n;
			do {
				y = x/p; // y = 27/3 = 9 // 
				x=y; // x=9 
				z++; // z=1
			} while (y>=p);
			
		}
		return z;
	}
	
	public static void main(String[] args) {
		int n=0,p=0;
		int x;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number(n) and p: ");
		n = scanner.nextInt();
		p = scanner.nextInt();
		Practice18 practice18 = new Practice18();
		System.out.println("Largest exponent x is: "+practice18.getExponent(n, p));
	}
}
