import java.io.*;
import java.util.*;

public class Bigarray{
        public static void main(String[] args) 
    {
        int i;
        long sum=0;
        Scanner ss = new Scanner(System.in);
        int n = ss.nextInt();
        int[] arr= new int[n];

        for(i=0; i<n; i++ )
        {
            arr[i] =ss.nextInt();
        }

        for(i=0; i<n; i++)
        {
            sum = arr[i] + sum ;
        }
        System.out.println(sum);
    }
}
