package javafullstack;

import java.util.Scanner;

public class Fibonooci {
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter n number");
			int n=sc.nextInt();
			int a=0,b=1;
			System.out.print( +a+" " +b);
			for(int i=2;i<n;i++) {
				int c=a+b;
				System.out.print(" "+c);
				a=b;
				b=c;
			}
			
		}
		
		
	
	
}


