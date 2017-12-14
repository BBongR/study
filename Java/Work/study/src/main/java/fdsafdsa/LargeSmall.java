package fdsafdsa;

import java.util.Scanner;

public class LargeSmall {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		if (n >= 100) {
			System.out.println("large");
		} else {
			System.out.println("small");
		}
	}

}
