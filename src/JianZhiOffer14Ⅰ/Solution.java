package JianZhiOffer14Ⅰ;

class Solution {
    public int cuttingRope(int n) {
        if (n==2) return 1;
        if (n==3) return 2;
        int res = 1;
        while (n>4){
            n=n-3;
            res*=3;
        }
        switch (n){
            case 4:
                res*=4;
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
        return res;
    }
}
