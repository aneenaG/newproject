package com.chrome.tests;

import java.util.Scanner;

public class calcusample {

	public static void main(String[] args) {
		calcusample a=new calcusample();
		
		Scanner in=new Scanner(System.in);
		a.sample();

	}
	void sample()
	{
		System.out.println("1.addition");
		System.out.println("2.substraction");
		System.out.println("3.enter the option");
		Scanner in=new Scanner(System.in);
		int b=in.nextInt();
	while(true){
		
		switch(b)
		{
		case 1:
		
			System.out.println("enter the numbers for add");
			//Scanner in=new Scanner(System.in);
			int c=in.nextInt();
			int d=in.nextInt();
			
			int sum=c+d;
			System.out.println("sum is "+sum);
			break;
		
		
		case 2:
		
			System.out.println("enter the numbers for sub");
			//Scanner in=new Scanner(System.in);
			int g=in.nextInt();
			int h=in.nextInt();
			
			int x=g-h;
			System.out.println("sum is "+x);
			break;
		
		default:
         System.out.println("enter the correct");
		break;
	}
}
}
}