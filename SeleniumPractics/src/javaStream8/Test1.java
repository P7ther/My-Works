package javaStream8;

import java.text.Collator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 
{
	
	//Count the number of news starting with Alphabet A in list
	//@Test
	public void Checking() 
	{
	ArrayList<String> names = new ArrayList<String>();

	names.add("Akshya");
	names.add("Lalita");
	names.add("Amer");
	names.add("Meena");
	names.add("Avishek");
	
	   int count=0;
   for(int i=0;i<names.size();i++) 
    {
	   String actual=names.get(i);
	   if(actual.startsWith("A")) 
	   {
		   count++;
	   }
	   
    }
   System.out.println(count);
   
}
	
	
	//Lamda Operation
	//@Test
	public void StreamFilter() 
	{
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Akshya");
		names.add("Lalita");
		names.add("Amer");
		names.add("Meena");
		names.add("Avishek");
		
		// There is no life for intermidate opertaion if there is no terminal operation
		// Terminal Operation will execute only if inter operation(Filter) returns true.
		// We can create Stream
		// How to use filter in Stream API
		
		names.stream().filter(s->s.startsWith("A")).count();
		Stream.of("Satyajit","Arup","Saurav","Ram","Lisa").filter(s->
		{
	    	s.startsWith("A");
	    	return true;
		
     	}).count();
		
	}
	
	//@Test
	public void streamMap() 
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Akshya");
		names.add("Lalita");
		names.add("Amer");
		names.add("Meena");
		names.add("Avishek");
		
		//print names which have last letter as "a" with uppercase
		Stream.of("Satyajit","rama","gita","Sita","Adam","Suman").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
		
		
		List<String>name =Arrays.asList("Satyajit","rama","gita","sita","Adam");
		name.stream().filter(s->s.startsWith("S")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//Merge 2 different Lists 
		Stream<String> newstream = Stream.concat(names.stream(), name.stream());
		//newstream.sorted().forEach(s->System.out.println(s));
		boolean flag=newstream.anyMatch(s->s.equalsIgnoreCase("Amer"));
		Assert.assertTrue(flag);
		System.out.println(flag);
	
	}
	
	@Test
	public void streamCollect() 
	{
		
		List<Integer> name1= Arrays.asList(3,2,2,7,5,7,9,7);
		//print unique number from this array
		//sort the array
		//name1.stream().distinct().forEach(s->System.out.println(s));
		List <Integer>li=name1.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));
		
		
	}
	
	
	
	
}
