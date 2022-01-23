/*-----------------------------------------------------------------
	Author : Jhabar Mal Takar
	Date : Nov-16-2021
	Description:    Diagonal matrix transpose
                    Note: Don't use another temporary matrix, perform operation in the same matrix
	Status : Complete.
	-----------------------------------------------------------------*/
import java.util.Scanner;
class DiagonalMatrix{
	public static void main(String [] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int size = sc.nextInt();
		int row =size;
		int col =size;
		int a[][] = new int[row][col];
		System.out.println("Enter the elements of array :");
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("The Diagonal Transpoj Matrix is : ");
		int temp;
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				if(j>i){
					temp = a[i][j];
					a[i][j] = a[j][i];
					a[j][i] = temp;
				}
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}