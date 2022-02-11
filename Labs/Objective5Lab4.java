import java.util.Scanner;
public class Objective5Lab4 {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Please enter a number: ");
    int userNum = keyboard.nextInt();

    if (userNum % 2 == 0) {
      System.out.println("This number is even!");
    }
    else if (userNum % 2 == 1) {
      System.out.println("This number is odd!");
    }
    keyboard.close();
  }
}
