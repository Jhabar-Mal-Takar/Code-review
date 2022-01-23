/*------------------------------------------------------------------
	Author : Jhabar 
	Date : Nov-11-2021
	Description:  Print Series  6, 12, 21, 33, 48.......n-time.
	Status : Complete
	-----------------------------------------------------------------*/
import java.util.Scanner;
class S5{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n number to print Series : ");
		int n = sc.nextInt();
		int b = 6;
		int count = 1;
		while(n >= 1){
			System.out.print(b+" ");
			count++;
			b=b+3*count;
			n--;
		}
	}
}