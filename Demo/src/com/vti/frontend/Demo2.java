package com.vti.frontend;

public class Demo2 {
	public static void main(String[] args) {
		double[] myList = { 1, 5, 5, 5, 5, 1 };
		double max = myList[0];
		int indexOfMax = 0;
		for (int i = 1; i < myList.length; i++) {
			if (myList[i] > max) {
				max = myList[i];
				indexOfMax = 1;
			}
		}
		System.out.println(indexOfMax);
	}

}
