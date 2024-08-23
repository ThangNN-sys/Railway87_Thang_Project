package com.vti.frontend;

import java.util.Scanner;

public class Ass_3_Excercise_4 {
	public static void main(String[] args) {

		System.out.println("+---Excercise 4---String---+");
// Excercise 4 - Question 1: Nhập 1 chuỗi ký tự, đếm các từ trong ký tự đó
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập chuỗi ký tự: ");
		String s1 = scanner.nextLine();
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != ' ') {
				i++;
			}
		}
		System.out.println("Số ký tự của chuỗi: " + s1.length());
		scanner.close();

	}

	// Excercise 4 - Question 2: Nhập 2 xâu ký tự s1, s2, nối xâu ký tự s2 vào sau
	// s1
//			Scanner sc = new Scanner(System.in);
//			System.out.println("Nhập vào chuỗi 1: ");
//			String s1 = sc.nextLine();
//			System.out.println("Nhập vào chuỗi 2: ");
//			String s2 = sc.nextLine();
//			sc.close();
//			System.out.println("Kết quả nối 2 chuỗi là: " + s1 + s2);

	// Excercise 4 - Question 3: viết chương trình để người dùng nhập vào tên và
	// kiểm tra, nếu tên chưa viết hoa chữ cái đầu thì viết hoa lên
//			Scanner scanner1 = new Scanner(System.in);
//			System.out.println("Mời nhập tên: ");
//			String name = scanner1.next();
//			String firstCharacter = name.substring(0, 1).toUpperCase();
//			String leftCharacter = name.substring(1);
//			System.out.println("char at" + name.charAt(1));
//			name = firstCharacter + leftCharacter;
//			System.out.println(name);
//			scanner1.close();
}
