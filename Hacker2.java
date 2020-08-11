import java.util.Scanner;

public class Hacker2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            String str = scan.next();
            System.out.println(subsequenceExists(str) ? "YES" : "NO");
        }
        scan.close();
    }
    
    private static boolean subsequenceExists(String str) {
        String hackerrank = "hackerrank";
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == hackerrank.charAt(index)) {
                index++;
            }
            if (index == hackerrank.length()) {
                return true;
            }
        }
        return false;
    }
}

/*

import java.util.*;
import java.io.*;

public class Hacker
{			
	public static void main(String[] args)
	{
		Scanner ss = new Scanner(System.in);
	
	    int n=ss.nextInt();
		while(n>0)
		{
			String str = ss.next();
			System.out.println(hackerFun(str) ? "YES" : "NO");
			n--;
		}			
		
		
	}
	
	
	private static boolean hackerFun(String s)
		{
			String str = "hackerrank";
			int j=0;
			for(int i=0; i<s.length(); i++)
			{
				if(j<str.length() && s.charAt(i) == str.charAt(j))
				{
					j++;
				}
				if(j == str.length())
				{
				
				return(true);
				}
				
			}
			
			return(false);
		}		
} 
*/
