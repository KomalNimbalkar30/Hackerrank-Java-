/*
Output Format

Print YES if they can land on the same location at the same time; otherwise, print NO.

Note: The two kangaroos must land at the same location after making the same number of jumps.

Sample Input 0

0 3 4 2
Sample Output 0

YES


*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution 
{
    public static void main(String[] args) 
    {
         Scanner ss = new Scanner(System.in);
         int x1 = ss.nextInt();
         int v1 = ss.nextInt();
         int x2 = ss.nextInt();
         int v2 = ss.nextInt();

         
         while(x1<=x2)
         {
             if(x1 == x2)
             {
                 System.out.print("YES");
                 System.exit(0);
             }

            x1 = x1+v1;
            x2 = x2+v2;
         }
         
         System.out.print("NO");
             
    }
}



         


         
        


         


         
        