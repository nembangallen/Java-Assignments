/*
 * Qn: 7
 * Description:
 * Author: Allen Nembang
 */
package assignment;
import java.util.Scanner;
public class StantonMeasure {
	public int stantonMeasure(int[] a)
	{	
		int oneCount = 0,measure=0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 1) {
				oneCount++;
			}
		}
		for (int j = 0; j < a.length; j++) {
			if (a[j]==oneCount) {
				measure++;
			}
		}
		return measure;
	}
	public static void main(String[] args) {
		Scanner scannerObj = new Scanner(System.in);
		System.out.println("Enter the length of array: ");
		int num = scannerObj.nextInt();
		int arr[] = new int[num];
		System.out.println("Enter array elements: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter "+i+"th element of array: ");
			arr[i] = scannerObj.nextInt();
		}
		StantonMeasure stantonMeasure = new StantonMeasure();
		System.out.println("Statnton measure of given array element is: "+stantonMeasure.stantonMeasure(arr));
	}
	
}
