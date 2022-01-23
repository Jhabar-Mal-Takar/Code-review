import java.util.Scanner;
class ReverseStringWords{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String b = sc.nextLine();;
		char [] a = b.toCharArray();
		/*for(int l=0; l<a.length; l++){
			System.out.print(a[l]);
		}
		System.out.println();*/
		
		
		int last = a.length;
		for(int i = a.length-1; i >= 0; i--){
			if(a[i]==' '){
				for(int j=i+1; j<last; j++){
					System.out.print(a[j]);
				}
				System.out.print(" ");
				last = i;
			}
			else if(i == 0){
				for(int k=i; k<last; k++){
					System.out.print(a[k]);
				}
			}
		} 
	} 
}
