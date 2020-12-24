package JianZhiOffer45;

class Solution {
    public String minNumber(int[] nums) {
        String[] str = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            str[i] = String.valueOf(nums[i]);
        }
        StringBuilder res = new StringBuilder();
        sort(str, 0, nums.length - 1);
        for (String s :
                str) {
            res.append(s);
        }
        return res.toString();
    }

    void sort(String[] str, int left, int right) {
        if (left >= right) return;
        String x = str[left];
        int i = left, j = right;
        while (i < j) {
            while ((str[j] + str[left]).compareTo(str[left] + str[j])>=0&&i<j) {
                j--;
            }
            while ((str[i] + str[left]).compareTo(str[left] + str[i])<=0&&i<j) {
                i++;
            }
            x = str[i];
            str[i] = str[j];
            str[j] = x;
        }
        str[i] = str[left];
        str[left] = x;
        sort(str, left, i - 1);
        sort(str, i + 1, right);
    }
}