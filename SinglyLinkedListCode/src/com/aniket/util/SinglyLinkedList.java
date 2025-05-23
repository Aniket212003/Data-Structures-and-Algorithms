package com.aniket.util;

import java.util.NoSuchElementException;
import java.util.StringJoiner;

public class SinglyLinkedList 
{
		private Node first;
		private Node last;
		private int count;
		
		private static class Node
		{
			private int data;
			private Node next;
			
			public Node(int data)
			{
				this.data = data;
			}
		}
		
		public void add(int data)
		{
			if(first == null)
			{
				Node node = new Node(data);
				first = node;
				last = node;
				count++;
			}
			else
			{
				Node node = new Node(data);
				last.next = node;
				last = last.next;
				count++;
			}
		}
		
		public int size()
		{
			return count;
		}
	
		public void addFirst(int element)
		{
			
			if(first == null)
			{
				Node node = new Node(element);
				first = node;
				last = node;
				count++;
			}
			else
			{
				Node node = new Node(element);
				node.next = first;
				first = node;
				count++;
			}
			
		}
		
		
		public void addLast(int element)
		{
			add(element);
		}
		
		
		// Helper-Utility Function
		private Node getNodeAt(int index) 
		{
			if(index < 0 || index >= count)
			{
				throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + count );
			}
				
			Node node = first;
			int i;	
			for(i=0;i<count;i++)
			{
				if(i==index)
				{
					return node;
				}
				node = node.next;
			}
			
			return null;
		}
		
		public int getElement(int index)
		{
			Node node = getNodeAt(index);
			return node.data;
		}
		
		public int setElement(int index, int element)
		{
			if(first == null)
			{
				throw new NoSuchElementException("List is Empty !!");
			}
			//Node node = new Node(element);
			Node t = getNodeAt(index);
			int item = t.data;
			t.data = element;
			
			return item;
		}
		
	
		//Display 
		public void displayLinkedList()
		{
			for(Node node=first;node!=null;node = node.next)
			{
				System.out.print(node.data + "->");
			}
			System.out.println("null");
		}
		
		//1.Write a function sum() which well return sum of elements from linked list
		public long sum()
		{
			if(first == null)
			{
				throw new NoSuchElementException("List is Empty !!");
			}
			
			int sum = 0;
			for(Node node=first;node!=null;node = node.next)
			{
				sum += node.data;
			}
			return sum;
		}
		
		//2.Write a function dispOddEven() which well print even & Odd numbers separately
		public void displayEvenOdd()
		{
			if(first == null)
			{
				throw new NoSuchElementException("List is Empty !!");
			}
			
			System.out.print("Even : ");
			for(Node node=first;node!=null;node = node.next)
			{
				if(node.data%2==0)
				{
					System.out.print(node.data + " ");
				}
			}
			System.out.println();
			System.out.print("Odd : ");
			for(Node node=first;node!=null;node = node.next)
			{
				if(node.data%2!=0)
				{
					System.out.print(node.data + " ");
				}
			}
			System.out.println();
		}
	
		
		//3.Write a function length() which will return count of nodes in LinkedList.
		public int length()
		{
			return count;
		}
		
		
		//4.Write a Function dispAlternate() which will display alternates nodes.
		public void dispAltrnate()
		{
			if(first == null)
			{
				throw new NoSuchElementException("List is Empty !!");
			}
			
			int i;
			for(i=0;i<count;i+=2)
			{
				System.out.print(getNodeAt(i).data + " ");				
			}
			System.out.println();
		}
		
		
		//5.Write a Function findMax() which well return max element from Linkedlist.
		public int findMax()
		{
			if(first == null)
			{
				throw new NoSuchElementException("List is Empty !!");
			}
			
			int max = first.data;
			for(Node T = first;T!=null;T=T.next)
			{
				if(max < T.data)
				{
					max = T.data;
				}
			}
			return max;
		}
		
		//6.Write a Function findMin() which well return max element from Linkedlist.
		public int findMin()
		{
			if(first == null)
			{
				throw new NoSuchElementException("List is Empty !!");
			}
			
			int min = first.data;
			for(Node T = first;T!=null;T=T.next)
			{
				if(min > T.data)
				{
					min = T.data;
				}
			}
			return min;
		}
		
		
		
		@Override
		public String toString()
		{
			StringJoiner sj = new StringJoiner(",","[","]");
			for(Node node=first;node!=null;node = node.next)
			{
				sj.add(String.valueOf(node.data));
			}
			return sj.toString();
		}
}
