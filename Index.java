// for project - menu choice will invoke another class
import java.util.Scanner;

public class Index{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("Select an option (1-6):");
    System.out.println();
    System.out.println("1. Break");
    System.out.println("2. Switch");
    System.out.println("3. Methods");
    System.out.println("4. Shadow");
    System.out.println("5. Overloading");
    System.out.println("6. First Array");
	System.out.println("7. Second Array");
	System.out.println("8. Try Catch");
	System.out.println("9. Enhanced");
	System.out.println("10.Search Student");
    System.out.println("11. Exit");

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
      	Methods.main(null);
      	break;
      case 4:
      	System.out.println("ReturnMethods lab");
      	ReturnMethods.main(null);
      	break;
      case 5:
      	System.out.println("Power ");
      	Power.main(null);
      	break;
      case 6:
	    System.out.println("Power ");
	  	Power.main(null);
      	break;
      case 7:
		System.out.println("Power ");
		Power.main(null);
      	break;
      case 8:
		System.out.println("Power ");
		Power.main(null);
      	break;
      case 9:
		System.out.println("Power ");
		Power.main(null);
      	break;
 	  case 10:
		System.out.println("Power ");
		Power.main(null);
      	break;
      case 11:
        System.out.println("Exiting....");
        break;
      default:
        System.out.println("Invalid choice");
        break;
    }
    System.out.println();

  }
}