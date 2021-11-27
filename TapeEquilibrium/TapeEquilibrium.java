import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.util.*;
class TapeEquilibrium
{
	public static void main(String args[] )throws IOException
	{
		// Write your code here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String  lines = br.readLine();    
	       
	    	String[] strs = lines.trim().split("\\s+");
		int A[] = new int[strs.length];

		for(int i=0 ; i<A.length ; i++)
		{
			A[i]= Integer.parseInt(strs[i]);
		}
		
		  int ans=0;
        int sumright=0, sumleft=0;
	//Arrays.sort(A);
        //asumming p =1;
	if(A.length ==2)
	{
		ans = Math.abs(A[0]-A[1]);
	}
	else
	{

	        for(int i =1; i<A.length;i++)
        	{
            		sumright = sumright+A[i];
        	}
         	sumleft = A[0];
        	ans = Math.abs(sumright - sumleft);

	         for(int p=1; p<A.length-1;p++)
        	 {
			sumleft = sumleft+A[p];
                	sumright = sumright-A[p];
            		if( (Math.abs(sumright- sumleft)) < ans)
            		{
                		ans = Math.abs(sumright- sumleft);
			}
                		
        	 }
	}	
       	System.out.println(ans);	
	}			
    }
