package com.assign.days.two;

public class LeftHalfPyramid {

	public static void main(String[] args) {
		int size = 5;
		for (int i = 1; i <= size; i++) {
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
