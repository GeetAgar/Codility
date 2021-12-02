class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int P =0;
        int Q=0;
        //int min=0;
        double sum=0;
        if(A.length==2)
        {
            P=0;
            Q=1;
           // min =0;
        }
        else
        {
            double avg =0.0;
            //System.out.println(A.length);
            for(int i =0;i<A.length;i++)
            {
                sum = sum+A[i];
            }
            //System.out.println(sum);
            avg = sum/A.length;
            //System.out.println(avg);
            double newavg =0;
            
            for(int i =0; i<A.length-1;i++)
            {   
                sum = A[i];
              
                for(int j =i+1;j<A.length;j++)
                {
                    sum = sum + A[j];
                    
                    int te = j-i;
                    te = te+1;
                   
                    newavg = sum/te;
                    
                    if(newavg < avg)
                    {
                        avg = newavg;
                        P = i;
                        Q = j;
                    }
                }
            }

        }

        return P;
    }
}