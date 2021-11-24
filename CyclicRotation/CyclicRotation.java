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
		
		System.out.println("Enter value of k");
		int k = Integer.parseInt(br.readLine());
		
		for(int i =0; i<k;i++)
		{
			int temp = arr[len-1];
			for(int j =arr.length-1; j>0; j--)
			{
				if(j-1 !=0)
				{
				arr[j] = arr[j-1];
				}
				else
				{
					arr[j] = arr[j-1];
					arr[j-1] = temp;
					break;
				}
			}
		}
			
		for(int i =0; i<len;i++)
		{
			System.out.print(arr[i]+" ");
		}			
        }
	
    }
