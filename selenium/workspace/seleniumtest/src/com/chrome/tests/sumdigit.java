package com.chrome.tests;

public class sumdigit {

	public static void main(String[] args) {
		sumdigit s=new sumdigit();
		s.add();
		sumdigit t=new sumdigit(792);
	}
	sumdigit(int n)
	{
		

	int r=0;
	while(n>0)
	{
		
		
		r=(r*10)+(n%10);
		n=n/10;
	}
	System.out.println(r);
	}
	// TODO Auto-generated method stub

		sumdigit()
		{
			
		int n =78;
		int s=0;
		while(n>0)
		{
			int n1=n%10;
			s=s+n1;
			n=n/10;
		}
		System.out.println(s);
		// TODO Auto-generated method stub

		}
void add()
{
	int s=5,y=9;
	int f=s+y;
	System.out.println(f);
	
	
	}
}
