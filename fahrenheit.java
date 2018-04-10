/**
 Author Name: Hubert Zawistowski

 File name: fahrenheit.java

 Created on: 05/04/2018

 Brief Description: Converting fahrenheit to celsius.

 */

import java.util.Scanner;

public class fahrenheit {
  public static void main(String args[]){
    System.out.print("Enter temperature: ");
    	Scanner scanner=new Scanner(System.in);

    	double cel=scanner.nextFloat();
    	double fah=9.0/5.0*cel+32;

    System.out.println(cel+" Fahrenheit is "+fah+" Celsius");
    Index.main(null);
  }
}