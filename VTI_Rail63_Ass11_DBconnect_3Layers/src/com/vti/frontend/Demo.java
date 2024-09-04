package com.vti.frontend;

import com.vti.entity.ScannerUltis;

public class Demo {
	public static void main(String[] args) {
		// khởi tạo AccountFunction
		AccountFunction accountFunction = new AccountFunction();

		while (true) {
			String leftAlignFormat = "| %-72s |%n";
			System.out.format("+------------------------------------------------+%n");
			System.out.format("                MỜI BẠN CHỌN CHỨC NĂNG            %n");
			System.out.format("+------------------------------------------------+%n");
			System.out.format(leftAlignFormat, "1. Hiển thị danh sách account trên hệ thống");
			System.out.format(leftAlignFormat, "2. Tìm account theo ID");
			System.out.format(leftAlignFormat, "3. Thêm mới Account");
			System.out.format(leftAlignFormat, "4. Cập nhật thông tin account đang có");
			System.out.format(leftAlignFormat, "5. Exit");
			System.out.format("+------------------------------------------------+%n");
			switch (ScannerUltis.inputIntPositive()) {
			case 1:
				accountFunction.showAccount();
				break;
			case 2:
				accountFunction.showAccountById();
				break;
			case 3:

				break;
			default:
				System.out.println("Nhập lại.");
			}
		}
	}
}
