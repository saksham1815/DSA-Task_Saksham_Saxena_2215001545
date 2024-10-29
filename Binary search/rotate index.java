package Binary search;
// 153 . Find Minimum in Rotated Sorted Array

class Solution {
    public int findMin(int[] nums) {
        int l = 0 ; 
        int r = nums.length - 1;
        while(r>l){
            int mid = l +(r-l)/2;
            if(nums[r]>nums[mid]){
                r = mid;
            }else{
                l = mid+1;
            }
        }
        return nums[l];
    }
}
