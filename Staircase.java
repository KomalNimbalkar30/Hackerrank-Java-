/*
Input Format

A single integer, , denoting the size of the staircase.

Constraints

 .

Output Format

Print a staircase of size  using # symbols and spaces.

Note: The last line must have  spaces in it.

Sample Input

6 
Sample Output

     #
    ##
   ###
  ####
 #####
######


*/


import java.util.*;
import java.io.*;

public class Staircase
{
	public static void main(String[] args)
	{
		Scanner ss = new Scanner(System.in);
		int n = ss.nextInt();
		
		for(int j=0; j<n; j++)
		{
			for(int i=1; i<=n; i++)
			{
				System.out.print(i<n-j? " ":"#");
			}
			System.out.println("");
		}
	}
}
