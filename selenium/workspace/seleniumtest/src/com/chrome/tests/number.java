package com.chrome.tests;

public class number {

	public static void main(String[] args) 
	
	{
			int i,next=0,s=0,n=0;
	
			for(i=0;i<1000; i++)
			{
				next=i;
				while(next>0)
				{
					n=next%10;
					s=s+n;
					next=next/10;
				}
				System.out.println("Integer is:" +" "+i+" "+" Sum of all its digits is: "+ s); 
				s=0;
			}
			

		// TODO Auto-generated method stub

	}

}
