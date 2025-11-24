package com.freeIpt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectionConcept {
	public static void method1() {
	String [] str = { "karthick" , "muthu" , "gayathri" , "vicky" , "muthu"};
	for( int i = 0 ; i< str.length ; i++ ) {
		System.out.println(str[i]);
		}
	
	for (String string : str) {
			System.out.println(string);
		}
	
//	List<String> list = new ArrayList<String>( Arrays.asList(str));
//	System.out.println(list);
	List<String > herolist = Arrays.stream(str).collect(Collectors.toList());
	System.out.println(herolist);
//	Set<String> set = new TreeSet(list);
//	System.out.println(set);
	
	
	}
	
	public static void method2() 
	{
		List <Integer> number = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
		
		number.forEach( num -> System.out.println(num));
		
		List<Integer> evenNumber = number.stream().filter(num -> num%2  == 0  && num>0  ).collect(Collectors.toList());
		System.out.println(evenNumber);
		
	}
	
	
	
	public static void main(String[] args) {
		
		method1();
		method2();
	}

}
