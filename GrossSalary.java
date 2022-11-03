// program to calculate gross salary of an employee//

package basicprogram;

import java.util.Scanner;
public class GrossSalary {
public static void main(String[]args)
	{
		float salary,da1,hr1,da,hr,gross_salary;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee salary ");
		salary= sc.nextFloat();
		
		System.out.println("Enter employee DA ");
		da1= sc.nextFloat();
		
		System.out.println("Enter employee HRA ");
		hr1= sc.nextFloat();
		
		da= (da1*salary)/100;
		hr= (hr1*salary)/100;
		
		gross_salary=(da+hr+salary);
		
		System.out.println("gross salary of employee is: " +gross_salary);
		
	}

}
