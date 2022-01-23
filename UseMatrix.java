import java.util.Scanner;
class UseMatrix{
	public static void main(String []args){
		int r,c;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter row and col of 1st mat : ");
		r = sc.nextInt();
		c = sc.nextInt();
		
		Matrix m1 = new Matrix(r,c);
		m1.displayMatrix();
		
		System.out.println("Enter row and col of 2nd mat : ");
		r = sc.nextInt();
		c = sc.nextInt();
		
		Matrix m2 = new Matrix(r,c);
		m2.displayMatrix();
		
		Matrix m3 = m1.addMatrix(m2);
		if(m3 != null){
			m3.displayMatrix();
		}
		else{
			System.out.println("The addtion is not performed");
		}
		
		Matrix m4 = m1.multiplyMatrix(m2);
		if(m4 != null){
			m4.displayMatrix();
		}
		else{
			System.out.println("The multiply is not performed");
		}
		Matrix m5 = m1.transposeMatrix();
		if(m5 != null){
			m5.displayMatrix();
		}
		else{
			System.out.println("The transpose is not performed");
		}
		
	}
}