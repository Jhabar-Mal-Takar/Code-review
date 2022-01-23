import java.util.*;
class CharacterCount{
	String sentance;
	CharacterCount(String sentance){
		this.sentance = sentance;
	}
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		HashMap<Character,Integer> map1 = new HashMap<Character,Integer>();
		System.out.println("Enter a string : ");
		String sentance = sc.nextLine();
		new CharacterCount(sentance);
		char[]arr = sentance.toCharArray();
		for(int i=0; i<arr.length; i++){
			if(arr[i] != ' '){
				if(!map1.containsKey(arr[i])){
					map1.put(arr[i],0);
				}
				map1.put(arr[i], map1.get(arr[i])+1);
			}
		}
		System.out.println("Charcaters     "+ "Character count   ");
		for(Character ch : map1.keySet()){
			System.out.print(ch+"              ");
			System.out.println(map1.get(ch));
		}
	
	}
}
		