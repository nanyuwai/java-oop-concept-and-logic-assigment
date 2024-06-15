package com.assign.days.two;

public class ReverseNumberTrianglePattern {

	public static void main(String[] args) {
		int size = 4;
		for (int i = 1; i <= size; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = i; j <= size; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
