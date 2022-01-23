/*-----------------------------------------------------------------
	Author : Jhabar Mal Takar
	Date : Nov-16-2021
	Description:    Matrix Multiplication.
	Status : Complete.
	-----------------------------------------------------------------*/
import java.util.Scanner;
class MatrixMulti{
	public static void main(String [] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of r1 :");
		int r1 =sc.nextInt();
		System.out.println("Enter the size of c1 :");
		int c1 =sc.nextInt();
		int a[][] = new int[r1][c1];
		System.out.println("Enter the elements of array :");
		for(int i=0; i<r1; i++){
			for(int j=0; j<c1; j++){
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the size of r2 :");
		int r2 =sc.nextInt();
		System.out.println("Enter the size of c2 :");
		int c2 =sc.nextInt();
		int b[][] = new int[r2][c2];
		System.out.println("Enter the elements of array :");
		for(int i=0; i<r2; i++){
			for(int j=0; j<c2; j++){
				b[i][j] = sc.nextInt();
			}
		}
		if(c1 == r2){
			int res[][] = new int[r1][c2];
			System.out.println("The Multiplication of two matrix is :");
			for(int i=0; i<r1; i++){
				for(int j=0; j<c2; j++){
					int sum=0;
					for(int k=0; k<c1; k++){
						sum += a[i][k]*b[k][j];
					}
					res[i][j] = sum;
					System.out.print(res[i][j]+"\t");
				}
				System.out.println();
			}
		}
		else{
			System.out.println("Matrix Multiplication not possible ");
		}
		
	}
}