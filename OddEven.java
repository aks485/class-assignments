package basicprogram;

import java.util.Scanner;
public class OddEven {
public static void main (String [] args)
{
	int num;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter number to check even or odd ");
	num = sc.nextInt();
	
	if(num%2==0)
	System.out.println(num+"number is even");
	
	else
		System.out.println(num+"number is odd ");
	
}
}
