/*------------------------------------------------------------------
	Author : Jhabar 
	Date : Nov-11-2021
    Description: . Print Series 1  12    123    1234 …………n-time;
	Status : Complete
	-----------------------------------------------------------------*/
import java.util.Scanner;
class S4{
	public static void main (String [] ars){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the n number to print Series : ");
		int n = sc.nextInt();
		int i =1;
		int a = 0;
		while(n>=1){
	    a = a*10 + i++;
		System.out.print(a+" ");
		n--;
		}
	}
}