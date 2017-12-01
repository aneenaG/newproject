package com.chrome.tests;

public class overri {
	void run()
	{
		System.out.println("run car");
	}
	public static void main(String[] args) {
		overri a= new overri();
		over1 b=new over1();
		a.run();
		b.run(5);
}}
class over1 extends overri{
	void run(int a)
	{System.out.println("run bus"+a);
	}
		
	
		
		// TODO Auto-generated method stub

	}


