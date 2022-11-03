package basicprogram;

import java.util.Scanner;
public class MaxmAmongThreeDigits {
public static void main (String[] args)
{
	int num1, num2,num3,max;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter three numbers");
	num1=sc.nextInt(); //345
	num2=sc.nextInt();  //78
	num3=sc.nextInt();  //240
	
	if(num1>num2)  //345>78
	{
		if(num1> num3)  //  345>240
		{
			max=num1;      //example of nested-ifs
		}
		else
		{
			max=num3;
		}
	}
	else
	{
		if(num2>num3)
		{
			max=num2;
		}
		else
		{
			max=num3;
		}
	}
	 System.out.println("maxm number among all is :" +max);
	}
}

