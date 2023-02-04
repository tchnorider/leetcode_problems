package com.lau.leetcode.algorithm_i;

/**
 *
 * @author lauraPerez
 * 
 * LeetCode problem:  Binary Search
 * 
 * 
 * Status: Accepted
 * 
 * 
 * Submission Detail:
 * 
 *  47 / 47 test cases passed.
 * 
 * Runtime: 1 ms
 * 
 * Memory Usage: 43.1 MB
 * 
 * 
 * Accepted Solutions Runtime Distribution:   
 * 
 * Your runtime beats 15.07 %  
 * of java submissions.
 * 
 * 
 * Accepted Solutions Memory Distribution
 * 
 * Your memory usage beats 49.37 % 
 * of java submissions.
 * 
 */

public class BinarySearch {
    
     public int search(int[] nums, int target) {
    
        int numsSize = nums.length;

        for(int i=0; i <= numsSize-1; i++) {
            if(nums[i] == target) {
                return i;
            }
        } 
        return -1;
    }
    
}
