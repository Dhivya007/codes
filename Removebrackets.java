package logicalprogramming;
import java.util.Scanner;
public class Removebrackets 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string");
	String input=sc.nextLine();
	int open=0;
	int close=0;
	char[] arr=new char[input.length()];
	StringBuffer str=new StringBuffer(input);
	for(int i=0;i<input.length();i++)
	{
		arr[i]=input.charAt(i);
	}
	for(int i=0;i<input.length();i++)
	{
		if(arr[i]=='(')
		{
			open++;
		}
		else if(arr[i]==')')
		{
			close++;
		}
	}
	for(int i=0;i<input.length()-1;i++)
	{
	if(open<close)
	{
		 
		 str.deleteCharAt(input.length()-1);
		 System.out.println(str);
		 break;
	}
	else if(open>close)
	{
		str.deleteCharAt(0);
		System.out.println(str);
		break;
	}
	else if(open==close)
	{
		System.out.println(str);
		break;
	}
	}
	sc.close();
}
}
