package com.chrome.tests;

import java.util.Scanner;

public class string {

    public static void main(String[] args){
    	
        Scanner input = new Scanner (System.in);
        System.out.println("enter the string");
        String word = input.next();
    	//String word="abcd";
        String reverse = "";
        for(int i=word.length()-1; i>=0; i--)
            reverse += word.charAt(i);
        //System.out.println(reverse);    
        if(word.equals(reverse))
        {
        	System.out.println("string palindrom");
    }
        else {
        	System.out.println("not palindrom");
        }
        }
}
