//import necessary classes
import java.io.*;
import java.util.*;

/**
* This program determines the area of a triangle.
*
* @author  Ben Falsetto
* @version 2.0
* @since   2020-11-3
*/
public class Main {
  
  /**
   * Main procedure.
  */
  public static void main(String[] args) {
    try {
      //declare objects
      File myObj = new File("input.txt");
      Triangle triangle = new Triangle();
      Scanner scanner = new Scanner(myObj);
      
      //declare variables
      String output = "";
      
      //while the file has another line
      while (scanner.hasNextLine()) {
        //get the next line
        String line = scanner.nextLine();
        
        //split the line and assign it to an array
        String[] lineArr = line.split("\\s+");
        
        //get the lengths amd change them to doubles
        double side1 = Double.parseDouble(lineArr[0]);
        double side2 = Double.parseDouble(lineArr[1]);
        double side3 = Double.parseDouble(lineArr[2]);
        
        //pass the side lengths to the triangle class
        triangle.setsides(side1, side2, side3);
        
        //get the name
        String name = triangle.getname();
        
        //get the semiperimeter
        double semiPer = triangle.getsemiper();
        
        //get the area
        double area = triangle.getarea(semiPer);
        
        //add this to the output string
        output += "Name: " + name + " Semiperimeter: " + semiPer + " Area: " + area + "\r\n";
      }
      
      //writing to a text file
      //creating the file, filewriter, and bufferedwriter objects
      File outputFile = new File("output.txt");
      FileWriter fileWriter = new FileWriter(outputFile);
      BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
      
      //write output to output.txt
      bufferedWriter.write(output);
      
      //close the buffered writer
      bufferedWriter.close();
      
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}