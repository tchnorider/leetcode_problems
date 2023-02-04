package com.lau.leetcode.algorithm_i;

/**
 *
 * @author lauraPerez
 * 
 * LeetCode problem: Squares of a Sorted Array
 * 
 * 
 * Status: Accepted
 * 
 * 
 * Submission Detail:
 * 
 * 137 / 137 test cases passed.
 * 
 * Status: Accepted
 * 
 * Runtime: 528 ms
 * 
 * Memory Usage: 43.6 MB
 * 
 * 
 * Accepted Solutions Runtime Distribution:  
 * 
 * Your runtime beats 5.02 % 
 * of java submissions.
 * 
 * 
 * Accepted Solutions Memory Distribution
 * 
 * Your memory usage beats 93.57 % 
 * of java submissions.
 * 
 */

public class SquaresOfSortedArray {
    
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int i = nums.length -1;
        
         while(i >= 0) {
             
            int val = nums[i] * nums[i];
            result[i] = val;
           
            i--;
        }
        return sortBubble(result);
    }
    
      public int[] sortBubble(int[] numberArray) {
        boolean done = false;
        while (!done) {
	
            done = true;
	    int itemsToBeSorted = numberArray.length - 1;
            for (int i = 0; i < itemsToBeSorted; i++) {
                if (numberArray[i] > numberArray[i + 1]) {
                    int smaller = numberArray[i + 1];
                    numberArray[i + 1] = numberArray[i];
                    numberArray[i] = smaller;
                    done = false;
		}
            }
            itemsToBeSorted--;
        }
        return numberArray;
    }
    
}
