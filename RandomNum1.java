/*------------------------------------------------------------------
	Author : Jhabar Mal Takar 
	Date : Nov-11-2021
	Description: . WAP to input 10 value of 10's digit and find out the maximum length of increasing series. (Do not use Array)
	Status : Complete.
	-----------------------------------------------------------------*/
import java.lang.*;
class RandomNum1{
	public static void main(String [] args){
		int n =1;
		int count = 0;
		int len = 0;
		int pval = 0;
		while(n<=10){
			int val = (int)((Math.random())*10);
			System.out.print(val +" ");
			if(pval <= val){
				count++;
			}
			else{
				
				if(count > len){
					len = count;
				}
				count =1;
				
			}
			pval = val;
		    n++;
		}
		System.out.println();
		System.out.println("The maximum length of increasing series : "+len);	
	}
}