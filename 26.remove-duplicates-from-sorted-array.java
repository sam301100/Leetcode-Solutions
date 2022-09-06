/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution {
    public int removeDuplicates(int[] nums) {
        
        int next_new_element = nums[0];
        int count = 1;
        
        for(int i=0; i<nums.length; i++){
            
            if(nums[i] != next_new_element){
                next_new_element = nums[i];
                nums[count] = next_new_element;
                count++;
            }
            
        }
        
        return count;
    }
}
// @lc code=end

