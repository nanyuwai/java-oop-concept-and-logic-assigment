package com.assign.days.two;

public class PalindromeTriangular {

	public static void main(String[] args) {
		int size =6;
		PalindromeTriangular pt =new PalindromeTriangular();
		pt.usingFor(size);
		pt.usingWhile(size);
		pt.usingDoWhile(size);
	}

	public void usingFor(int size) {
		for(int i=1;i<=size;i++) {
			for(int j=size;j>i;j--) {
				System.out.print("  ");
			}
			for(int j=i; j >= 1;j--) {
				System.out.print(j+" ");
			}
			for(int j=2;j<=i;j++) {
				System.out.print(j+" ");
			}
			  System.out.println();
		}
	}
	public void usingWhile(int size) {
		int i=1;
		while(i<=size) {
			int j=size;
			while(j>i) {
				System.out.print("  ");
				j--;
			}
			j=i;
			while(j>=1) {
				System.out.print(j+" ");
				j--;
			}
			j=2;
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
			int j=size;
			do {
				if (j > i) {
                    System.out.print("  ");
                }
                j--;
			}while(j>i);
			j=i;
			do {
				System.out.print(j+" ");
				j--;
			}while(j>=1);
			j=2;
			do {
				System.out.print(j+" ");
				j++;
			}while(j<=i);
			System.out.println();
			i++;
		}while(i<=size);
	}
}
