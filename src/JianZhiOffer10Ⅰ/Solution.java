package JianZhiOffer10Ⅰ;

public class Solution {
    public int fib(int n) {
        int a=0,b=1,res;
        for (int i=0;i<n;i++){
            res = (a+b)%1000000007;
            a=b;
            b=res;
        }
        return a;
    }
}
