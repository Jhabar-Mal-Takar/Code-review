/*----------------------------------------------------------------------
Author : Jhabar Mal
Date Nov/10/21
Discription : Make
Status : Complete
-----------------------------------------------------------------------*/
class Assignment5{
	public static void main(String []args){
		int a=60,b=50,c=30,d=40;
		int max=0;
		if(a>b)
	    {
			if(a>c)
			{
				if(a>d)
				{
					System.out.println(max=a);
				}
				else
				{
					System.out.println(max=d);
				}
			}
			else
			{
				if(c>d)
				{
					System.out.println(max=c);
				}
				else
				{
					System.out.println(max=d);
				}
			}
		}
		else
		{
			if(b>c)
			{
				if(b>d)
				{
					System.out.println(max=b);
				}
				else
				{
					System.out.println(max=d);
				}
			}

			else
			{
				if(c>d)
				{
					System.out.println(max=c);
				}
				else
				{
					System.out.println(max=d);
				}
			}
		}
	}
}