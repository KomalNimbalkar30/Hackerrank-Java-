/*

Input Format

A single line of five space-separated integers.

Constraints


Output Format

Print two space-separated long integers denoting the respective minimum and maximum values that can be calculated by summing exactly four of the five integers. (The output can be greater than a 32 bit integer.)

Sample Input

1 2 3 4 5
Sample Output

10 14

*/

import java.io.*;
import java.util.*;

public class MinMax
{
	public static void main(String[] args)
	{
		long min=0, max=0, total=0;
		Scanner ss = new Scanner(System.in);
		
		//int n = ss.nextInt();
		long[] arr = new long[5];
		for(int i=0; i<5; i++)
		{
			arr[i] = ss.nextInt();
		}
		min = arr[0];
		for(int i=0; i<5; i++)
		{
			total = total + arr[i];
			
			if(arr[i]<=min)
			{
		
			   min = arr[i];
			}
			if(arr[i]>=max)
			{
				max = arr[i];
			}
		}
		System.out.printf((total-max) + " " + (total - min));
		
	}
}