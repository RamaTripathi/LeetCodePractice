/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package dynamicProgramming;


import java.util.LinkedList;

public class RemoveNthPointer {
	public static void main(String args[]) {

		LinkedList<ListNode> el = new LinkedList<ListNode>();
		ListNode head= new ListNode(1);
		ListNode e2= new ListNode(2);
		head.next=e2;
		ListNode e3 = new ListNode(3);
		e2.next= e3;
		ListNode e4 = new ListNode(4);
		e3.next=e4;
		ListNode e5 = new ListNode(5);
		e4.next=e5;
		e5.next=null;
		removeNthFromEnd(head,2).toString();

	}

	public static  ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode slowPtr=head, fastPtr = head, prev=head;
		for(int i=0; i <n-1 && slowPtr.next!=null  ; i++ )
		{
			slowPtr=slowPtr.next;
		}
		System.out.println("  --- " +slowPtr.val);
		fastPtr=slowPtr;
		slowPtr=head;
		// 1 ,2 ,3, 4 ,5
		while(fastPtr.next.next!=null)
		{
			prev=fastPtr;
			fastPtr=fastPtr.next;

		}
		prev.next=fastPtr.next;

		while(head.next !=null) {
			System.out.println(head.val);
			head=head.next;
		}
		return head;
	}
}
