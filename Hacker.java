import java.util.*;
import java.io.*;
import java.util.*;

public class Hacker
{
	private static String hackerFun(String s)
	{
		String str = "hackerrank";
		int j = 0;
		
		if(s.length()<str.length())
		{
			return ("NO");
		}
		for(int i=0; i<s.length(); i++)
		{
			if(j<str.length() && s.charAt(i) == str.charAt(j))
			{
				j++;
			}
		}
		
		if(j == str.length())
		{
			return ("YES");
		}

	}

	
	public static void main(String[] args)
	{
		Scanner ss = new Scanner(System.in);
	
	    int n=ss.nextInt();
	    String[] s= new String[n];
		String res;
		for (int i =0; i<n; i++)
		{
			s[i]=ss.nextLine();
			res = hackerFun(s[i]);
			System.out.print(res);
		}
		//return (0); 
		
	}
	
	

} 