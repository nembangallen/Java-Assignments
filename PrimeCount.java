package assignment;

import java.util.Scanner;

public class PrimeCount {
	public int primeCount(int start, int end)
	{	
		int num=0;

		for (int i = start; i <= end; i++) {
			int flag=0;
			if (i == 1 || i == 0)
				continue;
			for (int j = 2; j <= i/2; ++j) {
				if (i%j == 0) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				num++;
			}
		}
		return num;
	}
	public static void main(String[] args) {
		int start=0, end=0, num=0;
		PrimeCount primeObj = new PrimeCount();
		Scanner scannerObj = new Scanner(System.in);
		System.out.println("Please enter positive start number: ");
		start = scannerObj.nextInt();
		System.out.println("Please enter positive end number: ");
		end = scannerObj.nextInt();
		if (end <= start) {
			System.out.println("Please enter end number greater than start.");
		}else if(end == 0) {
			System.out.println("Please enter valid number:greater than 0 and start.");
		}else {
//			primeObj.primeCount(start,end);
			num = primeObj.primeCount(start,end);
			System.out.println("Number of prime numbers between start and end number is: "+num);
		}
	}
}
