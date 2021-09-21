package sample;


public class Doublyll{    
	  
   
    class Node{    
        String data;    
        Node prev;    
        Node next;    
  
        public Node(String data) {    
            this.data = data;    
        }    
    }    
  
    
    Node head = null;  
    Node tail = null;    
  
      
    public void insert(String data) {    
     
        Node newNode = new Node(data);    
  
        
        if(head == null) {  
              
            head = newNode;  
            tail = newNode;  
              
            head.prev = null;      
            tail.next = null;    
        }  
        
        else {    
  
           
            tail.next = newNode;    
            
            newNode.prev = tail;    
            
            tail = newNode;    
           
            tail.next = null;    
        }    
    }    
  
       
    public void display() {  
           
        Node current = head;    
       
        if(head == null) {  
            
            System.out.println("List is empty");    
            return;    
        }  
      
        System.out.println("Here goes the Doublylinkedlist: ");    
        
        while(current != null) {    
            System.out.print(current.data + "\n");    
            current = current.next;    
        }    
    }    
  
    public static void main(String[] args) {    
  
    	Doublyll obj = new Doublyll();    
  
        //Add nodes into the doubly linked list   
        obj.insert("Red");    
        obj.insert("Blue");    
        obj.insert("purple");    
        obj.insert("yellow");    
        obj.insert("black");    
  
        //Call showData() method for displaying doubly linked list data    
        obj.display();    
    }    
}  