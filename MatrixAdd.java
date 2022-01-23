/*-----------------------------------------------------------------
	Author : Jhabar Mal Takar
	Date : Nov-16-2021
	Description:    Matrix Addition
	Status : Complete.
	-----------------------------------------------------------------*/
import java.util.Scanner;
class MatrixAdd{
	public static void main(String [] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of r :");
		int r =sc.nextInt();
		System.out.println("Enter the size of c :");
		int c =sc.nextInt();
		int a[][] = new int[r][c];
		System.out.println("Enter the elements of 1st array :");
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				a[i][j] = sc.nextInt();
			}
		}
		int b[][] = new int[r][c];
		System.out.println("Enter the elements of 2nd array :");
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				b[i][j] = sc.nextInt();
			}
		}
		int res[][] = new int[r][c];
		System.out.println("The addition of two matrix is :");
		for(int i=0; i<r; i++){
			for(int j=0; j<c; j++){
				res[i][j] = a[i][j] + b[i][j];
				System.out.print(res[i][j]+"\t");
			}
			System.out.println();
		}
	}
}