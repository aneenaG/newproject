package com.chrome.tests;

import java.util.Scanner;

public class revnum {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int r=0;
		while(n!=0){
			 r=(r*10)+(n%10);
			 n= n/10;
			
		}
		System.out.println(r);
		// TODO Auto-generated method stub

	}

}
