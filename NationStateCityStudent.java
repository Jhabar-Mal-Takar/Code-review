import java.util.*;
import java.io.*;
class NationStateCityStudent{
	String nation;
	String state;
	String city;
	String name;
	public NationStateCityStudent(String nation,String state,String city,String name){
		this.nation = nation;
		this.state = state;
		this.city = city;
		this.name = name;
	}
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		ArrayList<NationStateCityStudent> list = new ArrayList<NationStateCityStudent>();
		HashMap<String,HashMap<String,HashMap<String, ArrayList<String>>>> map = 
		new HashMap<String,HashMap<String,HashMap<String, ArrayList<String>>>>();
		System.out.println("Enter the size of arraylist ");
		int size = sc.nextInt();
		for(int i=1; i<=size; i++){
			System.out.println("Please enter the nation");
			String nation = sc.next();
			System.out.println("Please enter the state");
			String state = sc.next();
			System.out.println("Please enter the City");
			String city = sc.next();
			System.out.println("Please enter the name ");
			String name = sc.next();
			list.add(new NationStateCityStudent(nation,state,city,name));
			System.out.println("--------------------------------------------------------");
		}
		for(NationStateCityStudent var : list){
			if(!(map.containsKey(var.nation))){
				map.put(var.nation, new HashMap<String,HashMap<String,ArrayList<String>>>());
		    }
			if(!map.get(var.nation).containsKey(var.state)){
				map.get(var.nation).put(var.state, new HashMap<String, ArrayList<String>>());
			}
			if(!map.get(var.nation).get(var.state).containsKey(var.city)){
				map.get(var.nation).get(var.state).put(var.city, new ArrayList<String>());
			}
			map.get(var.nation).get(var.state).get(var.city).add(var.name);
		}
		System.out.println("All student name record maintain according nation & state & city wise : ");
		for(String nation : map.keySet()){
			System.out.println("The nation name is : "+nation);
			for(String state : map.get(nation).keySet()){
				System.out.println("The state name is : "+state);
				for(String city : map.get(nation).get(state).keySet()){
					System.out.println("The city name is : "+city);
					System.out.println("The Student name is : "+map.get(nation).get(state).get(city));
					System.out.println("---------------------------------------------------------------");
				}
			}
		}
	}
}