package Implementation_Of_Fifo_Queue;

public class Implementation_Of_Fifo_Queue {
	
	public class Queue_Linked_List {
	    
	    static class Node {
	        int data;
	        Node next;

	        Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    static class Queue {
	        private Node front, rear;

	        public Queue() {
	            this.front = this.rear = null;
	        }

	        
	        public void enqueue(int data) {
	            Node newNode = new Node(data);

	            
	            if (this.rear == null) {
	                this.front = this.rear = newNode;
	                return;
	            }

	            
	            this.rear.next = newNode;
	            this.rear = newNode;
	        }

	        
	        public int dequeue() {
	            
	            if (this.front == null) {
	                System.out.println("Queue is empty");
	                return -1;
	            }

	            
	            int data = this.front.data;
	            this.front = this.front.next;

	           
	            if (this.front == null) {
	                this.rear = null;
	            }

	            return data;
	        }

	        
	        public boolean isEmpty() {
	            return front == null;
	        }

	        
	        public void display() {
	            Node current = front;
	            while (current != null) {
	                System.out.print(current.data + " ");
	                current = current.next;
	            }
	            System.out.println();
	        }
	    }

	    public static void main(String[] args) {
	        Queue queue = new Queue();
	        queue.enqueue(1);
	        queue.enqueue(2);
	        queue.enqueue(3);

	        System.out.print("Queue elements: ");
	        queue.display(); 

	        System.out.println("Dequeued element is: " + queue.dequeue()); 
	        System.out.print("Queue elements after dequeue: ");
	        queue.display(); 
	    }
	}

	

}
