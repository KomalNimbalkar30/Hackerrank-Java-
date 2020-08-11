/*
Input Format

The first line contains a single integer, , denoting the number of candles on the cake. 
The second line contains  space-separated integers, where each integer  describes the height of candle .

Constraints

Output Format

Print the number of candles that can be blown out on a new line.

Sample Input 0

4
3 2 1 3
Sample Output 0

2

*/



import java.io.*;
import java.util.*;

public class BirthdayCakeCandles
{
	public static void main(String[] args)
	{
		Scanner ss = new Scanner(System.in);
		int m=0,n=0;
		int max=0;
		int i;
		
		int nn = ss.nextInt();
		int[] arr = new int[nn];
		
		for(i=0; i<nn; i++)
		{
			arr[i] = ss.nextInt();
		}
		int min = arr[0];
		for(i=0; i<nn; i++)
		{
			if (arr[i]<min)
			{
				min = arr[i];
			}
			if(arr[i]>max)
			{
				max = arr[i];
			}
		}
		
		for(i=0; i<nn; i++)
		{
			if(arr[i]==min)
			{
				m=m+1;
			}
			if(arr[i]==max)
			{
				n=n+1;
			}
		}
		System.out.println(n);
		//System.out.println(m);
		
		
		
		
	}
}