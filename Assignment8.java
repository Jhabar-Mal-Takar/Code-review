/*----------------------------------------------------------------------
Author : Jhabar Mal
Date Nov/10/21
Discription : Make
Status : Complete
-----------------------------------------------------------------------*/
class Assignment8{
	public static void main (String[] args){
		int amount = 3100;
		
		int count2000 = amount/2000;
		System.out.println("2000 Notes is : "+count2000);
		amount = amount%2000;
		
		int count500 = amount/500;
		System.out.println("500 Notes is : "+count500);
		amount = amount%500;
		
		int count200 = amount/200;
		System.out.println("200 Notes is : "+count200);
		amount = amount%200;
		
		int count100 = amount/100;
		System.out.println("100 Notes is : "+count100);
		amount = amount%100;
		
		int count50 = amount/50;
		System.out.println("50 Notes is : "+count50);
		amount = amount%50;
		
		int count20 = amount/20;
		System.out.println("20 Notes is : "+count20);
		amount = amount%20;
		
		int count10 = amount/10;
		System.out.println("10 Notes is : "+count10);
		amount = amount%10;
		
		int count5 = amount/5;
		System.out.println("5 coins is : "+count5);
		amount = amount%5;
		
		int count2 = amount/2;
		System.out.println("2 coins is : "+count2);
		amount = amount%2;
		
		int count1 = amount/1;
		System.out.println("1 coins is : "+count1);
	}
}