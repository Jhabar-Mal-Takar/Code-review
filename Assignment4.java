/*----------------------------------------------------------------------
Author : Jhabar Mal
Date Nov/10/21
Discription : Make
Status : Complete
-----------------------------------------------------------------------*/
class Assignment4{
	public static void main(String [] args){
		int salary = 30000;
		int taxAmount;
		int taxableAmount;
		if(salary<=10000){
			taxAmount = 0;
			System.out.println("The taxAmount is: "+taxAmount);
		}
		else if(salary<=17500){
			taxableAmount = salary-10000;
			taxAmount = taxableAmount*15/100;
			System.out.println("The taxAmount is: "+taxAmount);
		}
		else if(salary<=25500){
			taxableAmount = salary-10000;
			taxAmount = taxableAmount*20/100;
			System.out.println("The taxAmount is: "+taxAmount);
		}
		else if(salary>25500){
			taxableAmount = salary-10000;
			taxAmount = taxableAmount*25/100;
			System.out.println("The taxAmount is: "+taxAmount);
		}
		
	}
}