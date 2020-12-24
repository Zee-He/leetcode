package JianZhiOffer50;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

class Solution {
    public char firstUniqChar(String s) {
        HashMap<Character,Boolean> map = new HashMap<>();
        char[] ch = s.toCharArray();
        for (char c: ch){
            map.put(c,!map.containsKey(c));
        }
        for (char c: ch){
            if (map.get(c)) return c;
        }
        return ' ';
    }
}
