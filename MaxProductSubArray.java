package com.aditya.mlabs.tester;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class MaxProductSubArray {

	public static void main(String args[]){
		
		int[] arr = new int[5];
		arr[0] = 6;
		arr[1] = -3;
		arr[2] = -10;
		arr[3] = 0;
		arr[4] = 2;
		
		maxProd(arr);
		
		
	}

	private static int maxProd(int[] arr) {
		
		Set<Integer> prodsOfSubArr = new HashSet<Integer>();
		
		
		for (int i = 0; i < arr.length; i++)
	    {
	        // j is the number of elements which should be printed
	        for (int j = i; j < arr.length; j++)
	        {
	            // print the array from i to j
	        	Set<Integer> prodsOfSubArrONE = new HashSet<Integer>();
	            for (int k = i; k <= j; k++)
	            {
	            	prodsOfSubArrONE.add(arr[k]);
	            }
	            int ans=1;
	            for(int f : prodsOfSubArrONE){
	            	ans = ans * f; 
	            }
	            prodsOfSubArr.add(ans);
	        }
	    }
		
		return Collections.max(prodsOfSubArr);
		
	}
	
	}

