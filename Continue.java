/**
 Name: Continue

 Description:

 Created by: Hubert Zawistowski

 Created on: 27/02/18

*/

import java.util.Scanner;

  public class Continue{
	  public static void main (String[] args){
		  Scanner input = new Scanner(System.in);
		  int counter = 0;
		  int x = 0;

		  System.out.println("Enter a number from 1 to 10");
		  x = input.nextInt();

		  while (counter < 10){
			  counter++;
			  if(x == counter){
				  continue;
		}

		  System.out.println(counter);




	  }
   }
}

