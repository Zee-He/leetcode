package JianZhiOffer10Ⅱ;

class Solution {
    public int numWays(int n) {
        if (n==0) return 1;
        int a=1,b=1,res;
        for (int i=0;i<n;i++){
            res = (a+b)%1000000007;
            a=b;
            b=res;
        }
        return a;
    }
}