package JianZhiOffer53Ⅱ;

class Solution {
    public int missingNumber(int[] nums) {
        return function(nums);
    }
    int function(int[] nums){
        if (nums[0]!=0) return 0;
        if (nums[nums.length-1]==nums.length-1) return nums.length;
        int left=0,right=nums.length;
        int mid = left-(left-right)/2;
        while (left<=right){
            if (nums[mid]==mid) {
                left=mid+1;
                mid=left-(left-right)/2;
            }
            if (nums[mid]>mid&&nums[mid-1]==mid-1){
                return mid;
            }
            if (nums[mid]>mid&&nums[mid-1]>mid-1){
                right=mid-1;
                mid=left-(left-right)/2;
            }
        }
        return nums.length;
    }
}