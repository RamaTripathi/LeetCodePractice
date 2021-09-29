/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package lruCache;

import java.util.HashMap;

public class LRUCache {

	private HashMap<Integer,Node> hm;
	private int capacity, cnt;
	private Node head,tail;

	public LRUCache(int capacity) {

		this.capacity=capacity;
		hm=new HashMap<Integer,Node>();
		head=new Node(0,0);
		tail=new Node(0,0);
		head.prev=null;
		head.next=tail;
		tail.next=null;
		tail.prev=head;
		cnt=0;
	}

	public void addToHead( Node node) {

		node.next=head.next;
		node.next.prev = node;
		node.prev=head;
		head.next=node;
	}

	public void deleteNode(Node node) {
		node.prev.next= node.next;
		node.next.prev=node.prev;
	}

	public int get(int key) {
		if(hm.get(key)!=null ) {
			Node node= hm.get(key);
			int res = node.value;
			deleteNode(node);
			addToHead(node);
			System.out.println("Got the value : " + res
					+ " for the key: " + key);
			return res;
		}
		System.out.println("Did not get any value"
				+ " for the key: " + key);
		return -1;
	}

	public void set(int key, int value) {
		System.out.println("Going to set the (key, "
				+ "value) : (" + key + ", "
				+ value + ")");

		if(hm.get(key) != null) {
			Node node =hm.get(key);
			node.value =value;
			deleteNode(node);
			addToHead(node);
		}
		else {
			Node node = new Node(key, value);
			hm.put(key,node);
			if(cnt<capacity) {
				cnt++;
				addToHead(node);
			}
			else {
				hm.remove(tail.prev.key);
				deleteNode(tail.prev);
				addToHead(node);
			}

		}


	}


}
