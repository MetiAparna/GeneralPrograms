package com.first;

public class two
{
	public static void main(String[] args) 
	{
		String s1="apple";	
		String s2="";
		char ch;
		for(char c='a';c<='z';c++)
		{
			for(int i=0;i<s1.length();i++)
			{
				if(c==s1.charAt(i))
					s2+=s1.charAt(i);
			}
		}
		System.out.println(s2);//aelpp
	}

}
