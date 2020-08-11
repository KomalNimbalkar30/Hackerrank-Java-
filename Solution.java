import java.io.*;
import java.math.*;
import java.util.*;


public class Solution 
{
    public static void main(String[] args) 
    {
        int[] a = new int[3];
        int[] b = new int[3];
        int i;
        int aa=0;
        int bb=0;
        
        Scanner ss= new Scanner(System.in);

        for(i=0;i<=2;i++)
        {
          a[i]=ss.nextInt();
        }

         for(i=0;i<=2;i++)
        {
          b[i]=ss.nextInt();
        }

        for(i=0;i<=2;i++)
        {
            if(a[i]>b[i])
            {
                aa=aa+1;
            }
            else if(a[i]<b[i])
            {
                bb=bb+1;
            }
            else 
            {
                aa=aa+0;
                bb=bb+0;
            }
        }
    System.out.printf("%d %d", aa , bb );
    }
}