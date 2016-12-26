package com.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sample {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(null);
		list.add(3);
		list.add(1,6);
		list.add(null);
		list.add(1,5);
		//list.stream().forEach();
		System.out.println("List..."+list);
		//while(list.remove(2) == null);
		System.out.println("List..."+list);
		System.out.println(list.size());
		//list.removeAll(Collections.singleton(null));
		//System.out.println("List..."+list);
				
		for(Integer b : list){
			if(b!=null)
			System.out.println("---"+b);
		}
		
	}

}
