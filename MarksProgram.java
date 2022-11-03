//calculating marks of 5 subjects//

package basicprogram;

import java.util.Scanner;

public class MarksProgram {
 public static void main(String []args)	
 {
	 float m1,m2,m3,m4,m5,total,avg,per ;  //defining variables//
	 Scanner sc=new Scanner(System.in);     //taking input from user//
	 System.out.println("Enter marks of first subject");
	 m1= sc.nextFloat();
	 System.out.println("Enter marks of second subject");
	 m2= sc.nextFloat();
	 System.out.println("Enter marks of third subject");
	 m3=sc.nextFloat();
	 System.out.println("Enter marks of fourth subject");
	 m4=sc.nextFloat();
	 System.out.println("Enter marks of fifth subject");
	 m5=sc.nextFloat();
	 
	 total = m1+m2+m3+m4+m5;
	 avg = (total)/5;
	 per = (total/500)*100;
	 
	 if(total>=300)
		 System.out.println("pass");
	 else
		 System.out.println("fail");
	 

			 
    System.out.println("total marks" +total);	
    System.out.println("avg of marks" +avg);
    System.out.println("percentage of marks" +per);
	 
 }

}
