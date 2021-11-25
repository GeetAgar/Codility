import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
class test
{
	public static void main(String args[] )throws IOException
	{
		// Write your code here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String  lines = br.readLine();    
	       
	    	String[] strs = lines.trim().split("\\s+");
		int len = strs.length;
		int arr[] = new int[len];
		for(int i =0; i<len;i++)
		{
			arr[i] = Integer.parseInt(strs[i]);
		}
		
		if(len%2==0)
		{
			System.out.println("Error encountered there is either more than one unpaired values or no unpaired value");
		}
		//int k = Integer.parseInt(br.readLine());
		//int l = len/2 +1;
		
		int f[] = new int[len];
		int kl = 0;
		for(int i=0; i<len; i++)
		{
			int c =0;
			for(int j =0;j<len;j++)
			{
				if(arr[i] == arr[j])
				{
					c++;
				}
			}
			f[kl] = c;
			kl++;
		}
		
		//System.out.println();
		int val =0;
		for(int i =0; i<len;i++)
		{
			if(f[i]/2==0)
			{
				val = arr[i];
			}
		}
		System.out.println(val);
		}			
        }
