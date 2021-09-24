package sample;


//import java.io.*; 

//Java program to implement 
//a Singly Linked List 
public class Linkedl{ 

	Node head; 
	static class Node { 

		String data; 
		Node next; 

		Node(String d) 
		{ 
			data = d; 
			next = null; 
		} 
	} 

	
	public static Linkedl insert(Linkedl list, String data) 
	{ 
		
		Node new_node = new Node(data); 
		new_node.next = null; 

		
		if (list.head == null) { 
			list.head = new_node; 
		} 
		else { 
			
			Node last = list.head; 
			while (last.next != null) { 
				last = last.next; 
			} 

			
			last.next = new_node; 
		} 

		
		return list; 
	} 

	 
	public static void display(Linkedl list) 
	{ 
		Node currNode = list.head; 

		System.out.print("Here goes the Linkedlist : "); 

	
		while (currNode != null) { 
			
			System.out.print(currNode.data + " "); 

		
			currNode = currNode.next; 
		} 
	} 

 
	public static void main(String[] args) 
	{ 
	
		Linkedl list = new Linkedl(); 

		
		// Insert the values 
		list = insert(list, "a"); 
		list = insert(list, "e"); 
		list = insert(list, "i"); 
		list = insert(list, "o"); 
		list = insert(list, "u"); 
	

		
		display(list); 
	} 
} 
