package com.first;

public class one 
{
	public static void main(String[] args) 
	{
		String s1="javadeveloper";
		char c;
		int count=0;
		try
		{
			for(int i=0;;i++)
			{
			c=s1.charAt(i);
			count++;
			}
		}catch(Exception e)
		{
			//break;
		}
		System.out.println(count);
		
	}

}
