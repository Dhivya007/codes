package logicalprogramming;

import java.util.Scanner;

public class StringToInt 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		String str=Integer.toString(num);
		System.out.println(str);
		sc.close();
	}

}
