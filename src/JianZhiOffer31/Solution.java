package JianZhiOffer31;

import java.util.Stack;

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        if (pushed.length==0||popped.length==0) return true;
        Stack<Integer> stack = new Stack<>();
        int i=0;
        for (int n:
             pushed) {
            stack.push(n);
            while (stack.peek()==popped[i]){
                stack.pop();
                i++;
                if (i>= popped.length) break;
                if (stack.empty()==true) break;
            }
        }
        if (stack.empty()) return true;
        else return false;
    }
}
