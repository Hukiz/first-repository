/**
 Author Name: Hubert Zawistowski

 File name: celsius.java

 Created on: 05/04/2018

 Brief Description: Converting celsius to fahrenheit.

 */

import java.util.Scanner;

public class celsius {
  public static void main(String args[]){
    System.out.print("Enter temperature: ");
    	Scanner scanner=new Scanner(System.in);

    	double fah=scanner.nextFloat();
    	double cel=5.0/9.0*(fah-32);

    System.out.println(fah+" Fahrenheit is "+cel+" Celsius");
	Index.main(null);
  }
}