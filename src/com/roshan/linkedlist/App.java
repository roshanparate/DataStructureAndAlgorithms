package com.roshan.linkedlist;

public class App {

	public static void main(String... arg){
		MyLinkedList<Integer> linkedList = new MyLinkedList<>();
		linkedList.insert(12);
		linkedList.insert(110);
		linkedList.insert(89);
		linkedList.insert(-652);
		linkedList.insert(55);
		
		//linkedList.traverselist();
		linkedList.remove(55);
		System.out.println(linkedList.size());
		
		linkedList.traverselist();
	}
	
}
