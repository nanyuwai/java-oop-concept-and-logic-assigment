package com.assign.days.two;

public class NumberTriangular {

	public static void main(String[] args) {
		int size =4;
		NumberTriangular nt =new NumberTriangular();
		nt.usingFor(size);
		nt.usingWhile(size);
		nt.usingDoWhile(size);
	}

	public void usingFor(int size) {
		for(int i=1;i<=size;i++) {
			for(int j=size; j>i;j--) {
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(i+"   ");
			}
			System.out.println();
		}
	}
	public void usingWhile(int size) {
		 int i = 1;
		 while(i<=size) {
			 int j=size;
			 while(j>i) {
				 System.out.print("  ");
	             j--;
			 }
			 int k=1;
			 while(k<=i) {
				 System.out.print(i + "   "); 
	             k++;
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
			int k=1;
			do {
				 System.out.print(i + "   "); 
	             k++;
			}while(k<=i);
			System.out.println();
	        i++;
		}while(i<=size);
	}
}
