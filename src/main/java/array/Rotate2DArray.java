/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package array;

public class Rotate2DArray {

	// required output
	/*
	{1,2,3},
	{4,5,6},
	{7,8,9}
	 */
	public static void main (String args[]) {
		int[][]  matrix= { {1,2,3},{4,5,6},{7,8,9}};
		int[][]  matrix1={{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
		//rotate(matrix);
		rotate(matrix1);
	}
	public static void rotate(int[][] matrix) {
		int row = matrix.length;

		for(int i=0; i < row; i++ ) {
			for(int j=i ; j < row ;j++) {
				int t = matrix[i][j];
				matrix[i][j]=matrix[j][i];
				matrix[j][i]=t;

			}
		}
		for(int i=0;  i < row; i++ ) {
			for (int j = 0; j < row/2; j++) {
				int t = matrix[i][j];
				matrix[i][j]=matrix[i][row-1-j];
				matrix[i][row-1-j]=t;
			}
		}

		for(int i=0; i < row; i++ ) {
			System.out.println();
			for (int j = 0; j < row; j++) {
				System.out.print(" " + matrix[i][j] + " ");
			}

		}
	}


}
