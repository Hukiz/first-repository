// for project - menu choice will invoke another class
import java.util.Scanner;

public class Index{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);


    System.out.println("Select an option (1-3):");
    System.out.println();
    System.out.println("1. Break");
    System.out.println("2. Switch");
    System.out.println("3. Methods");
    System.out.println("4. Shadowing");
    System.out.println("5. Overloading");
    System.out.println("6. FirstArray");
    System.out.println("7. SecondArray");
    System.out.println("8. Try Catch");
    System.out.println("9. Enhanced For");
    System.out.println("10. Search Student");
    System.out.println("11. Search");
    System.out.println("12. Convert");
    System.out.println("13. Exit");

    System.out.println();

    System.out.print("Choice: ");
    int choice = input.nextInt();
    System.out.println();

    switch(choice){
      case 1:
        System.out.println("Break lab");
        Break_Ex2.main(null); //static method call, no instance required.
        break;
      case 2:
        System.out.println("Switch lab");
        System.out.println();
        FirstSwitch.main(null);
        break;
     case 3:
		System.out.println("Methods lab");
		System.out.println();
		Methods.main(null);
        break;
     case 4:
	    System.out.println("Shadowing lab");
	 	System.out.println();
	 	Shadow.main(null);
        break;
     case 5:
	 	System.out.println("Overloading lab");
	 	System.out.println();
	 	Arithmetic.main(null);
        break;
     case 6:
		System.out.println("First Array lab");
		System.out.println();
		FirstArray.main(null);
        break;
     case 7:
	 	System.out.println("Second Array lab");
	 	System.out.println();
	 	SecondArray.main(null);
        break;
     case 8:
	 	System.out.println("Try Catch lab");
	 	System.out.println();
	 	TryCatch.main(null);
        break;
     case 9:
	 	System.out.println("Enhanced For lab");
	 	System.out.println();
	 	EnhancedFor.main(null);
        break;
     case 10:
	 	System.out.println("Search Student lab");
	 	System.out.println();
	 	SearchStudent.main(null);
        break;
     case 11:
	 	System.out.println("Search lab");
	 	System.out.println();
	 	Search.main(null);
        break;
     case 12:
	 	System.out.println("Convert lab");
	 	System.out.println();
	 	Convert.main(null);
        break;
     case 13:
        System.out.println("Exiting....");
        break;
      default:
        System.out.println("Invalid choice");
        break;
    }
    System.out.println();

  }
}