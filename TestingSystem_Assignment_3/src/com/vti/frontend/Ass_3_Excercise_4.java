package com.vti.frontend;

import java.util.Scanner;

public class Ass_3_Excercise_4 {
	public static void main(String[] args) {

		System.out.println("+---Excercise 4---String---+");
// Q1: Nhập 1 chuỗi ký tự, đếm các từ trong ký tự đó
		System.out.println("+---Excercise 4---Question 1---+");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập chuỗi ký tự: ");
		String q1 = scanner.nextLine();
		System.out.println("Số ký tự của chuỗi: " + q1.length());
//		scanner.close(); //trong 1 file class, chỉ đóng scanner một lần duy nhất
// Q2: Nhập hai xâu kí tự s1, s2 nối xâu kí tự s2 vào sau xâu s1;
		System.out.println(" ");
		System.out.println("+---Excercise 4---Question 2---+");
		Scanner scanner2 = new Scanner(System.in);
		System.out.println("Nhập chuỗi ký tự s1: ");
		String s1 = scanner2.nextLine();
		System.out.println("Nhập chuỗi ký tự s2: ");
		String s2 = scanner2.nextLine();
		System.out.println("Chuỗi ký tự s1 và s2 sau khi gộp là: " + s1 + s2);
//		scanner2.close();
//Q3: Viết chương trình để người dùng nhập vào tên và kiểm tra, nếu tên chưa viết hoa chữ cái đầu thì viết hoa lên
		System.out.println(" ");
		System.out.println("+---Excercise 4---Question 3---+");
		Scanner scanner3 = new Scanner(System.in);
		System.out.println("Mời nhập tên: ");
		String nameQ3 = scanner3.next();
		String firstCharacterQ3 = nameQ3.substring(0, 1).toUpperCase();
		String leftCharacterQ3 = nameQ3.substring(1);
		nameQ3 = firstCharacterQ3 + leftCharacterQ3;
		System.out.println("Tên của bạn là: " + nameQ3);
//		scanner3.close();
// Q4: Viết chương trình để người dùng nhập vào tên và in từng ký tự trong tên của người dùng ra 
		System.out.println(" ");
		System.out.println("+---Excercise 4---Question 4---+");
		Scanner scanner4 = new Scanner(System.in);
		System.out.println("Mời nhập tên: ");
		String nameQ4 = scanner4.next();
		String firstCharacterQ4 = nameQ4.substring(0, 1).toUpperCase();
		String leftCharacterQ4 = nameQ4.substring(1);
		nameQ4 = firstCharacterQ4 + leftCharacterQ4;
		for (int j = 0; j < nameQ4.length(); j++) {
			System.out.println("Ký tự thứ " + (j + 1) + " là: " + nameQ4.charAt(j));
		}
//		scanner4.close();
//Q5: Viết chương trình để người dùng nhập vào họ, sau đó yêu cầu người dùng nhập vào tên và hệ thống sẽ in ra họ và tên đầy đủ
		System.out.println(" ");
		System.out.println("+---Excercise 4---Question 5---+");
		Scanner scanner5 = new Scanner(System.in);
		System.out.println("Mời nhập họ: ");
		String lastNameQ5 = scanner5.next();
		System.out.println("Mời nhập tên: ");
		String firstNameQ5 = scanner5.next();
		System.out.println("Họ tên đầy đủ là: " + lastNameQ5 + " " + firstNameQ5);
//		scanner5.close();
// Q6: Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và sau đó hệ thống sẽ tách ra họ, tên , tên đệm 
		System.out.println(" ");
		System.out.println("+---Excercise 4---Question 6---+");
		String fullNameQ6;
		String lastNameQ6 = "", middleNameQ6 = "", firstNameQ6 = "";
		Scanner scanner6 = new Scanner(System.in);
		System.out.println("Nhập họ tên đầy đủ: ");
		fullNameQ6 = scanner6.nextLine();
		fullNameQ6 = fullNameQ6.trim();
		String[] words = fullNameQ6.split(" ");
		lastNameQ6 = words[0];
		firstNameQ6 = words[words.length - 1];
		for (int i = 0; i <= words.length - 2; i++) {
			middleNameQ6 = words[i] + " ";
		}
		System.out.println("Họ là: " + lastNameQ6);
		System.out.println("Đệm là: " + middleNameQ6);
		System.out.println("Tên là: " + firstNameQ6);
//		scanner6.close();
// Q7: Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và chuẩn hóa họ và tên của họ như sau: 
//	a) Xóa dấu cách ở đầu và cuối và giữa của chuỗi người dùng nhập vào 
//		VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ chuẩn hóa thành "nguyễn văn nam" 
//	b) Viết hoa chữ cái mỗi từ của người dùng 
//		VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ chuẩn hóa thành "Nguyễn Văn Nam"
		System.out.println(" ");
		System.out.println("+---Excercise 4---Question 6---+");
		String fullNameQ7;
		String firstCharacterQ7;
		String leftCharacterQ7;
		Scanner scanner7 = new Scanner(System.in);
		System.out.println("Nhập họ tên đầy đủ:");
		fullNameQ7 = scanner7.nextLine();
		fullNameQ7 = fullNameQ7.trim();
		fullNameQ7 = fullNameQ7.replaceAll("\\s+", " ");
		System.out.println("Họ tên đầy đủ: " + fullNameQ7);
		String[] wordsQ7 = fullNameQ7.split(" ");
		fullNameQ7 = "";
		for (String wordQ7 : wordsQ7) {
			firstCharacterQ7 = wordQ7.substring(0, 1).toUpperCase();
			leftCharacterQ7 = wordQ7.substring(1);
			wordQ7 = firstCharacterQ7 + leftCharacterQ7;
			fullNameQ7 += wordQ7 + " ";
		}
		System.out.println("Họ tên sau khi chuẩn hóa: " + fullNameQ7);
		scanner7.close();
	}

}
