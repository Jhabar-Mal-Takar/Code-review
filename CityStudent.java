import java.util.*;
import java.io.*;
class Student{
	String city;
	String name;
	public Student(String name, String city){
		this.city = city;
		this.name = name;
	}
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> list = new ArrayList<Student>();
		HashMap<String,ArrayList<String>> map = new HashMap<String,ArrayList<String>>();
		System.out.println("Enter the size of arraylist ");
		int size = sc.nextInt();
		for(int i=1; i<=size; i++){
			System.out.println("Please enter the name : ");
			String name = sc.next();
			System.out.println("Please enter the City : ");
			String city = sc.next();
			list.add(new Student(name,city));
			System.out.println("-------------------------------------------------------------------");
		}
		for(Student var :list){
			if(!(map.containsKey(var.city))){
				map.put(var.city, new ArrayList<String>());
		    }
			map.get(var.city).add(var.name);
		}
		System.out.println("All student name maintain by city name : ");
		for(String key: map.keySet()){
			System.out.println(key);
			System.out.println("	"+map.get(key));
		}
	}
}