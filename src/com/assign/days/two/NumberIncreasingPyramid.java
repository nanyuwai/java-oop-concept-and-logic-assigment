package com.assign.days.two;

public class NumberIncreasingPyramid {

	public static void main(String[] args) {
		int size =4;
		NumberIncreasingPyramid nip =new NumberIncreasingPyramid();
		nip.usingFor(size);
		nip.usingWhile(size);
		nip.usingDoWhile(size);
	}

	public void usingFor(int size) {
		for(int i=1;i<=size;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public void usingWhile(int size) {
		int i=1;
		while(i<=size) {
			int j=1;
			while(j<=i) {
				System.out.print(j+" ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
	
	public void usingDoWhile(int size) {
		int i=1;
		do {
			int j=1;
			do {
				System.out.print(j+" ");
				j++;
			}while(j<=i);
			System.out.println();
			i++;
		}while(i<=size);
	}
}
