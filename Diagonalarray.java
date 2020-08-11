/*
Input Format

The first line contains a single integer, , the number of rows and columns in the matrix . 
Each of the next  lines describes a row, , and consists of  space-separated integers .

Constraints

Output Format

Print the absolute difference between the sums of the matrix's two diagonals as a single integer.


*/

import java.util.*;
import java.io.*;

public class Diagonalarray
{
public static void main(String[] args)
{
Scanner sp = new Scanner(System.in);
int n= sp.nextInt();
int i,j;
int num1=0, num2=0;
int[][] arr = new int[n][n];

for(i=0; i<n; i++)
{
for(j=0; j<n; j++)
{
arr[i][j]= sp.nextInt();
}
}


/*for(int i=0; i<n; i++)
{
for(int j=0; j<n; j++)
{
System.out.print(arr[i][j] + " ");

}
System.out.println();
}*/

for (i=0; i<n ; i++)
{
	for(j=0; j<n; j++)
	{
		if (i==j)
		{
           num1 = num1 + arr[i][j];
		}
		if(i== n-j-1)
		{
			num2 = num2 +arr[i][j];
	    }	
	}
}

int res= num1-num2;
System.out.println(Math.abs(res));
//System.out.println(num);
}
}