/*------------------------------------------------------------------
	Author : Jhabar mal takar
	Date : Nov-11-2021
	Description: WAP to enter a binary number and convert it into its equivalent decimal number.
	Status : Complete
	-----------------------------------------------------------------*/
import java.util.Scanner;
class BD{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the binary number to convert into the decimal number : ");
		int bNum = sc.nextInt();
		int power2val=1;
		int res=0;
		while(bNum !=0){
			int rem = bNum%10;
			res = res + rem*power2val;
			power2val = power2val*2;
			bNum = bNum/10;
		}
		System.out.println("The Decimal number is : "+res);
	}
	
}