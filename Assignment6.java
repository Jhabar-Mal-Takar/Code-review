/*----------------------------------------------------------------------
Author : Jhabar Mal
Date Nov/10/21
Discription : Make
Status : Complete
-----------------------------------------------------------------------*/
class Assignment6{
	public static void main (String[] args){
		char ch = '*';
		int check = ch;
		
		if(check >=65 && check <=90 || check>=97 && check <=122){
			System.out.println("The given character is alphabet");
		}
		if(check>=48 && check<=57){
			System.out.println("The given character is digit character");
		}
		if(check>=33 && check<=47){
			System.out.println("The given character is special character");
		}
	}
}