/*------------------------------------------------------------------
	Author : Jhabar mal takar
	Date : Nov-11-2021
	Description: WAP to enter a decimal number and convert it into its equivalent binary number.
	Status : Complete.
	-----------------------------------------------------------------*/
import java.util.Scanner;
class DB{
	public static void main (String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the decimal number convert into its equivalent binary number : ");
		int DecNumber = sc.nextInt();
		String res = "";
		while(DecNumber >= 1){
			int rem = DecNumber % 2;
			DecNumber = DecNumber/2;
			res = rem + res;
		}
		System.out.print("Equivalent binary number is : "+res);	
	}
}