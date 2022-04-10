package com.sample.sets;
import java.util.NavigableSet;
import java.util.TreeSet;
public class testhashmap 
{
	
	public static void main(String[] args)
	
	{
		NavigableSet<Integer> set= new TreeSet<Integer>();
		set.add(67);
		set.add(56);
		set.add(7);
		set.add(23);
		set.add(92);
		System.out.println(set);
		
		System.out.println("What is the element lower of 67: " +set.lower(67));
		System.out.println("What is the element floor of 67: " +set.floor(67));
		System.out.println("What is the element of higher of 74 " +set.higher(67));
		System.out.println("What is the ceiling of 67 " +set.ceiling(67));
		System.out.println("-------------------");
		System.out.println("what is the first elemnt: " +set.first());
		System.out.println("what is the last elemnt : " +set.last());
		System.out.println("Descendind set:" +set.descendingSet());
		System.out.println("------------");
		
		NavigableSet<Integer> headset = set.headSet(67, true);
		System.out.println("headset: " +headset);
		headset.add(9);
		System.out.println("Headset: " +headset);
		System.out.println("Origin Set: "+set);
	}

}
