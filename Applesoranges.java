/*
Input Format

The first line contains two space-separated integers denoting the respective values of  and . 
The second line contains two space-separated integers denoting the respective values of  and . 
The third line contains two space-separated integers denoting the respective values of  and . 
The fourth line contains  space-separated integers denoting the respective distances that each apple falls from point . 
The fifth line contains  space-separated integers denoting the respective distances that each orange falls from point .

Constraints

Output Format

Print two integers on two different lines:

The first integer: the number of apples that fall on Sam's house.
The second integer: the number of oranges that fall on Sam's house.
Sample Input 0

7 11
5 15
3 2
-2 2 1
5 -6
Sample Output 0

1
1
Explanation 0

The first apple falls at position . 
The second apple falls at position . 
The third apple falls at position . 
The first orange falls at position . 
The second orange falls at position . 
Only one fruit (the second apple) falls within the region between  and , so we print  as our first line of output. 
Only the second orange falls within the region between  and , so we print  as our second line of output.








*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Applesoranges 
{
    public static void main(String[] args) 
    {
        Scanner ss = new Scanner(System.in);
        
        int s = ss.nextInt();
        int t = ss.nextInt();
        int a = ss.nextInt();
        int b = ss.nextInt();
        int m = ss.nextInt();
        int n = ss.nextInt();
        int apples=0, oranges=0;

        for(int i=0; i<m ; i++)
        {
            int ls = ss.nextInt() + a;
            if(ls>=s && ls<=t)
            {
                apples++;
            }
        }

        for(int j=0; j<n; j++)
        {
            int ls = ss.nextInt() + b;
            if(ls>=s && ls<=t)
            {
                oranges++;
            }


        }
        System.out.println(apples);
        System.out.println(oranges);
    }
}