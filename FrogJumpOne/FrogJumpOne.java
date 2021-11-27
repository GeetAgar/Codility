import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.util.*;
class FrogJumpOne
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
		int X = Integer.parseInt(br.readLine());
		 int ans =-1;
		if(X ==1)
		{
			ans =0;

		}
       else
	{
		int count =0;
            Set<Integer> set = new HashSet<Integer>();
            for(int i=0;i<A.length;i++)
            {
                if(!set.contains(A[i]))
                {
                    set.add(A[i]);
                    count++;
                }
                if(count == X)
                {
                    ans =i;
                    break;
                }
            }

	}
       	System.out.println(ans);	
	}			
    }
