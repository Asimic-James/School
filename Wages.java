package wages;

import java.util.*;

public class Wages {

  public static void main(String[] args) {

    double Basicwage, overtime = 0.0, extraHour, wage;
    int choice;
    //double basicWorkHours = 12, wagePerHour = 120,totalWage;

    Scanner input = new Scanner(System.in);

    System.out.print("Enter basic wage: ");
    Basicwage = input.nextDouble();
    System.out.print("Enter extra hours worked: ");
    extraHour = input.nextDouble();

    System.out.println("Choose a staff Cadre:");
    System.out.println("Senior staff Cadre---1");
    System.out.println("Junior staff Cadre---2");
    choice = input.nextInt();

    switch (choice) {
      case 1: 
        {
          overtime = 3 * extraHour;
          break;
        }
      case 2: 
        {
          overtime = 2 * extraHour;
          break;
        }
    }
    wage = Basicwage + overtime;
   // totalWage = basicWorkHours * wagePerHour;
    System.out.printf("Staff Basicwage is %.2f\n", Basicwage);
    System.out.printf("Staff overtime is %.2f\n", overtime);
    System.out.printf("Staff Gross wage is %.2f\n", wage);
    //System.out.printf("Staff total wage is %.2f\n", totalWage);
  }
}
