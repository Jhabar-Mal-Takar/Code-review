import java.util.Scanner;
class UseRational{
	
	public static void main (String [] args){
		int r1, r2;
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter 1st numerator  number : ");
	    r1 = sc.nextInt();
	    System.out.println("Enter 1st denominator number : ");
	    r2 = sc.nextInt();
		Rational obj = new Rational(r1, r2);
		obj.displayRationalNum();
		
	    System.out.println("Enter 2st numerator number : ");
	    r1 = sc.nextInt();
	    System.out.println("Enter 2st denominator number : ");
	    r2 = sc.nextInt();
		Rational obj1 =new Rational(r1, r2);
		obj1.displayRationalNum();
		Rational resAdd = obj.addRational(obj1);
		if(resAdd != null){
			resAdd.displayRationalNum();
		}
		else{
			System.out.println("Not a rational number");
		}
		Rational resMulti = obj.multiRational(obj1);
		if(resMulti != null){
			resMulti.displayRationalNum();
		}
		else{
			System.out.println("Not a rational number");
		}
		Rational resDivide = obj.divideRational(obj1);
		if(resDivide != null){
			resDivide.displayRationalNum();
		}
		else{
			System.out.println("Not a rational number");
		}
		Rational resSub = obj.subRational(obj1);
		if(resSub != null){
			resSub.displayRationalNum();
		}
		else{
			System.out.println("Not a rational number");
		}
	}
}