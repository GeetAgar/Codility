import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.util.*;
class MissingInteger
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
		int min =1;
		Arrays.sort(A);
		int b[] = new int[A.length];
		int id=0;
		for(int i =0; i<A.length;i++)
		{
			if(A[i]>0)
			{
				b[id]= A[i];
				id++;
			}
		}	
		if(id ==1 || id == 0)
		{
			if(b[0]==1)
			{
				min = 2;
			}
			else
			{
				min=1;
			}
		}
		else
		{
			int flag =0;	
			for(int i =0;i<id-1;i++)
			{
				if(b[0]==1)
				{
					if((b[i+1]-b[i])>1)
					{
						min = b[i]+1;
						flag =1;
						break;
					}
					else if(i == id-2 && flag ==0)
					{
						min= b[id-1]+1;
					}
				}
			}
		}
		
		System.out.print(min);
			
	}			
}
