package basicprogram;


import java.util.Scanner;
public class OddNUmbers {
	public static void main(String[]args)
	{
		int i, n, sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter Range: ");
		n=sc.nextInt();
		
		for(i=1;i<=n;i++)
		{
			sum=sum+i;
			
		}
		System.out.println("Sum of natural numbers from 1 to"+n+" is :" +sum);
		sc.close();
	}

}
