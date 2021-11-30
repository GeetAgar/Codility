import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.util.*;
class CountDiv
{
	public static void main(String args[] )throws IOException
	{
		// Write your code here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/*String  lines = br.readLine();    
	       
	    	String[] strs = lines.trim().split("\\s+");
		int A[] = new int[strs.length];
		
		for(int i =0; i<A.length;i++)
		{
			A[i]= Integer.parseInt(strs[i]);
		}*/
		

		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());
		
		int divisors = 0;
   
   		 //nothing to do when K > B
   		 if(K > B) 
  		  {
     			 if(A == 0 || B == 0) 
      			{
       				 divisors = 1; //K mod 0 == 0 so count a single divisor
					//return 1;
      			}
			else
			{
     		 		divisors =0; //no divisors when A, B both != 0
				//return 0;
			}
    		}
		else
		{
   		 	if(A == 0) 
    			{
      				divisors++;  //K mod 0 == 0
   			 }
   
   			 int updatedA = A;
    			if(K > A) 
    			{
     				 updatedA = K; //skip checking all values < K
    			}
   
   			 int firstNonZeroDivisor = 0;
  			  int lastNonZeroDivisor = 0;
   
   			 for(int i=updatedA; i<=B; i++) 
    			{ 
        			if(i % K == 0) 
        			{ 
            				firstNonZeroDivisor = i; 
      					      break;
        			} 
    			} 
    			for(int i=B; i>=updatedA; i--) 
    			{
      				if(i % K == 0) 
      				{
         				lastNonZeroDivisor = i;
         				break;
      				}
    			}
    			if(firstNonZeroDivisor == 0 && lastNonZeroDivisor == 0) 
    			{
     				 divisors = 0;
    			}
    			else 
    			{
     				 divisors += ((lastNonZeroDivisor - firstNonZeroDivisor) / K) + 1;
    			}
		}
		System.out.print(divisors);
			
	}			
}
