package com.vti.frontend;

import com.vti.backend.presentationlayer.AccountController;

public class AccountFunction {
	// Method hiển thị toàn bộ Account
	private AccountController accountController = new AccountController(); // hàm để gọi account

	public void showAccount() {
		System.out.println("Hiển thị danh sách Account đang có trên DB:");
		// Cần 1 danh sách Account
		accountController.getListAccount();
	}

	// Method hiển thị Account theo ID
	public void showAccountById() {

	}

}
