/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalTriangle {
	public static void main(String args[]) {
		int n=4;
		List<Integer> prevop= new ArrayList<Integer>();
		List<Integer> newOp= new ArrayList<Integer>();

		List<Integer>  res= getRow1(n);


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
	public static  List<Integer> getRow1(int rowIndex) {

		List<Integer> pRow= new ArrayList<Integer>();
		pRow.add(1);pRow.add(1);

		for(int i=1 ;i < rowIndex ; i++) {
			List<Integer> cRow= new ArrayList<Integer>();
			cRow.add(1);
			for(int j=1 ; j <=i ;j++) {
				cRow.add(pRow.get(j - 1) + pRow.get(j));
			}
			cRow.add(1);
			pRow=cRow;
		}
		return  pRow;

	}

	public static List<List<Integer>> generatePascal(int numRows) {
		List<List<Integer>> res= new ArrayList<List<Integer>>();
		List<Integer> pRow= new ArrayList<Integer>();
		pRow.add(1);pRow.add(1);

		for(int i=1 ;i < numRows ; i++) {
			List<Integer> cRow= new ArrayList<Integer>();
			cRow.add(1);
			for(int j=1 ; j <=i ;j++) {
				cRow.add(pRow.get(j - 1) + pRow.get(j));
			}
			cRow.add(1);
			pRow=cRow;
			res.add(pRow);
		}
		return res;
	}
}
