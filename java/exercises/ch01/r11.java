import java.util.Scanner;

public class r11 {

  public static void main(String[] args) {
    inputAllBaseTypes();
  }

  public static void inputAllBaseTypes() {
    // create a new scanner object to read standard user input
    Scanner input = new Scanner(System.in);

    // get a boolean
    System.out.print("Please enter a boolean: ");
    while(!input.hasNextBoolean()) {
      input.nextLine();
      System.out.print("Invalid boolean; Please enter a boolean: ");
    }

    System.out.println("Entered boolean: " + input.nextBoolean());


    // get a byte
    System.out.print("Please enter a byte: ");
    while(!input.hasNextByte()) {
      input.nextLine();
      System.out.print("Invalid Byte; Please enter a byte: ");
    }
    System.out.println("Entered byte :" + input.nextByte());

    // get a short
    System.out.print("Please enter a short");
    while(!input.hasNextShort()) {
      input.nextLine();
      System.out.print("Ivalid short; Please enter a short: ");
    }
    System.out.println("Entered short: " + input.nextShort());

    // get a int
    System.out.print("Please enter an integer: ");
    while(!input.hasNextInt()){
      input.nextLine();
      System.out.println("Invalid integer; Please enter an integer: ");
    }
    System.out.println("Entered integer: " + input.nextInt());

    // get a long
    System.out.print("Please enter a long: ");
    while(!input.hasNextLong()) {
      input.nextLine();
      System.out.print("Invalid long; Please enter a long: ");
    }
    System.out.println("Entered long: " + input.nextLong());

    // get a float
    System.out.print("Please enter a float");
    while(!input.hasNextFloat()) {
      input.nextLine();
      System.out.print("Invalid float; Please enter a float: ");
    }
    System.out.println("Entered float: " + input.nextFloat());

    // get a double
    System.out.print("Please enter a double: ");
    while(!input.hasNextDouble()) {
      input.nextLine();
      System.out.print("Invalid double; Please enter a double: ");
    }
    System.out.println("Entered double: " + input.nextDouble());


  }

}
