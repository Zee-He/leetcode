package JianZhiOffer17;

class Solution {
    public int[] printNumbers(int n) {
        int max = (int)Math.pow(10,n);
        int[] a = new int[max-1];
        for (int i=1;i<max;i++){
            a[i-1]=i;
        }
        return a;
    }
}
