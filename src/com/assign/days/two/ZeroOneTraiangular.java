package com.assign.days.two;

public class ZeroOneTraiangular {

	public static void main(String[] args) {
		int size =5;
		ZeroOneTraiangular zot= new ZeroOneTraiangular();
		zot.usingFor(size);
		zot.usingWhile(size);
		zot.usingDoWhile(size);
	}

	public void usingFor(int size) {
		for(int i=1;i<size;i++) {
			for(int j=0;j<i;j++) {
				System.out.print((i+j)%2 +" ");
			}
			System.out.println();
		}
	}
	
	public void usingWhile(int size) {
		int i=1;
		while(i<size) {
			int j=0;
			while(j<i) {
				System.out.print((i+j)%2 +" ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
	public void usingDoWhile(int size) {
		int i=1;
		do {
			int j=0;
			do {
				System.out.print((i+j)%2 +" ");
				j++;
			}while(j<i);
			System.out.println();
			i++;
		}while(i<size);
	}
}
