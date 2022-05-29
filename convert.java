import java.util.Scanner;
class Convert
{
public static void main(String args[])
	{
		char ch1, ch2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any character");
		
		ch1=sc.next().charAt(0);
		
		if(ch1>='A' && ch1<='Z')
		{
		ch2=Character.toLowerCase(ch1);
		System.out.println("Lowercase :"+ch2);
		}
		else
		{
		ch2=Character.toUpperCase(ch1);
		System.out.println("Uppercase :"+ch2);
		}
	}
}