/*----------------------------------------------------------------------
Author : Jhabar Mal
Date Nov/10/21
Discription : Make but two conditinal operator using.
Status : Complete
-----------------------------------------------------------------------*/
class Assignment9{
	public static void main (String [] args){
		int a=40,b=60,c=300;
		int max=( a>b ? (a>c?a:c) : (b>c?b:c) );
		System.out.println("largest val :"+max);
		
	}
}