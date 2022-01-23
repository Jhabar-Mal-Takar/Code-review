import java.util.*;
import java.io.*;
class FindStateCityStudent{
	String state;
	String city;
	String name;
	public FindStateCityStudent(String state,String city,String name){
		this.state = state;
		this.city = city;
		this.name = name;
	}
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		ArrayList<FindStateCityStudent> list = new ArrayList<FindStateCityStudent>();
		HashMap<String,HashMap<String,ArrayList<String>>> map = new HashMap<String,HashMap<String,ArrayList<String>>>();
		System.out.println("Enter the size of arraylist ");
		int size = sc.nextInt();
		for(int i=1; i<=size; i++){
			System.out.println("Please enter the state");
			String state = sc.next();
			System.out.println("Please enter the City");
			String city = sc.next();
			System.out.println("Please enter the name ");
			String name = sc.next();
			list.add(new FindStateCityStudent(state,city,name));
			System.out.println("--------------------------------------------------------");
		}
		for(FindStateCityStudent var : list){
			if(!(map.containsKey(var.state))){
				map.put(var.state, new HashMap<String,ArrayList<String>>());
		    }
			if(!map.get(var.state).containsKey(var.city)){
				map.get(var.state).put(var.city, new ArrayList<String>());
			}
			map.get(var.state).get(var.city).add(var.name);
		}
		System.out.println("Record name maintain by state & city wise : ");
		for(String state : map.keySet()){
			System.out.println("The state name is : "+state);
			for(String city : map.get(state).keySet()){
				System.out.println("	The city name is : "+city);
				System.out.println("		The Student name is : "+map.get(state).get(city));
			}
		}
	}
}