// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int res=0;

        Set<Integer> set = new HashSet<Integer>();
        for(int i =0;i<A.length;i++)
        {
            set.add(A[i]);
        }
        res = set.size();
        return res;
    }
}