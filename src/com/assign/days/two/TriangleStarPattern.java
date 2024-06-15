package com.assign.days.two;

public class TriangleStarPattern {

	public static void main(String[] args) {
		for(int i=0;i<6;i++) {
			for(int j=6;j>=i;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
