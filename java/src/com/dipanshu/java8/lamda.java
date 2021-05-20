package com.dipanshu.java8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class lamda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l = Arrays.asList(1,2,3,4,5,6);
		
		
//		for(int i=0;i<6;i++) {
//			System.out.println(l.get(i));
//		}
//		Iterator<Integer> i = l.iterator();
//		while(i.hasNext()) {
//			System.out.println(i.next());
//			
//		}
         for(int i : l) {
        	 System.out.println(i);
         }
	}

}
