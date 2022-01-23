/*----------------------------------------------------------------------
Author : Jhabar Mal
Date Nov/10/21
Discription : Make
Status : Complete
-----------------------------------------------------------------------*/
import java.util.Scanner;
class Assignment10{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Select sym to calculate the area of circle, rectangle,triangle,square");
		char sym = sc.next().charAt(0); 
		double area;
		switch(sym){
			case 'c':  
					 System.out.println("Enter the radius of circle is : ");
					 double ri = sc.nextInt();
					 area = 3.14*ri*ri;
					 System.out.println("The area of circle is :"+area);
					 break;
			case 'r':  
					 System.out.println("Enter the length of rectangle : ");
					 double l = sc.nextInt();
					 System.out.println("Enter the width of rectangle: ");
					 double w = sc.nextInt();
					 area = l*w;
					 System.out.println("The area of rectangle is :"+area);	
					 break;
			case 't':  
					 System.out.println("Enter the length of triangle : ");
					 double triL = sc.nextInt();
					 System.out.println("Enter the height of triangle is : ");
					 double triH = sc.nextInt(); 
					 area = 0.5*triL*triH;
					 System.out.println("The area of triangle is :"+area);		
					 break;
			case 's':  
					 System.out.println("Enter the arm of square is : ");
					 double arm = sc.nextInt();
					 area = arm*arm;
					 System.out.println("The area of circle is :"+area);
					 break;
		}
	}
}