/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StudentImmutable {

	public final  int id;
	public final String name;
	public final  HashMap<String, String> hm;

	public StudentImmutable (int id, String name,HashMap<String, String> thm ) {
		this.id=id;
		this.name=name;
		HashMap<String, String> tempMap = new HashMap<>();
		for(Map.Entry<String,String> e : thm.entrySet()){
				tempMap.put(e.getKey(), e.getValue());
			}
		this.hm=tempMap;
	}
	public int getId(){
		return id;
	}

	public String getName() {
		return name;
	}

	public Map<String, String> getMetadata(){
		Map<String, String> tempMap = new HashMap<>();
		for(Map.Entry<String,String> e : hm.entrySet()){
			tempMap.put(e.getKey(), e.getValue());
		}
		return tempMap;

	}

	public static void main(String args[]) {
		Map<String, String> tempMap = new HashMap<>();
		tempMap.put("1","Rama");
		tempMap.put("2", "Abhi");
		tempMap.put("3", "OJ");


	}
}
