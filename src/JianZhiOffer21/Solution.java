package JianZhiOffer21;

class Solution {
    public int[] exchange(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            while (nums[left] % 2 == 1) {
                left++;
                if (left >= right) break;
            }
            while (nums[right] % 2 == 0) {
                right--;
                if (left >= right) break;
            }
            if (left >= right) break;
            int temp;
            temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }
        return nums;
    }
}