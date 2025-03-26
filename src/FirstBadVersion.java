package com.lau.leetcode.algorithm_i;

/**
 *
 * @author lauraPerez
 * 
 * LeetCode problem:  First Bad Version
 * 
 * 
 * Status: Accepted
 * 
 * 
 * Submission Detail:
 * 
 *  24 / 24 test cases passed.
 * 
 * Runtime: 16 ms
 * 
 * Memory Usage: 39.4 MB
 * 
 * 
 * Accepted Solutions Runtime Distribution:   
 * 
 * Your runtime beats 99.91 % of java submissions.  
 * 
 * 
 * 
 * Accepted Solutions Memory Distribution
 * 
 * Your memory usage beats 99.97 % of java submissions. 
 * 
 * 
 */

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
// I made a helper included under BadVersion.java file in order to reverse engineer deeper and test it entirely from my side before submitting.

public class Solution extends VersionControl {

        public int firstBadVersion(int n) {
            int right = n;
            int left = 1;
        
            while(left < right) {
                int half = left + (right - left) / 2;
            
                if(isBadVersion(half)) {
                    right = half;
                } else {
                    left = half + 1;
                }
            }
            return left;
        }
}
