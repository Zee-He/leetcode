package JianZhiOffer53Ⅰ;

class Solution {
    public int search(int[] nums, int target) {
        return function(nums, target)-function(nums, target-1);
    }
    int function(int[] nums, int target){
        int i=0,j=nums.length-1;
        while (i<=j){
            int m = (i+j)/2;
            if (nums[m]<=target) i=m+1;
            else j=m-1;
        }
        return i;
    }
}
