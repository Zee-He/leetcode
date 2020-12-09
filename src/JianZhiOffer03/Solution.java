package JianZhiOffer03;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//class Solution {//遍历数组O(n),O(n)
//    public int findRepeatNumber(int[] nums) {
//        Set<Integer> set = new HashSet<>();
//        int res = -1;
//        for (int n:
//             nums) {
//            if (!set.add(n)) {
//                res=n;
//                break;
//            }
//        }
//        return res;
//    }
//}

class Solution {//O(n),O(1)
    public int findRepeatNumber(int[] nums) {
        int res = -1;
        for (int i=0;i<nums.length;i++) {
            while(nums[i]!=i){
                if (nums[i]==nums[nums[i]]){
                    return nums[i];
                }
                res=nums[i];
                nums[i]=nums[res];
                nums[res]=res;
            }
        }
        return -1;
    }
}