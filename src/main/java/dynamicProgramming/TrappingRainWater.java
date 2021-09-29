/*
 * Copyright (c) 2021.
 *
 * Authored By Rama Abhimanyu Sharma
 */

package dynamicProgramming;

public class TrappingRainWater {
	public static void main(String args[]){
		int[]height = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(trap(height));
	}

	public static  int trap(int[] height) {
		int n=height.length;
		if(n==2) return 0;
		int lmax=height[0];int rmax=height[n-1];
		int left=1,right=n-2, res=0;
		while( left<=right) {
			if(lmax<rmax){
					if(height[left]>lmax)
					{
						lmax=height[left];
					}else{
						res=res+lmax-height[left];
					}
						left++;
			}else{
						if(height[right]>rmax) {
							rmax=height[right];
						}else{
							res=res+rmax-height[right];
						}
					right--;
			}

		}

	return res;
		}


}
