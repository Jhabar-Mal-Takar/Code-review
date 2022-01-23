import java.util.Scanner;
class Rational{
	int a,b;
	public Rational(){
		
	}
	public Rational(int r1, int r2){
		this.a = r1;
		this.b = r2;
	}
	public void displayRationalNum(){
		System.out.println("The rational number is : "+a+"/"+b);
		System.out.println();
	}
	
	public Rational addRational(Rational obj){
		Rational temp = null;
		if(b != 0){
			temp = new Rational();
			temp.a = a*obj.b + b*obj.a;
			temp.b = b*obj.b;
		}
		return temp;
	}
	
	public Rational multiRational(Rational obj){
		Rational temp = null;
		if(b != 0){
			temp = new Rational();
			temp.a = a*obj.a;
			temp.b = b*obj.b;
		}
		return temp;
	}
	public Rational divideRational(Rational obj){
		Rational temp = null;
		if(b != 0){
			temp = new Rational();
			temp.a = a*obj.b;
			temp.b = b*obj.a;
		}
		return temp;
	}
	public Rational subRational(Rational obj){
		Rational temp = null;
		if(b != 0){
			temp = new Rational();
			temp.a = a*obj.b - b*obj.a;
			temp.b = b*obj.b;
		}
		return temp;
	}
	
}