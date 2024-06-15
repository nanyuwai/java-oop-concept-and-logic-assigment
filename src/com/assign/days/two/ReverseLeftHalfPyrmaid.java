package com.assign.days.two;

public class ReverseLeftHalfPyrmaid {

	public static void main(String[] args) {
		int size = 6;
		for (int i = size; i >= 1; i--) {
			for (int j = size; j > i; j--) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
