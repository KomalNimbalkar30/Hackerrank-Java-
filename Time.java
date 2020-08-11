import java.time.*;
import java.io.*;
import java.util.*;
import java.time.format.DateTimeFormatter;

public class Time
{
	public static void main(String[] args)
	{
		LocalDateTime dd = LocalDateTime.now();
		System.out.println(dd);
		
		DateTimeFormatter ff = DateTimeFormatter.ofPattern("dd:MM:yy HH:mm:ss");
		
		String fd = ff.format(dd);
		System.out.println(fd);
	}
}
	

