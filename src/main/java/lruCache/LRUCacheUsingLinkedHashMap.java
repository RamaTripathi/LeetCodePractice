/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package lruCache;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCacheUsingLinkedHashMap {
	private LinkedHashMap<Integer,Integer> map;
	private final int CAPACITY;

	public LRUCacheUsingLinkedHashMap(int capacity) {
		CAPACITY = capacity;
		this.map= new LinkedHashMap<Integer,Integer>(capacity, 0.75F,true) {
			protected boolean removeEldestEntry(Map.Entry latest) {
				return size() > CAPACITY;
			}
		};
	}

	public int get(int key) {
		return map.getOrDefault(key, -1);
	}

	public void set(int key, int value)
	{
		System.out.println("Going to set the (key, " +
				"value) : (" + key + ", " + value + ")");
		map.put(key, value);
	}

	public static void main(String[] args)
	{
		System.out.println("Going to test the LRU "+
				" Cache Implementation");
		LRUCacheUsingLinkedHashMap cache = new LRUCacheUsingLinkedHashMap(2);

		// it will store a key (1) with value
		// 10 in the cache.
		cache.set(1, 10);

		// it will store a key (1) with value 10 in the cache.
		cache.set(2, 20);
		System.out.println("Value for the key: 1 is " +
				cache.get(1)); // returns 10

		// evicts key 2 and store a key (3) with
		// value 30 in the cache.
		cache.set(3, 30);

		System.out.println("Value for the key: 2 is " +
				cache.get(2)); // returns -1 (not found)

		// evicts key 1 and store a key (4) with
		// value 40 in the cache.
		cache.set(4, 40);
		System.out.println("Value for the key: 1 is " +
				cache.get(1)); // returns -1 (not found)
		System.out.println("Value for the key: 3 is " +
				cache.get(3)); // returns 30
		System.out.println("Value for the key: 4 is " +
				cache.get(4)); // return 40

	}

}
