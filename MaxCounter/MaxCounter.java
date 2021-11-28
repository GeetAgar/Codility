import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.util.*;
class MaxCounter
{
	public static void main(String args[] )throws IOException
	{
		// Write your code here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String  lines = br.readLine();    
	       
	    	String[] strs = lines.trim().split("\\s+");
		int A[] = new int[strs.length];
		
		for(int i =0; i<A.length;i++)
		{
			A[i]= Integer.parseInt(strs[i]);
		}
		int N = Integer.parseInt(br.readLine());
	
		int n[] = new int[N];
	        Arrays.fill(n, 0);
		int maxcounter =0;
		int mincounter =0;
        	for(int i =0; i<A.length;i++)
        	{
            		int temp = A[i];
            		if(temp == N+1)
            		{
                		mincounter = maxcounter;
            		}
			else
			{
				if(n[temp-1]<mincounter)
				{
					n[temp-1]=mincounter;
				}
				n[temp-1] = n[temp-1]+1;
				if(maxcounter < n[temp-1])
				{
					maxcounter = n[temp-1];
				}
        	}
       		for(int i=0;i<n.length;i++)
		{
			 if (n[i] < mincounter) 
			{
        			n[i] = mincounter;
        		}
		}
		for(int i=0;i<n.length;i++)
		{
			System.out.print(n[i]+" ");
		}	
	}			
}
