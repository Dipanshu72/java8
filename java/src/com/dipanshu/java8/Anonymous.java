package com.dipanshu.java8;


@FunctionalInterface
public interface Anonymous {
	
	void show();
	
//	void printNum(int x);
	
	static void print() {
		System.out.println("i am static method");
	}
	
	default void display() {
		System.out.println("i am deafult method");
	}

}
