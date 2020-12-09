package JianZhiOffer20;

class Solution {
    public boolean isNumber(String s) {
        String pattern = "^[+|-]?((\\d+\\.?)|(\\d*\\.\\d+))([E|e][+|-]?\\d+)?$";
        return s.trim().matches(pattern);
    }
}