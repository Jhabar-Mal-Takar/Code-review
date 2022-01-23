/*----------------------------------------------------------------------
Author : Jhabar Mal
Date Nov/10/21
Discription : Make
Status : Complete
-----------------------------------------------------------------------*/
class Assignment3{
	public static void main(String [] args){
		int defaultBillAmount =500;
		int unit =260;
		double totalBillAmount;
		if(unit<=50){
			totalBillAmount = defaultBillAmount+(unit*0);
			System.out.println(totalBillAmount);
		}
		else if(unit<=100){
			totalBillAmount = defaultBillAmount + (unit-50)*0.75 + 50*0;
			System.out.println(totalBillAmount);
		}
		else if(unit<=200){
			totalBillAmount = defaultBillAmount +  (unit-100)*1.20 + (50)*0.75 +50*0;
			System.out.println(totalBillAmount);
		}
		else if(unit<=300){
			totalBillAmount = defaultBillAmount + (unit-200)*1.50 + (100)*1.20 + (50)*0.75 + 50*0;
			System.out.println(totalBillAmount);
		}
		else if (unit>300){
			totalBillAmount = defaultBillAmount + (unit-300)*2 + (100)*1.50 +(100)*1.20+(50)*0.75 + 50*0;
			System.out.println(totalBillAmount);
		}	
	}
}