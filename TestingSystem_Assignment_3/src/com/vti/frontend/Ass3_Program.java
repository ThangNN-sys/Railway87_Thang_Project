package com.vti.frontend;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

import com.vti.entity.Account;

public class Ass3_Program {
	public static void main(String[] args) {

		System.out.println("+---Excercise 1---+");

// Excercise 1 - Question 1: khai báo số lương và làm tròn bằng int
		System.out.println("+---Excercise 1---Question 1---+");
		float salary1;
		float salary2;
		salary1 = 5240.5f;
		salary2 = 10970.055f;
		int salary1Int = (int) salary1;
		int salary2Int = (int) salary2;
		System.out.println("Lương làm tròn của account 1 là: " + salary1Int);
		System.out.println("Lương làm tròn của account 2 là: " + salary2Int);

// Excercise 1 - Question 2: Lấy ngẫu nhiên 1 số có 5 chữ số (số có < 5 chữ số sẽ thêm số 0 ở đầu cho đủ 5 chữ số)		
		System.out.println("+---Excercise 1---Question 2---+");
		Random random = new Random();
		int randomNumber = random.nextInt(100000);
		System.out.printf("Số ngẫu nhiên được chọn là: %05d", randomNumber);
		System.out.println(" ");

// Excercise 1 - Question 3: Lấy 2 số cuối kết quả của Question 2 và in ra
		System.out.println("+---Excercise 1---Question 3---+");
		// Cách 1: convert số đó ra String, sau đó lấy 2 số cuối
		String x = String.valueOf(randomNumber);
		System.out.println("Hai số cuối của số ngẫu nhiên là: " + x.substring(3));
		// Cách 2: chia lấy dư số đó cho 100
		// double m = (double) randomNumber;
		// System.out.printf("%0.2f", m/100);

// Excercise 1 - Question 4: Viết 1 method nhập vào 2 số nguyên a và b và trả về thương của chúng
		System.out.println("+---Excercise 1---Question 4---+");
		System.out.println("+---Tìm thương của hai số a & b---+");
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

// Excercise 2 - Question 1: tạo 1 array Account và khởi tạo 5 phần tử theo cú pháp
		System.out.println("+---Excercise 2---Question 1---+");
		System.out.println("+---Khởi tạo 5 phần tử bằng array Accout---+");
		Account[] accArray = new Account[5];
		for (int i = 0; i < accArray.length; i++) {
			Account acc = new Account();
			acc.email = "Email " + i;
			acc.userName = "User Name " + i;
			acc.fullName = "Full Name " + i;
			acc.creatDate = LocalDate.now();
			accArray[i] = acc;
			System.out.println(
					"Thông tin account " + i + ", Email: " + accArray[i].email + ", User Name: " + accArray[i].userName
							+ ", Full Name: " + accArray[i].fullName + ", Creat Date: " + accArray[i].creatDate);
		}

// Excercise 3 - Question1: khởi tạo lương, convert ra float và hiển hị lên màn hình
		Integer salary = 5000;
		System.out.printf("%.2f", (float) salary);
		System.out.println(" ");

// Excercise 3 - Question 2: Khai báo 1 String "1234567", convert String ra int
		String number = "1234567";
		int numberInt = Integer.parseInt(number);
		System.out.println("Số đã chuyển đổi Q2: " + numberInt);

// Excercise 3 - Question 3: khởi tạo 1 số Integer = "1234567", convert số trên thành datatype int
		Integer number2 = 1234567;
		int numberInt2 = number2.intValue();
		System.out.println("Số đã chuyển đổi Q3: " + number2);

// Excercise 4 - Question 1: Nhập 1 xâu ký tự, đếm các từ trong ký tự đó

// Excercise 4 - Question 2: Nhập 2 xâu ký tự s1, s2, nối xâu ký tự s2 vào sau s1
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Nhập vào chuỗi 1: ");
//		String s1 = sc.nextLine();
//		System.out.println("Nhập vào chuỗi 2: ");
//		String s2 = sc.nextLine();
//		sc.close();
//		System.out.println("Kết quả nối 2 chuỗi là: " + s1 + s2);

// Excercise 4 - Question 3: viết chương trình để người dùng nhập vào tên và kiểm tra, nếu tên chưa viết hoa chữ cái đầu thì viết hoa lên
//		Scanner scanner1 = new Scanner(System.in);
//		System.out.println("Mời nhập tên: ");
//		String name = scanner1.next();
//		String firstCharacter = name.substring(0, 1).toUpperCase();
//		String leftCharacter = name.substring(1);
//		System.out.println("char at" + name.charAt(1));
//		name = firstCharacter + leftCharacter;
//		System.out.println(name);
//		scanner1.close();

	}

}
