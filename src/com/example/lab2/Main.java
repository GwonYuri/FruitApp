package com.example.lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Fruit> fl = new ArrayList<Fruit>();
		
		// 과일 10개 추가
		fl.add(new Fruit(101, "Apple", 1000)); 
		fl.add(new Fruit(102, "Orange", 1500)); 
		fl.add(new Fruit(103, "Kiwi", 2000));
		fl.add(new Fruit(104, "Banana", 1300)); 
		fl.add(new Fruit(105, "Melon", 1700)); 
		fl.add(new Fruit(106, "Lemon", 1200));
		fl.add(new Fruit(107, "Watermelon", 1300)); 
		fl.add(new Fruit(108, "Pear", 1500)); 
		fl.add(new Fruit(109, "Strawberry", 1400));
		fl.add(new Fruit(110, "Peach", 1900));
		
		System.out.println("Fruit List (ordered by name)");
		Collections.sort(fl, new FruitComparator());
		
		for(Fruit s:fl) {
			System.out.println(s.toString());
		}
		
		System.out.println("Fruit List (reversed ordered by name)");
		Collections.sort(fl, new FruitComparatorDesc());
		
		for(int i=0; i<fl.size(); i++) {
			System.out.println(fl.get(i).toString());
		}

	}

}
