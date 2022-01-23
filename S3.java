/*------------------------------------------------------------------
	Author : Jhabar 
	Date : Nov-11-2021
	Description: Print Series 1,2,9,28,65............for n-time
	Status : Complete
	-----------------------------------------------------------------*/
import java.util.Scanner;
class S3{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n number to print Series : ");
		int n = sc.nextInt();
		int digit =0;
		while(n >= 1){
			int res = digit*digit*digit + 1;
			System.out.print(res+" ");
			digit++;
			n--;
		}
	}
}