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
 * Runtime: 2 ms
 * 
 * Memory Usage: 39.4 MB
 * 
 * 
 * Accepted Solutions Runtime Distribution:   
 * 
 * Your runtime beats 56.10% of c++ submissions
 * 
 * 
 * 
 * Accepted Solutions Memory Distribution
 * 
 * Your memory usage beats 69.47%
 
 * 
 * 
 */

class Solution {
public:
    int firstBadVersion(int n) {
        
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
    
};
