import java.util.Scanner;
class Matrix{
	int arr[][];
	public Matrix(){
		
	}
	public Matrix(int r, int c){
		arr = new int[r][c];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter matrix element");
		for(int i = 0; i<arr.length; i++){
			for(int j = 0; j<arr[i].length; j++){
				arr[i][j] = sc.nextInt();
			}
		}
	}
	
	public void displayMatrix(){
		System.out.println("Matrix is as below : ");
		for(int i = 0; i<arr.length; i++){
			for(int j = 0; j<arr[i].length; j++){
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public Matrix addMatrix(Matrix obj){
		Matrix temp = null;
		if(arr.length == obj.arr.length && arr[0].length == obj.arr[0].length){
			temp = new Matrix();
			temp.arr = new int[arr.length][arr[0].length];
			for(int i = 0; i<arr.length; i++){
				for(int j = 0; j<arr[i].length; j++){
					temp.arr[i][j] = arr[i][j]+obj.arr[i][j];				
				}
			}
		}
		return temp;
	
	}
	public Matrix multiplyMatrix(Matrix obj){
		Matrix temp1 = null;
		if(arr[0].length == obj.arr.length){
			temp1 = new Matrix();
			temp1.arr = new int[arr.length][obj.arr[0].length];
			for(int i=0; i<arr.length; i++){
				for(int j=0; j<obj.arr[0].length; j++){
					int sum=0;
					for(int k=0; k<arr[0].length; k++){
						sum += arr[i][k]*obj.arr[k][j];
					}
					temp1.arr[i][j] = sum;
				}
			}
		}
		return temp1;
	}
	public Matrix transposeMatrix(){
		Matrix temp = null;
		if(arr.length == arr[0].length ){
			temp = new Matrix();
			temp.arr = new int[arr.length][arr[0].length];
			for(int i=0; i<arr.length; i++){
				for(int j=0; j<arr[i].length; j++){
					temp.arr[j][i] = arr[i][j];
				}
			}
		}
		return temp;
	}
}