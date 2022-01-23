/*------------------------------------------------------------------
	Author : Jhabar Mal Takar 
	Date : Nov-11-2021
	Description: .  WAP to input 10 value of 10's digit and find out the largest value with number of occurrence. (Do not use Array)
	Status : Complete.
	-----------------------------------------------------------------*/
import java.lang.*;
class RandomNum2{
	public static void main(String [] args){
		int n =1;
		int count =1;
		int max = 0;
		while(n<=10){
			int val = (int)((Math.random())*10);
			System.out.print(val +" ");
			if(max<val){
				max = val;
				count = 1;
			}
			else if(max == val){
				count++;
			}
			n++;
		}
		System.out.println();
		System.out.println("The maximum Number is "+max+" this number occurrence is "+count);	
	}
}