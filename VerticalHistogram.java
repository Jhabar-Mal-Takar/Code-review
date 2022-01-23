class VerticalHistogram{
	public static void main(String []args){
		int []a = {5,6,1,7,3,4};
		
		// first findout the max number into the arrray
		int max = a[0];
		for(int i=0; i<a.length; i++){
			if(max<a[i]){
				max = a[i];
			}
		}
		//System.out.print(max);
	
		for(int i=0; i<max; i++){
			for(int j=0; j<a.length; j++){
				if(a[j] >= max-i){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}