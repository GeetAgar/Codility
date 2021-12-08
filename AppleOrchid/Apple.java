import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.util.*;
class Apple
{
	public static void main(String args[] )throws IOException
	{
		int A[] = {10,200,30,400,50};
		int K = 0;
		int L = 1;
		int sol = solution(A,K,L);
		System.out.println(sol);
	}
	
	public static int solution(int[] A, int K, int L)
	{
        // write your code in Java SE 8
        int  max =0;
        int tot =0;

        //in case where two disjoint intervals are not possible
        if(K+L >A.length)
        {
            max = -1;
        }
        //in case when all the apples are picked
        else if(K+L == A.length)
        {
            for(int i =0; i<A.length; i++)
            {
                tot = tot+A[i];
            }
            max = tot;
        }
        else  
        {
			int big=0, small=0;
			if(K>L)
			{
				big = K;
				small =L;
			}
			else if(K<L)
			{
				big = L;
				small =K;
			}
			else if(K==L)
			{
				big = L;
				small = K;
			}
			int sum1=0, sumnew=0;
			int sk=0,ek=0;
			for(int i =0; i<A.length;i++)
			{
				//sk =i;
				sumnew =0;
				int temp =i+big;
				if(temp<=A.length)
				{
					for(int j =i; j< i+big ; j++)
					{
						sumnew += A[j];
					}
					if(sumnew>sum1)
					{
					sum1 = sumnew;
					sk =i;
					ek = i+big-1 ;
					}
				}
			}
			int sum2=0, sum2new=0;
			int flag =0;
			
			for(int i =0; i<sk; i++)
			{
				int temp = i+small-1;
				//System.out.println("Value of temp"+ temp);
				if(temp < sk)
				{
					sum2new =0;
					for(int j =i; j< i+small; j++)
					{
						sum2new += A[j];
						
					}
					//System.out.println(sum2new);
					if(sum2< sum2new)
					{
						sum2 = sum2new;
					}
				}
			}
			for(int i = ek+1; i<A.length;i++)
			{
				 
					System.out.println("i = "+i);
					int t = i+small-1;
				//System.out.println(A.length);
					if(t <A.length)
					{   
					//System.out.println("i "+i);
						sum2new=0;
						for(int j =i; j< i+small; j++)
						{
							sum2new +=A[j];
						//System.out.println("inside for"+j);
						}
						if(sum2< sum2new)
						{
							sum2 = sum2new;
						}
					
					}
			}
				
			
			System.out.println(sum1+ " "+ sum2+ " "+ sk+" "+ ek);
			max = sum1+sum2;
        }
		
        return max;
    }
}