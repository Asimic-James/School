
package GradeScore;

import java.util.*;

public class Grade {

  public static void main(String[] args) {
    double score;
    String grade = "";
    Scanner input = new Scanner(System.in);

    System.out.println("Enter Your Score: ");
    score = input.nextInt();

    if (score >= 70 && score <= 100) {
      grade = "A";
      System.out.println("Excellent Brain");
    } else if (score >= 60 && score <= 69.9) {
      grade = "B";
      System.out.println("Your Hardwork Is Paying Off");
    } else if (score >= 50 && score <= 59.9) {
      grade = "C";
      System.out.println("Kudos But You Can Achieve More");
    } else if (score >= 45 && score <= 49.9) {
      grade = "D";
      System.out.println("Pls Pick Up Seriousness");
    } else if (score >= 40 && score <= 44.9) {
      grade = "E";
      System.out.println("Pls Stop Playing Around");
    } else if (score >= 0 && score <= 39.9) {
      grade = "F";
      System.out.println("Pls Kindly Revisit The Course Next Year");
    } else {
      System.out.println("Your Score is undefined");
    }
    System.out.printf("You scored %.1f \n", score);
    System.out.println(grade);
  }
}
