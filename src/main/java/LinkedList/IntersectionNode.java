/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package LinkedList;

public class IntersectionNode {

	public static void main(String[] args)
	{
		ListNode headA= new ListNode(12);
		ListNode headB= new ListNode(2);
	}
	public class Solution {
		public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
			if(headA== null || headB == null ) return null;
			ListNode pointerA=headA.next;
			ListNode pointerB=headB.next;
			boolean found=false;

			while(pointerA !=pointerB) {
				pointerA=pointerA.next;
				pointerB=pointerB.next;
			}
			if(  pointerA ==pointerB)
				return pointerA;
			else
				return null;
		}
	}
}
