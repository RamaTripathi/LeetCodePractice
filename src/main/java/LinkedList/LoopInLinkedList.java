/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package LinkedList;

public class LoopInLinkedList {
	Node head;


	public static void main(String args[]) {
		LoopInLinkedList llist = new LoopInLinkedList();

		llist.push(20);
		llist.push(4);
		llist.push(15);
		llist.push(10);

		/*Create loop for testing */
		llist.head.next.next.next.next = llist.head;

		llist.detectLoop();
	}

	public void push( int data) {
		Node node= new Node(data);
		node.next=head;
		head= node;
	}

	 void detectLoop() {
		Node slow_pointer=head;
		Node fast_pointer=head;
		int flag=0;

		while(slow_pointer!=null && fast_pointer != null && fast_pointer.next!=null) {
			slow_pointer=slow_pointer.next;
			fast_pointer=fast_pointer.next.next;

			if(slow_pointer==fast_pointer) {
				flag=1;
				break;
			}
		}

		 if (flag == 1)
			 System.out.println("Loop found");
		 else
			 System.out.println("Loop not found");

	}
}
