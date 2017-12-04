package com.chrome.tests;

import java.util.Scanner;

public class str1 {
	

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String a=in.next();
		String b="";
		for(int i=a.length()-1;i>=0;i--)
			b+=a.charAt(i);
			System.out.println(b);
		
		// TODO Auto-generated method stub

	}

}
