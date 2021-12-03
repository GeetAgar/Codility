// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A, int[] B) {
        // write your code in Java SE 8
        int num = A.length;
        if(A.length==1)
        {
            num =1;
        }
        else
        {
            Stack<Integer> st = new Stack<Integer>();
            for(int i =0; i<A.length;i++)
            {
                if(B[i]==1)
                {
                    st.push(A[i]);
                }

                if(B[i]==0)
                {
                    while(!st.empty())
                    {
                        if(st.peek() > A[i])
                        {
                            num--;
                            break;
                        }
                        else if(st.peek()< A[i])
                        {
                            num--;
                            st.pop();
                        }
                    }
                }
            }

        }

        return num;

    }
}