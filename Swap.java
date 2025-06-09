package javafullstack;

import java.util.Scanner;

public class Swap {
	public static void main(String[] args)
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a,b number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int temp=a;
		a=b;
		b=temp;
		System.out.println("a  after swap"+ a + "b after swap"+ b);
		
		
		
		
	}
	

}


