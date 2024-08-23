package com.vti.frontend;

import java.util.Scanner;

public class Method {
	// Q4: Viết 1 method nhập vào 2 số nguyên a và b và trả về thương của chúng
	public static void question4() {
		int a, b;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Số nguyên a = ");
		a = scanner.nextInt();
		do {
			System.out.println("Số nguyên b = ");
			b = scanner.nextInt();
			if (b == 0) {
				System.out.println("Số nguyên b yêu cầu khác 0!");
			}
		} while (b == 0);
		scanner.close();
		System.out.println("Thương của 2 số là: " + (float) a / (float) b);

	}

}
