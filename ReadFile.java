/*import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
*/

import java.io.*;
import java.util.*;

public class ReadFile 
{ 
  public static void main(String[] args) 
  { 
    try 
	{
      File myObj = new File("filename.txt");
	  FileWriter ff = new FileWriter("filename.txt");
	  ff.write("Hi KOMAL!!! Dhan Nirankar Ji");
	  ff.close();
      Scanner myReader = new Scanner(myObj); 
      while (myReader.hasNextLine()) 
	  {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } 
	catch (FileNotFoundException e) 
	{
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    catch (IOException e) 
	{
      System.out.println("An error occurred.");
      e.printStackTrace();
    } 
   }
}