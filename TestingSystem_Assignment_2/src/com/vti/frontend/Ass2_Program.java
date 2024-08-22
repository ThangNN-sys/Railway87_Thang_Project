package com.vti.frontend;

import java.time.LocalDate;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Group;
import com.vti.entity.GroupAccount;
import com.vti.entity.Position;
import com.vti.entity.Position.PositionName;

public class Ass2_Program {
	public static void main(String[] args) {

// Tạo dữ liệu để thực thi
		Department dep1 = new Department();
		dep1.depId = 1;
		dep1.depName = "Hành Chính";

		Department dep2 = new Department();
		dep2.depId = 2;
		dep2.depName = "Bảo Vệ";

		Department dep3 = new Department();
		dep3.depId = 3;
		dep3.depName = "Tài Chính";

		Position pos1 = new Position();
		pos1.posId = 1;
		pos1.posName = PositionName.Dev;

		Position pos2 = new Position();
		pos2.posId = 2;
		pos2.posName = PositionName.Test;

		Position pos3 = new Position();
		pos3.posId = 3;
		pos3.posName = PositionName.Scrum_Master;

		Position pos4 = new Position();
		pos4.posId = 4;
		pos4.posName = PositionName.PM;

		Account acc1 = new Account();
		acc1.accId = 1;
		acc1.email = "acc1@gmail.com";
		acc1.userName = "UserNameAcc1";
		acc1.fullName = "Full Name Acc1";
		acc1.department = dep1;
		acc1.position = pos1;
		acc1.createDate = LocalDate.now();

		Account acc2 = new Account();
		acc2.accId = 2;
		acc2.email = "acc2@gmail.com";
		acc2.userName = "UserNameAcc2";
		acc2.fullName = "Full Name Acc2";
		acc2.department = dep2;
		acc2.position = pos2;
		acc2.createDate = LocalDate.now();

		Account acc3 = new Account();
		acc3.accId = 3;
		acc3.email = "acc3@gmail.com";
		acc3.userName = "UserNameAcc3";
		acc3.fullName = "Full Name Acc3";
		acc3.department = dep3;
		acc3.position = pos3;
		acc3.createDate = LocalDate.now();

		Group gru1 = new Group();
		gru1.groupId = 1;
		gru1.groupName = "Group1";
		gru1.creatorAcc = acc1;
		gru1.createDate = LocalDate.now();

		Group gru2 = new Group();
		gru2.groupId = 2;
		gru2.groupName = "Group2";
		gru2.creatorAcc = acc2;
		gru2.createDate = LocalDate.now();

		Group gru3 = new Group();
		gru3.groupId = 3;
		gru3.groupName = "Group3";
		gru3.creatorAcc = acc2;
		gru3.createDate = LocalDate.now();

		GroupAccount gra1 = new GroupAccount();
		gra1.groupAccId = gru1.groupId;
		gra1.accountId = acc1;
		gra1.joinDate = LocalDate.now();

		GroupAccount gra2 = new GroupAccount();
		gra2.groupAccId = gru2.groupId;
		gra2.accountId = acc2;
		gra2.joinDate = LocalDate.now();

		GroupAccount gra3 = new GroupAccount();
		gra3.groupAccId = gru3.groupId;
		gra3.accountId = acc3;
		gra3.joinDate = LocalDate.now();

//Question 1: kiểm tra phòng ban của account thứ 2

		System.out.println("+---Excercise 2---Question 1---+");
		System.out.println("Kiểm tra phòng ban của account 2");
		if (acc2.department == null) {
			System.out.println("Nhân viên này chưa có phòng ban");
		} else {
			System.out.println("Phòng ban của nhân viên này là: " + acc2.department.depName);
		}

// Question 2: kiểm tra group của account thứ 2

		System.out.println("+---Excercise 2---Question 2---+");
		if (acc2.groups == null) {
			System.out.println("Nhân viên này chưa có group");
		} else if (acc2.groups.length == 2) {
			System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
		} else if (acc2.groups.length == 3) {
			System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
		} else {
			System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
		}

// Question 3: Sử dụng toán tử tennary để làm Question 1
		System.out.println("+---Excercise 2---Question 3---+");
		System.out.println(acc2.department == null ? "Nhân viên này chưa có phòng ban"
				: "Phòng ban của nhân viên này là: " + acc2.department.depName);

// Question 4: Sử dụng toán tử tennary để kiểm tra position của account thứ 1
		System.out.println("+---Excercise 2---Question 4---+");
		System.out.println(
				acc1.position.posName == PositionName.Dev ? "Đấy là Developer" : "Người này không phải là Developer");

// Question 5: Lấy ra số lượng account trong nhóm thứ 1 và in ra theo format
		System.out.println("+---Excercise 2---Question 5---+");
		if (gra1.accounts == null) {
			System.out.println("Nhóm này chưa có thành viên");
		} else {
			switch (gra1.accounts.length) {
			case 1:
				System.out.println("Nhóm có một thành viên");
				break;
			case 2:
				System.out.println("Nhóm có hai thành viên");
				break;
			case 3:
				System.out.println("Nhóm có ba thành viên");
				break;
			default:
				System.out.println("Nhóm có nhiều thành viên");
				break;
			}

		}

// Question 6: Sử dụng switch case để làm lại Question 2
		System.out.println("+---Excercise 2---Question 6---+");
		if (acc2.groups == null) {
			System.out.println("Nhân viên này chưa có group");
		} else {
			switch (acc2.groups.length) {
			case 2:
				System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
				break;
			case 3:
				System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
				break;
			default:
				System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
				break;
			}
		}

		// Question 7: Sử dụng switch case để làm lại Question 4
		System.out.println("+---Excercise 2---Question 7---+");
		if (acc1.position == null) {
			System.out.println("Nhân viên này chưa có chức danh");
		} else {
			switch (acc1.position.posName) {
			case Dev:
				System.out.println("Đấy là Developer");
				break;
			default:
				System.out.println("Người này không phải là Developer");
				break;
			}
		}

// Question 8: in ra thông tin các account bao gồm: Email, fullname và tên phòng ban của họ
		System.out.println("+---Excercise 2---Question 8---+");
		Account[] accArray = { acc1, acc2, acc3 };
		for (Account account : accArray) {
			System.out.println("Email: " + account.email + ", " + "Full Name: " + account.fullName + ", "
					+ "Tên phòng ban của người này là: " + account.department.depName);
		}
// Question 9: In ra thông tin các phòng ban bao gồm id và name		
		System.out.println("+---Excercise 2---Question 9---+");
		Department[] depArray = { dep1, dep2, dep3 };
		for (Department department : depArray) {
			System.out.println(
					"Department ID: " + department.depId + ", " + "Tên của phòng ban là: " + department.depName);
		}
// Q10: In ra thông tin các account bao gồm: Email, Fullname và tên phòng ban của họ
		System.out.println(" ");
		System.out.println("+---Excercise 2---Question 10---+");
		Account[] accArray1 = { acc1, acc2 };
		for (int i = 0; i < accArray1.length; i++) {
			System.out.println("Thông tin account thứ " + (i + 1) + " là:");
			System.out.println("Email: " + accArray1[i].email);
			System.out.println("FullName: " + accArray1[i].fullName);
			System.out.println("Tên phòng ban: " + accArray1[i].department.depName);

		}
// Q11: In ra thông tin các phòng ban bao gồm: Id và name
		System.out.println(" ");
		System.out.println("+---Excercise 2---Question 11---+");
		Department[] depArray1 = { dep1, dep2, dep3 };
		for (int i = 0; i < depArray1.length; i++) {
			System.out.println("Thông tin phòng ban thứ " + (i + 1) + " là");
			System.out.println("ID: " + depArray1[i].depId);
			System.out.println("Tên phòng ban: " + depArray1[i].depName);

		}
// Q12: Chỉ in ra thông tin 2 department đầu tiên như định dạng của Q10
		System.out.println(" ");
		System.out.println("+---Excercise 2---Question 12---+");
		for (int i = 0; i < 2; i++) {
			System.out.println("Thông tin phòng ban thứ " + (i + 1) + " là");
			System.out.println("ID: " + depArray1[i].depId);
			System.out.println("Tên phòng ban: " + depArray1[i].depName);
		}
// Q13: In ra thông tin tất cả account ngoại trừ account thứ 2
		System.out.println(" ");
		System.out.println("+---Excercise 2---Question 13---+");
		Account[] accArray2 = { acc1, acc2, acc3 };
		for (int i = 0; i < accArray2.length; i++) {
			if (i != 1) {
				System.out.println("Thông tin account thứ " + (i + 1) + " là:");
				System.out.println("Email: " + accArray2[i].email);
				System.out.println("FullName: " + accArray2[i].fullName);
				System.out.println("Tên phòng ban: " + accArray2[i].department.depName);
			}
		}
//Q14: In ra thông tin tất cả các account có id < 4
		System.out.println(" ");
		System.out.println("+---Excercise 2---Question 14---+");
		Account[] accArray3 = { acc1, acc2, acc3 };
		for (int i = 0; i < accArray3.length; i++) {
			if (accArray3[i].accId < 4) {
				System.out.println("Thông tin account thứ " + (i + 1) + " là:");
				System.out.println("ID: " + accArray3[i].accId);
				System.out.println("Email: " + accArray3[i].email);
				System.out.println("FullName: " + accArray3[i].fullName);
				System.out.println("Tên phòng ban: " + accArray3[i].department.depName);
			}

		}
// Q15: In ra các số chẵn <= 20
		System.out.println(" ");
		System.out.println("+---Excercise 2---Question 15---+");
		for (int i = 0; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");

			}
		}
// Q16: làm lại Q10 bằng while kết hợp break, continue
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("+---Excercise 2---Question 16/10---+");
		int i = 0;
		while (i < accArray1.length) {
			System.out.println("Thông tin account thứ " + (i + 1) + " là:");
			System.out.println("Email: " + accArray1[i].email);
			System.out.println("FullName: " + accArray1[i].fullName);
			System.out.println("Tên phòng ban: " + accArray1[i].department.depName);
			i++;
		}
// Q16: làm lại Q11 bằng while kết hợp break, continue
		System.out.println(" ");
		System.out.println("+---Excercise 2---Question 16/11---+");
		int j = 0;
		while (j < depArray1.length) {
			System.out.println("Thông tin phòng ban thứ " + (j + 1) + " là");
			System.out.println("ID: " + depArray1[j].depId);
			System.out.println("Tên phòng ban: " + depArray1[j].depName);
			j++;
		}
// Q16: làm lại Q12 bằng while kết hợp break, continue
		System.out.println(" ");
		System.out.println("+---Excercise 2---Question 16/12---+");
		int k = 0;
		while (k < 2) {
			System.out.println("Thông tin phòng ban thứ " + (k + 1) + " là");
			System.out.println("ID: " + depArray1[k].depId);
			System.out.println("Tên phòng ban: " + depArray1[k].depName);
			k++;
		}
// Q16: làm lại Q13 bằng while kết hợp break, continue
		System.out.println(" ");
		System.out.println("+---Excercise 2---Question 16/13---+");
		int l = 0;
		while (l < accArray2.length) {
			if (l != 1) {
				System.out.println("Thông tin account thứ " + (l + 1) + " là:");
				System.out.println("Email: " + accArray2[l].email);
				System.out.println("FullName: " + accArray2[l].fullName);
				System.out.println("Tên phòng ban: " + accArray2[l].department.depName);
				l++;

			}

		}
// Q16: làm lại Q14 bằng while kết hợp break, continue
		System.out.println(" ");
		System.out.println("+---Excercise 2---Question 16/14---+");
		int m = 0;
		while (m < accArray3.length) {
			if (accArray3[m].accId < 4) {
				System.out.println("Thông tin account thứ " + (m + 1) + " là:");
				System.out.println("ID: " + accArray3[m].accId);
				System.out.println("Email: " + accArray3[m].email);
				System.out.println("FullName: " + accArray3[m].fullName);
				System.out.println("Tên phòng ban: " + accArray3[m].department.depName);
				m++;
			} else {
				continue;
			}

		}
	}
}
