package com.dipanshu.java8;
public class lamdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Anonymous obj = new Anonymous() {
//			public void show() {
//				System.out.println("Hello Dipanshu");
//			}
//			
//			public void printNum(int x) {
//				System.out.println("hell dipanshu!!");
//			}
//		};
//		obj.show();
//		obj.printNum(44);
		
		Anonymous lamda = () -> {
			System.out.println("hello dipnshu");
		};
		lamda.show();
		lamda.display();

	}

}
