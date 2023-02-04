package com.lau.leetcode.algorithm_i;

/**
 *
 * @author lauraPerez
 * 
 * LeetCode problem:  Search Insert Position
 * 
 * 
 * Status: Accepted
 * 
 * 
 * Submission Detail:
 * 
 *  64 / 64 test cases passed.
 * 
 *  Runtime: 0 ms
 * 
 *  Memory Usage: 41.9 MB
 * 
 * 
 * Accepted Solutions Runtime Distribution:   
 * 
 * Your runtime beats 100.00 % 
 * of java submissions.
 * 
 * 
 * Accepted Solutions Memory Distribution
 * 
 * Your memory usage beats 60.52 % 
 * of java submissions
 * 
 */

public class SearchInsertPosition {
    
    public int searchInsert(int[] nums, int target) {
        int numsSize = nums.length;
        int result = 0;
        int start = 0;
    
        int half = numsSize / 2;
        
        if(target > nums[half]) {
            start = half;
        }
        for(int i= start; i < numsSize; i++) {
          
                if(nums[i] == target) {
                    return i;
                } else {
                    if(nums[i] > target) {
                        return i;
                    } else {
                        result = i+1;
                    }
                }
           
        }
        return result;
    }
       
}

