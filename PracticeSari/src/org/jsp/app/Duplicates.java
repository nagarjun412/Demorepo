package org.jsp.app;

import java.util.Scanner;

public class Duplicates {

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the String:");
		String s1=scanner.nextLine();
		String s2="";
		
		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch=s1.charAt(i);
			if(s2.indexOf(ch)==-1)
			{
				s2=s2+ch;
			}
			else
			{
				System.out.println("The repeated character is:"+ch);
			}
			
	    }
		System.out.println("original String is:"+s1);
		System.out.println("String after removing duplicates:"+s2);
		
	}
		

}
