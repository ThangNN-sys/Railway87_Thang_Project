package com.vti.entity;

import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh implements ITuyenSinh {
	private ArrayList<Contestant> listContestants;
	private Scanner sc;

	public TuyenSinh() {
		listContestants = new ArrayList<Contestant>();
		sc = new Scanner(System.in);
	}

	@Override
	public void addContestant() {
		System.out.println("Nhập tên thí sinh:");
		String name = sc.nextLine();
		System.out.println("Nhập địa chỉ thí sinh:");
		String address = sc.nextLine();
		System.out.println("Nhập mức ưu tiên thí sinh:");
		int priority = sc.nextInt();

	}
}
