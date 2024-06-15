package com.assign.days.two;

public class SquareHollowPattern {
	public static void main(String[] args) {
		int size =6;
		SquareHollowPattern shp = new SquareHollowPattern();
		shp.usingFor(size);
		shp.usingWhile(size);
		shp.usingDoWhile(size);
	}

	public void usingFor(int size) {
		for(int i=0; i<size;i++) {
			for(int j=0;j<size;j++) {
				if(i == 0 || i == size-1 || j==0 || j==size-1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	
	public void usingWhile(int size) {
		int i=0;
		while(i<size) {
			int j=0;
			while(j<size) {
				if(i == 0 || i == size-1 || j==0 || j==size-1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
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
				if(i == 0 || i == size-1 || j==0 || j==size-1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
				j++;
			}while(j<size);
			System.out.println();
			i++;
		}while(i<size);
	}
}
