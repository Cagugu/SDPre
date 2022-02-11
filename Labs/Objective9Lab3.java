import java.util.Scanner;

public class Objective9Lab3 {
  public static void main(String[] args) {
    printMenu();
    Scanner keyboard = new Scanner(System.in);
    int selection;

    while(true) {

      selection = keyboard.nextInt();

      if (selection == 1) {
        System.out.println("Hello Human");
        printMenu();
      }
      else if (selection == 2) {
        System.out.println("Apples, Bananas, Coconuts");
        printMenu();
      }
      else {
        System.out.println("Goodbye");
        break;
      }
    }
    keyboard.close();
  }
  public static void printMenu() {
    System.out.println("_____Menu_____");
    System.out.println("1: Say Hello");
    System.out.println("2: List My favorite foods");
    System.out.println("3: Exit");
    System.out.println();
  }
}
