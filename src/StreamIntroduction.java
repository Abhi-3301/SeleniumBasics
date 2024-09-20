import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

public class StreamIntroduction {

	
	public static void regular() {
		
		
		System.out.println("Start of regular() method");
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Abhishek");
		al.add("Ishwar");
		al.add("Akash");
		al.add("Nilkanth");
		al.add("Amol");
		
		int count = 0;
				
		for(String s : al) {
			
			if(s.startsWith("A")) count++;
		}
	
		System.out.println(count);
		
		System.out.println("\nEnd of regular() method");
	}
	
	public static void streamFilter() {
		
		System.out.println("\nStart of streamFilter() method\n");
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Abhishek");
		al.add("Ishwar");
		al.add("Akash");
		al.add("Nilkanth");
		al.add("Amol");
		
		
		//there is no life of intermediate operation if there is no terminal operation
		// terminal operation will execute only if inter operation (filter) return true
		// We can create stream
		//how to use filter stream in API
		
		Long count = al.stream().filter(s->s.startsWith("A")).count();
		System.out.println(count);
		
		
		long d = Stream.of("Abhishek","Ishwar","Akash","Nilkanth","Amol").filter(s->
		{
			s.startsWith("A");
			return false;
		}).count();
		
		System.out.println(d);
		
		
		//print all the names length > 4 of ArrayList
		al.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		
		//print First name length > 4 of ArrayList
		al.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println("With Limit " + s));
		
		
		System.out.println("\nEnd of streamFilter() method");
	}
	
	public static void streamMap() {
		
		System.out.println("\nStart of streamMap() method");
		
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Pune");
		al.add("Mumbai");
		al.add("Mumbai");
		al.add("Jalna");
		al.add("Parbhani");
		
		//print names which have last letter as "h" with upper case
		Stream.of("Abhishek","Ishwar","Akash","Nilkanth","Amol").filter(s->s.endsWith("h")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		//also can be written as Stream.of("Abhishek","Ishwar","Akash","Nilkanth","Amol").filter(s->s.endsWith("h")).forEach(s->System.out.println(s.toUpperCase()));
		
		//print names which have first letter as "a" with upper case and sorted
		List<String> ls = Arrays.asList("Abhishek","Ishwar","Akash","Nilkanth","Amol");
		ls.stream().filter(s->s.startsWith("a")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//Merging 2 different lists 
		
		Stream<String> st = Stream.concat(ls.stream(), al.stream());
		//st.sorted().forEach(s->System.out.println(s));
		
		boolean bl = st.anyMatch(s->s.equalsIgnoreCase("Abhishek"));
		System.out.println(bl);
		Assert.assertTrue(bl);
		
		System.out.println("\nEnd of streamMap() method");
	}
	
	public static void streamCollect() {
		
		System.out.println("\nStart of streamCollect() method");
		
		
		List<String> ls = Stream.of("Abhishek","Ishwar","Akash","Nilkanth","Amol").filter(s->s.endsWith("h")).map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(ls.get(0));
		
		List<Integer> ls2 = Arrays.asList(3,2,2,4,3,1,5,7);
		//print unique number from this array
		//sort the array and print the 2nd index value
		
		ls2.stream().distinct().forEach(s->System.out.println(s));
		
		List<Integer> ls3 = ls2.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(ls3.get(2));
		
		System.out.println("\nEnd of streamCollect() method");
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		regular();
		streamFilter();
		streamMap();
		streamCollect();

	}

}
