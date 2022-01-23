/*------------------------------------------------------------------
	Author : Jhabar Mal
	Date : Nov-11-2021
	Description:  Print series! 1,6,13,22,33,46,…………for n-time
	Status : Complete
	-----------------------------------------------------------------*/
import java.util.Scanner;
class S1{
	public static void main (String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the n number to print Series : ");
		int n = sc.nextInt();
		int i=1;
		while(n >= i){
			int res = ((i*(i+1)) + (i-2));
			System.out.print(res+" ");
			i++;
		}
	}
}