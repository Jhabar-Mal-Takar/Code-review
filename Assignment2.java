/*----------------------------------------------------------------------
Author : Jhabar Mal
Date Nov/10/21
Discription : Make
Status : Complete
-----------------------------------------------------------------------*/
class Assignment2{
	public static void main(String []args){
		int no =5556;
		
		int digit4 =no%10; 
		no = no/10;
		
		int digit3 =no%10; 
		no = no/10;
		
		int digit2 =no%10; 
		no = no/10;
		
		int digit1 =no%10; 
		no = no/10;
		
		switch(digit1){
			case 1:  System.out.print("one thoushand ");break;
			case 2:  System.out.print("two thoushand ");break;
			case 3:  System.out.print("three thoushand ");break;
			case 4:  System.out.print("four thoushand ");break;
			case 5:  System.out.print("five thoushand ");break;
			case 6:  System.out.print("six thoushand ");break;
			case 7:  System.out.print("seven thoushand ");break;
			case 8:  System.out.print("eight thoushand ");break;
			case 9:  System.out.print("nine thoushand ");break;
		}
		switch(digit2){
			case 1: System.out.print("one hundrad ");break;
			case 2: System.out.print("two hundrad ");break;
			case 3: System.out.print("three hundrad ");break;
			case 4: System.out.print("four hundrad ");break;
			case 5: System.out.print("five hundrad ");break;
			case 6: System.out.print("six hundrad ");break;
			case 7: System.out.print("seven hundrad ");break;
			case 8: System.out.print("eight hundrad ");break;
			case 9: System.out.print("nine hundrad ");break;
		}
		switch(digit3){
			case 1: System.out.print("ten ");break;
			case 2: System.out.print("twinty ");break;
			case 3: System.out.print("thirty ");break;
			case 4: System.out.print("fourty ");break;
			case 5: System.out.print("fifty ");break;
			case 6: System.out.print("sixty ");break;
			case 7: System.out.print("seventy ");break;
			case 8: System.out.print("eighty ");break;
			case 9: System.out.print("ninty ");break;
			
		}
		switch(digit4){
			case 1: System.out.print("one");break;
			case 2: System.out.print("two");break;
			case 3: System.out.print("three");break;
			case 4: System.out.print("four");break;
			case 5: System.out.print("five");break;
			case 6: System.out.print("six");break;
			case 7: System.out.print("seven");break;
			case 8: System.out.print("eight");break;
			case 9: System.out.print("nine");break;
		}
	}
}