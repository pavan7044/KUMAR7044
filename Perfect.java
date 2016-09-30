package java9;

import java.util.Scanner;

public class Perfect {

	public boolean isPerfectNumber(int number) {
		int temp = 0;
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();

		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0) {
				temp += i;
			}
		}
		if (temp == number) {
			System.out.println("It is a perfect number");
			return true;
		} else {
			System.out.println("It is not a perfect number");
			return false;
		}
	}

	public static void main(String a[]) {
		Perfect ipn = new Perfect();
		System.out.println("Is perfect number: " + ipn.isPerfectNumber(88));
	}

}
