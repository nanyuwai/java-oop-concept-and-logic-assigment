package com.assign.days.two;

public class DiamondPattern {

	public static void main(String[] args) {
		int size = 5;
		DiamondPattern dp = new DiamondPattern();
		dp.usingFor(size);
		dp.usingWhile(size);
	}

	public void usingFor(int size) {
		for (int i = 1; i <= size; i++) {
			for (int j = size - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = size - 1; i >= 1; i--) {
			for (int j = 1; j <= size - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void usingWhile(int size) {
		int i=1;
		while(i<size) {
			int j=size-i;
			while(j>0) {
				System.out.print(" ");
				j--;
			}
			j =1;
			while(j<=2*i-1) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		 i=size-1;
		while(i>=1) {
			int j=1;
			while(j<=size-i) {
				System.out.print(" ");
				j++;
			}
			j=1;
			while(j<=2*i-1) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i--;
		}
	}
}
