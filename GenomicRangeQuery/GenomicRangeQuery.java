class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
 	int ans[] = new int[Q.length];
        //System.out.println(S.substring(5,6));
        for(int i =0; i<Q.length;i++)
        {
            String s;
            if(Q[i]==Q.length)
            {
                s = S.substring(P[i],Q.length);
            }
            else
            {
                s = S.substring(P[i],Q[i]+1);
            }
            //System.out.println(s);
            if(s.indexOf("A"))
            {
                ans[i] =1;
            }
            else if(s.contains("C"))
            {
                ans[i] =2;
            }
            else if(s.contains("G"))
            {
                ans[i] =3;
            }
            else if(s.contains("T"))
            {
                ans[i] =4;
            }
        }

        return ans;
	}
}