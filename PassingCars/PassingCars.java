import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.util.*;
class PassingCars
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
		     int count =0;
			int m =0;
       		 for(int i =0;i<A.length;i++)
        	{
           		 if(A[i]==0)
          		  {
               			m = m+1;			 
            		}
       		 
			if(m >0)
			{
				if(A[i] ==1)
				{
					count = count+m;
       		 			
				}
			}
		
		}
		if(count>1000000000)
       		{
           		count =-1;
       		}
		System.out.print(count);
			
	}			
}
