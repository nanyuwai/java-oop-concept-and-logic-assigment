package com.assign.days.two;

public class NumberIncreasingReversePyramid {

	public static void main(String[] args) {
		int size =4;
		NumberIncreasingReversePyramid nirp =new NumberIncreasingReversePyramid();
		nirp.usingFor(size);
		nirp.usingWhile(size);
		nirp.usingDoWhile(size);
	}

	public void usingFor(int size) {
		for(int i=size;i>0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(j +" ");
			}
			System.out.println();
		}
	}
	public void usingWhile(int size) {
		int i=size;
		while(i>0) {
			int j=1;
			while(j<=i) {
				System.out.print(j +" ");
				j++;
			}
			System.out.println();
			i--;
		}
	}
	
	public void usingDoWhile(int size) {
		int i=size;
		do {
			int j=1;
			do {
				System.out.print(j +" ");
				j++;
			}while(j<=i);
			System.out.println();
			i--;
		}while(i>0);
	}
}
