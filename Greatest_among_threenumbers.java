//write a java program to check the greatest number among three entered numbers.
import static java.lang.System.*;
import java.util.Scanner;

public class Greatest_among_threenumbers {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        out.println("Enter the 1st number:");
        int num1 = scanner.nextInt();

        out.println("Enter the 2nd number:");
        int num2 = scanner.nextInt();

        out.println("Enter the 3rd number:");
        int num3 = scanner.nextInt();

        if (num1 >= num2 && num1 >= num3) {
            out.println("The greatest number is: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            out.println("The greatest number is: " + num2);
        } else {
            out.println("The greatest number is: " + num3);
        }
    }
}
