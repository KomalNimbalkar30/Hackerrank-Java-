/*
Input Format

The first line contains an integer, , denoting the size of the array. 
The second line contains  space-separated integers describing an array of numbers .

Constraints

 

Output Format

You must print the following  lines:

A decimal representing of the fraction of positive numbers in the array compared to its size.
A decimal representing of the fraction of negative numbers in the array compared to its size.
A decimal representing of the fraction of zeros in the array compared to its size.
Sample Input

6
-4 3 -9 0 4 1         
Sample Output

0.500000
0.333333
0.166667

*/



import java.io.*;
import java.math.*;
import java.util.*;


public class Fractionarray 
{
    public static void main(String[] args) 
    {
		Scanner ss = new Scanner(System.in);
		int i=0;
		float ne=0, pe=0,e=0;
        int n = ss.nextInt();
        int[] arr = new int[n];

        for (i=0; i < n; i++) 
		{
            arr[i] = ss.nextInt();
        }

        for(i=0; i<n; i++)
		{
			if(arr[i]<0)
			{
				ne = ne + 1;
			}
			if(arr[i] == 0)
			{
				e = e + 1;
			}
			if(arr[i]>0)
			{
				pe = pe + 1;
			}
		}
		
		System.out.println(pe/n);
		System.out.println(ne/n);
		System.out.println(e/n);
		
    }
}
