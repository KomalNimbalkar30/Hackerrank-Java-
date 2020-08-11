import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;

public class GradingStud
{
    public static void main(String[] args)
	{
       Scanner ss = new Scanner(System.in);
       int n = ss.nextInt();
       int[] grades = new int[n];

       for (int i=0; i<n; i++)
       {
           grades[i] = ss.nextInt();
       }
        
       for (int i=0; i<n; i++)
       {
           math.round(grades[i]);
           System.out.println(grades[i]);
       }
       
	}
}