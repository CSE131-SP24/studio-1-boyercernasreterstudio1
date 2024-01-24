package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter integer 1 to be averaged:");
		int n1 = in.nextInt();
		System.out.print("Enter integer 2 to be averaged:");
		int n2 = in.nextInt();
		System.out.print("The calculated average is "+(n1+n2)/2.0);
	}

}
