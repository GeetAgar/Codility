import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.util.*;
class test
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
		
		Arrays.sort(A);
      		int val=0;
		if(A.length >1)
		{
			
			for(int j =0; j<A.length-1; j++)
			{
				if(A[0]==0 || A[0] == 1)
				{
					if((A[j+1]-A[j])>1)
					{
						val = A[j]+1;
						break;
					}
					else if(val ==0 && j == A.length-2)
					{
						val = A[j+1]+1;
					}
				
				}
				else if(j == A.length-2 && val ==0)
				{
					val =1;
				}
				
			}
		}
		else if(A.length ==1)
		{
			if(A[0] ==1)
			{ 
				val = 2;
			}
			else
			{
				val = 1;
			}
		}
		else if(A.length ==0)
		{
			val =1;
		}	
		
       		System.out.println(val);	
		}			
        }
