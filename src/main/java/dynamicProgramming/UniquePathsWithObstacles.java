/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package dynamicProgramming;

public class UniquePathsWithObstacles {

	public static void main(String args[]) {
		int[][] obstacleGrid = {{0,0,0},{0,1,0},{0,0,0}};
		System.out.print(uniquePathsWithObstacles(obstacleGrid));

	}
	public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
		int row=obstacleGrid.length;
		int column=obstacleGrid[0].length;
		int dp[][] = new int[row][column];

		for(int i= row-1; i >=0 ; i--){
			for(int j=column-1 ;j>=0; j--){
				if(i==row-1 || j==column-1  &&  obstacleGrid[i][j]==0) {
					dp[i][j]=1;
				}
				else if (obstacleGrid[i][j]==0){
					dp[i][j]=0;

				}else{
					dp[i][j]= dp[i+1][j] + dp[i][j+1];
				}
			}
		}

		return dp[0][0];
	}
}
