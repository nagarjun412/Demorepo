package org.jsp.app;

import java.util.Scanner;

public class StringPermutations 
{
    public static void main(String[] args) 
    {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=scanner.next();
		printPermute(s,"");
	}

	private static void printPermute(String str, String ans) 
	{
		if(str.length()==0)
		{
			System.out.println(ans);
			return;
		}
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			String res=str.substring(0,i)+str.substring(i+1);
			printPermute(res,ans+ch);
		}
		
	}
}
