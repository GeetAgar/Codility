class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int count =0;
        int arr[][] = new int[A.length][2];

        for(int i =0;i<A.length;i++)
        {
            arr[i][0]= i-A[i];
            arr[i][1]= i+A[i];
        }

        for(int j=0;j<A.length;j++)
        {
            for(int k =j+1; k<A.length;k++)
            {
                int p11 = arr[j][0];
                int p12 = arr[j][1];
                int p21 = arr[k][0];
                int p22 = arr[k][1];

                if(	(p21 <= p11 && p11 <= p22) ||
                    (p21 <= p12 && p12 <= p22) ||
                    (p11 <= p21 && p21 <= p12) ||
                    (p11 <= p22 && p22 <= p12))
                    {
                        count++;
                    }
            }
        }
		if(count>1000000000)
		{
			count =-1;
		}
		
        return count;
    }
}