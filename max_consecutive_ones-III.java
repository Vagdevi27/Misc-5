// Time complexity : O(n) [ Two passes/ traversal ]
// Space Complexity : O(1) 

class Solution {
    public int longestOnes(int[] nums, int k) {
        
        int left = 0;
        int right = 0;
        
        while (right < nums.length){
            
            // found a zero, so count in k
            if (nums[right] == 0 ){
                k--; // remaining
            }    
            
            // no more zeros can be accumulated in the window
            if (k < 0){
                // if starting window is 0 , increase the count
                if (nums[left] == 0){
                    k++;
                }
                
                left++; // increase the left pointer
            }
           
            right++; //  decrease the right pointer
        }
        
        
        return right - left;
    }
}