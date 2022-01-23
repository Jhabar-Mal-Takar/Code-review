/*------------------------------------------------------------------
	Author : Jhabar 
	Date : Nov-11-2021
	Description: . WAP to check weather the number is palindrome or not (between 1 to N).
	Status : Complete
	-----------------------------------------------------------------*/
import java.util.Scanner;
class Palindrom{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n number to print palindrome number is :");
		int n = sc.nextInt();
		int num =1;   
		while(num<=n){ 
			int no = num;
			int rev =0, rem;
			while(no != 0){
				rem = no%10;
				rev = rev*10+rem;
				no = no/10;
			}
		
			if(num == rev){
				System.out.print(num+" ");
			}
			num=num+1;
		}
	}
}