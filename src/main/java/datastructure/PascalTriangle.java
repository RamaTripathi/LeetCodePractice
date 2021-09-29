/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package datastructure;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	public static void main(String args[]) {
		int n=4;
		List<Integer> prevop= new ArrayList<Integer>();
		List<Integer> newOp= new ArrayList<Integer>();

		System.out.println(prevop.size());
		newOp.add(1);
		newOp.add(1);
		for( int i=3 ; i < n ; i++ ) {
			{   prevop=newOp;
				newOp.clear();
				newOp.add(1);
				for( int j=0 ;j < prevop.size() ; j++) {
					newOp.add( prevop.get(j)+prevop.get(j+1));
				}
				newOp.add(1);
			}
		}
		for( Integer i : newOp)
		System.out.print(i);
	}

	public static  List<Integer> getRow(int rowIndex) {
		List<Integer> previousRow = new ArrayList<>();
		previousRow.add(1);
		while (rowIndex-- > 0) {
			List<Integer> currentRow = new ArrayList<>();
			currentRow.add(1);
			for (int i = 0; i < previousRow.size() - 1; i++) {
				currentRow.add(previousRow.get(i) + previousRow.get(i + 1));
			}
			currentRow.add(1);
			previousRow = currentRow;
		}
		return previousRow;
	}
}
