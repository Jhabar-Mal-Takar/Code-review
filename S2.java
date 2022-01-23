/*------------------------------------------------------------------
	Author : Jhabar Mal
	Date : Nov-11-2021
	Description:  Print series! 1,6,13,22,33,46,…………for n-time
	Status : Complete
	-----------------------------------------------------------------*/
import java.util.Scanner;
class S2{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n number to print Series : ");
		int n = sc.nextInt();
		int add = 1;
		int res = 1;
		while(n >= 1){
			add  *= 2;
			res  += add;
			System.out.print(res+" ");
			n--;
		}
	}
}