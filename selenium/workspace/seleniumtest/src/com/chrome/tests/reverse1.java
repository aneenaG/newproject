package com.chrome.tests;

import java.util.Scanner;

public class reverse1 {

	public static void main(String[] args) {
		String a="";
		System.out.println("enter the string");
		Scanner s =new Scanner(System.in);
		String b =s.next();
		for(int i=b.length()-1;i>=0;i--)
		{
			
			a+=b.charAt(i);
			
		}
		System.out.println(a);
		
		// TODO Auto-generated method stub

	}

}
