
package com.lau.leetcode.algorithm_i;

/**
 *
 * @author lauraPerez
 * 
 * LeetCode problem: First Bad Version
 * 
 * 
 * Status: Accepted
 * 
 * 
 * Submission Detail:
 * 
 * 24 / 24 test cases passed.
 * 
 * Runtime: 16 ms
 * 
 * Memory Usage: 39.1 MB
 * 
 * 
 * Accepted Solutions Runtime Distribution:  
 * 
 * Your runtime beats 93.21 % 
 * of java submissions.
 * 
 * 
 * Accepted Solutions Memory Distribution
 * 
 * Your memory usage beats 58.37 % 
 * of java submissions.
 * 
 */


public class BadVersion {
    
    public int badOne = 1;
    
    // AC
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
  
    // HELPER
    public Boolean isBadVersion(int n) {
       
        if(n > 1) {
            if(badOne== n){
                return true;
            } else if(n > badOne){
                return true;
            } else {
                return false;
            }
        }
        return true;
    }
   
}