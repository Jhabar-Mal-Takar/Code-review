/*----------------------------------------------------------------------
Author : Jhabar Mal
Date Nov/10/21
Discription : Make
Status : Complete
-----------------------------------------------------------------------*/
class Assignment1{
	public static void main(String [] args){
		int a=10,b=9,c=30,d=5,min=0;
		
		if(a<b){
			min = a;
		}
		else{
			min =b;
		}
		if(c<min){
			min=c;
		}
		else{
			min=min;
		}
		if(d<min){
			min =d;
		}
		else{
			min = min;
		}
		//System.out.println("The min val "+min);
		int min2=0;
		if(min == a){
			if(b<c){
				min2=b;
			}
			else{
				min2=c;
			}
			if(d<min2)
			{
				min2=d;
			}
			else{
				min2=min2;
			}
		}
		else if(min == b){
			if(a<c){
				min2=a;
			}
			else{
				min2=c;
			}
			if(d<min2)
			{
				min2=d;
			}
			else{
				min2=min2;
			}
		}
		else if(min == c){
			if(a<b){
				min2=a;
			}
			else{
				min2=b;
			}
			if(d<min2)
			{
				min2=d;
			}
			else{
				min2=min2;
			}
		}
		else if(min == d){
			if(a<b){
				min2=a;
			}
			else{
				min2=b;
			}
			if(c<min2)
			{
				min2=c;
			}
			else{
				min2=min2;
			}
		}	
			System.out.println("The Third largest no is :"+min2);
	}
}
