//import necessary classes
import java.io.*;
import java.util.Random;

/**
* This program generates random datasets for Main.java.
*
* @author  Ben Falsetto
* @version 2.0
* @since   2020-11-3
*/
public class Geninput {
  public static void main(String[] args) {
    try {
      //writing to file
      String fileName = "input.txt";
      File myObj = new File(fileName);
      FileWriter fileWriter = new FileWriter(myObj);
      
      //wrap in buffered writer
      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
      
      //creating the random number generator
      Random rand = new Random();
      
      //creating the output variable
      String output = "";
      
      //choosing how much data to generate
      int numRep = rand.nextInt(1000);
      System.out.println("Number of datasets to generate: " + numRep);
      
      for (int c = 0; c <numRep; c++) {
        //generate 250 random numbers and add them to an output string
        for (int i = 0; i < 3; i++) {
          output += String.valueOf(rand.nextInt(100)) + " ";
        }
        
        output += "\r\n";
      }
      
      //writing to the file
      bufferedWriter.write(output);
      
      //close the buffered writer
      bufferedWriter.close();
    } catch(Exception e) {
    }
  }
}