package com.aniket;

import com.aniket.util.SinglyLinkedList;

public class App {

	public static void main(String[] args) 
	{
		SinglyLinkedList L = new SinglyLinkedList();
		L.add(11);
		L.add(22);
		L.add(33);
		L.add(44);
		L.add(55);
		
		
		System.out.println("Maximum Element : " + L.findMin());
		System.out.println("-------------------------------");
		System.out.println(L);
		//System.out.println();

	}

}
