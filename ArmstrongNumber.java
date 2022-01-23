/*------------------------------------------------------------------
	Author : Jhabar 
	Date : Nov-11-2021
	Description:  WAP to check weather the number is Armstrong or not.
	Status : Complete
	-----------------------------------------------------------------*/

import java.util.Scanner;
class ArmstrongNumber{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number for check armstrong or not : ");
		int num = sc.nextInt();
		// first find out number of digits
		int no1 = num;
		int digits =0;
		while(no1 != 0){
			digits++ ;
			no1 = no1/10;
		}
		//System.out.println(digits);
		int no2 = num;
		int res =0;
		while(no2 != 0){
			int rem = no2%10;
			int cal =1;
			for(int i=0; i<digits; i++){
				cal = cal*rem;
			}
			res = res+cal;
			
			no2 = no2/10;
		}
		//System.out.println(res);
		if(num == res){
			System.out.println("Number is armstrong  no : "+num);
		}
		else{
			System.out.println("Number is not armstrong no : "+num);
		}
	}
}