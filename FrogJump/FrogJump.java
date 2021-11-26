import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.util.*;
class FrogJunp
{
	public static void main(String args[] )throws IOException
	{
		// Write your code here
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int X= Integer.parseInt(br.readLine());
		int Y=	Integer.parseInt(br.readLine());
		int D=	Integer.parseInt(br.readLine());

		int count=0;
        	int YT=X;
       		 if(X<Y)
        	{
        		/*while(Y>YT)
       			 {
            		YT = YT+D;
            		count++;
        		}*/
		YT= Y-X;
		count = (int)Math.ceil((double)YT/D);
        
        	}
       		System.out.println(count);	
		}			
        }
