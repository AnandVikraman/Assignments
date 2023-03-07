package com.te.stream_api;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("aasan", "", "karthi", "", "kumar", "jagan");
		//List<String> list = Arrays.asList("aasan", "rajini", "karthi", "kamal", "kumar", "jagan");

		System.out.println("count the Empty String");
		System.out.println(list.stream().filter(x -> x.isEmpty()).count());// 2

		System.out.println("Count String whose length is more than five");
		System.out.println(list.stream().filter(i -> i.length() > 5).collect(Collectors.toList()));//1
		//list.stream().filter(i -> i.length() > 5).collect(Collectors.toList()).forEach(System.out::println);
		
		System.out.println("Count number of String which starts with 'a'.");
		System.out.println(list.stream().filter(i->i.startsWith("a")).count());//1
		
		System.out.println("Remove all empty Strings from List");
		System.out.println(list.stream().filter(i->!i.isEmpty()).collect(Collectors.toList()));

		System.out.println("Create a List with String more than 5 characters");
		System.out.println(list.stream().filter(i->i.length()>5).collect(Collectors.toList()));
		
		
		System.out.println("Convert String to uppercase and Join them with coma");
		List<String> collect = list.stream().map(i->i.toUpperCase()).collect(Collectors.toList());
		System.out.println(collect);
		//System.out.println(list.stream().map(i->i.toUpperCase()).collect(Collectors.toList()));
	
	List<Integer>integers =Arrays.asList(1,3,1,6,6,2);
	
	System.out.println("Create a List of the square of all distinct numbers");
	System.out.println(integers.stream().map(i->i*i).distinct().collect(Collectors.toList()));
	
	System.out.println("Get count, min, max, sum, and the average for numbers");
	System.out.println(integers.stream() .mapToInt((x) -> x).summaryStatistics().getAverage());//average
	System.out.println(integers.stream() .mapToInt((x) -> x).summaryStatistics().getCount());//count
	System.out.println(integers.stream() .mapToInt((x) -> x).summaryStatistics().getMax());//maximum
	System.out.println(integers.stream() .mapToInt((x) -> x).summaryStatistics().getMin());//minimum
	System.out.println(integers.stream() .mapToInt((x) -> x).summaryStatistics().getSum());//total
	}
}
