package fdsafdsa;

import java.util.Scanner;

public class 시작값부터종료값까지의합계 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("시작값을 입력하세요: ");
		int x = scanner.nextInt();
		System.out.print("종료값을 입력하세요: ");
		int y = scanner.nextInt();

		int sum = 0;

		if (x > y) {
			int temp = x;
			x = y;
			y = temp;
		}

		for (int i = x; i <= y; i++) {
			sum = sum + i;
		}

		System.out.println(x + "부터 " + y + "까지의 합계는 " + sum + "입니다.");
	}

}
