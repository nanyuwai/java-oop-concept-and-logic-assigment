package com.assign.days.two;

public class NumberChangingPyramid {

	public static void main(String[] args) {
		int size=4;
		NumberChangingPyramid ncp =new NumberChangingPyramid();
	      ncp.usingFor(size);
	      ncp.usingWhile(size);
	      ncp.usingDoWhile(size);
	}

	public void usingFor(int size) {
		int number =1;
		for(int i=1;i<=size;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(number+" ");
				number++;
			}
			System.out.println();
		}
	}
	public void usingWhile(int size) {
		int number = 1,i =1;
		while(i<=size) {
			int j=1;
			while(j<=i) {
				System.out.print(number +" ");
				number++;
				j++;
			}
			System.out.println();
			i++;
		}
	}
	public void usingDoWhile(int size) {
		int number =1,i=1;
		do {
			int j=1;
			do {
				System.out.print(number +" ");
				number++;
				j++;
			}while(j<=i);
			System.out.println();
			i++;
		}while(i<=size);
	}
}
