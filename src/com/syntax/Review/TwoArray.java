package com.syntax.Review;

import java.util.Arrays;

public class TwoArray {

	public static void main(String[] args) {
		int [][] array = new int[2][3];

		//1st row or 1st array:
		array[0][0]=10;
		array[0][1]=20;
		array[0][2]=30;
		
		//2nd row or 2nd array:
		array[1][0] = 1;
		array[1][1] = 2;
		array[1][2] = 3;
		
		System.out.println(array.length); //size is = 2 1D arrays
		
		int[][] numbers = {{1,2,3}, {4,5,6}, {7,8,9}};
		System.out.println(numbers.length); //3
		
		//how to get all elements from a 2D array
		
		for (int row=0; row< numbers.length; row++) {
		
			for(int cols=0; cols<numbers[row].length; cols ++) {
				
				System.out.print(numbers[row][cols]);
			}
			
			System.out.println();
				
		} System.out.println("get all elements from 2D array using each loop");
		
		for (int[] nums:numbers) {
			for (int num:nums) {
				System.out.print(num + "");
			}
		
				System.out.println();
			}
			
		
		int[] arr = {10, 67, 3, 9};
		
		Arrays.sort(arr);
		
		System.out.println(arr[arr.length - 1]);
		
		
		
		}
		
		
		
	}

