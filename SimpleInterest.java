/*  program for simple interest */

package basicprogram;

import java.util.Scanner;

public class SimpleInterest {
public static void main(String []args)
{
	float principle,time,rate,si;     //declaring variables//
	Scanner sc=new Scanner(System.in);  // to take input from user//
	System.out.println("Enter principle amount");
	principle = sc.nextFloat();         //taking input from user and saving into variable//
	System.out.println("Enter time ");
	time=sc.nextFloat();
	System.out.println("Enter rate ");
	rate=sc.nextFloat();
	
	si=(principle*time*rate)/100;

	System.out.println("Your simple interest is " +si); 
	
}

}
