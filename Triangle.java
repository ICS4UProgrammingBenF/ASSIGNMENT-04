//import necessary libraries
import java.util.*;
import java.lang.Math;

/**
* This program is the class where everything happens.
*
* @author  Ben Falsetto
* @version 2.0
* @since   2020-11-3
*/
public class Triangle   {
  
  //declare variables
  private double sideA;
  private double sideB;
  private double sideC;
  
  /**
   * Constructor.
  */
  public Triangle() {
    //create the objects
    sideA = 1;
    sideB = 1;
    sideC = 1;
  }
  
  /**
   * Is triangle valid method.
   * This method is to be called when the semiperimeter is being calculated
  */
  public boolean istrianglevalid() {
    //if all of the sides are valid, then return true, else return false
    if (sideA > 0 && sideB > 0 && sideC > 0)  {
      return true;
    } else  {
      return false;
    }
  }
  
  /**
   * Is triangle valid method.
   * This method is to be called when the area is being calculated
  */
  public boolean istrianglevalid(double semiPer)  {
    //declare variables
    boolean checkA = true;
    boolean checkB = true;
    boolean checkC = true;
    
    if (semiPer >= sideA && semiPer >= sideB && semiPer >= sideC) {
      return true;
    } else  {
      return false;
    }
  }
  
  /**
   * Set sides method.
  */
  public void setsides(double side1, double side2, double side3)  {
    //set the sides to be values passed
    sideA = side1;
    sideB = side2;
    sideC = side3;
  }
  
  /**
   * Get name method.
  */
  public String getname() {
    //declare variables
    String name = "";
    
    //if all 3 sides are equal - equilateral
    //if only 2 sides are equal - isosceles
    //if no sides are equal - scalene
    if (sideC == sideA && sideC == sideB) {
      name = "Equilateral";
    } else if (sideC == sideB || sideC == sideB || sideA == sideB)  {
      name = "Isosceles";
    } else  {
      name = "Scalene";
    }
    
    //return the name
    return name;
  }
  
  /**
   * Get semiperimeter method.
  */
  public double getsemiper()  {
    //declare and calculate the semiperimeter
    double semiPer = (sideA + sideB + sideC) / 2;
    
    //return the semiperimeter
    return semiPer;
  }
  
  /**
   * Get area method.
  */
  public double getarea(double semiPer) {
    //declare variables
    boolean semiPerValid = istrianglevalid(semiPer);
    double area = 0;
    
    //if the semiperimeter is valid, do the calculation, else return -1
    if (semiPerValid == true)  {
      //declare and calculate the area
      area = Math.sqrt(semiPer * (semiPer - sideA) * (semiPer - sideB) * (semiPer - sideC));
    } else  {
      area = -1;
    }
    
    //return the area
    return area;
  }
}