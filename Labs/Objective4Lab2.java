import java.util.Scanner;

public class Objective4Lab2 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    System.out.println("Please enter the first whole number you would like to add.");
    int num1 = keyboard.nextInt();

    System.out.println("Please enter the second whole number you would like to add.");
    int num2 = keyboard.nextInt();

    System.out.println("Please enter the third whole number you would like to add.");
    int num3 = keyboard.nextInt();

    System.out.println("Please enter the first decimal number you would like to add.");
    double num4 = keyboard.nextDouble();

    System.out.println("Please enter the second decimal number you would like to add.");
    double num5 = keyboard.nextDouble();

    System.out.println("Please enter the third decimal number you would like to add.");
    double num6 = keyboard.nextDouble();

    int sum1 = num1 + num2 + num3;
    double sum = num4 + num5 + num6;
    System.out.println("The sum of " + num1 + " + " + num2 + " + " + num3 + " = " + sum1);


    System.out.println("The sum of " + num4 + " + " + num5 + " + " + num6 + " = " + sum );

    keyboard.close();

  }
}
