/**
 Name: Break_Ex3

 Description:

 Created by: Hubert Zawistowski

 Created on: 20/02/18

*/

import java.util.Scanner;

public class Break_Ex3{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int counter = 0;

    System.out.println("Guess the correct number");
    System.out.println("Guess a number from 1 to 10");
    System.out.println("You have 10 attempts: ");

    while(input.hasNext()){
		 counter++;
      if(
		  (input.nextInt() == 8) || (counter == 10)){
        System.out.println("Game over");
        break;
      }




        }
    }
}