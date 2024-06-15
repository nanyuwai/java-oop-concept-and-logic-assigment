package com.assign.days.two;

public class RhombusPattern {

	public static void main(String[] args) {
		int size =5;
		RhombusPattern rp= new RhombusPattern();
		rp.usingFor(size);
		rp.usingWhile(size);
		rp.usingDoWhile(size);
	}

	public void usingFor(int size) {
		for(int i=0;i<size;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<size;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public void usingWhile(int size) {
		int i=0;
		while(i<size) {
			int j=0;
			while(j<i){
				System.out.print(" ");
				j++;
			}
			j=0;
			while(j<size) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
	
	public void usingDoWhile(int size) {
		int i=0;
		do {
			int j=0;
			do {
				if(j<i) {
					System.out.print(" ");
				}
				j++;
			}while(j<i);
			j=0;
			do {
				System.out.print("* ");
				j++;
			}while(j<size);
			System.out.println();
			i++;
		}while(i<size);
	}
}
