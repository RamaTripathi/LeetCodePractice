/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package design.patterns.builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {

	public List<Item> items =new ArrayList<Item>();

	public void addItem(Item item) {
		items.add(item);
	}

	public void showItems() {
		for (Item item : items) {
			System.out.print("Item : " + item.name());
			System.out.print(", Packing : " + item.packing().packing());
			System.out.println(", Price : " + item.price());
		}
	}
		public float getCost(){
			float cost = 0.0f;

			for (Item item : items) {
				cost += item.price();
			}
			return cost;
		}

}
