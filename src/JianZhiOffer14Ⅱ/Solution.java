package JianZhiOffer14Ⅱ;

class Solution {
    public int cuttingRope(int n) {
        if (n==2) return 1;
        if (n==3) return 2;
        long res = 1;
        while (n>4){
            n=n-3;
            res*=3;
            res=res%1000000007;
        }
        switch (n){
            case 4:
                res*=2;
                res=res%1000000007;
                res*=2;
                break;
            case 3:
                res*=3;
                break;
            case 2:
                res*=2;
                break;
            default:
                break;
        }
        res=res%1000000007;
        return (int)res;
    }
}