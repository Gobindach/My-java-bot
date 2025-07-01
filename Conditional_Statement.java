//Write a java proram to check the entered number is +ve or -ve.
import static java.lang.System.*;
import java.util.Scanner;

public class Conditional_Statement
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

out.print("Enter the number: ");
int number = sc.nextInt();

if (number > 0) {
out.println("The entered number is positive.");
} else if (number < 0) {
out.println("The entered number is negative.");
} else {
out.println("The entered number is zero.");
}
}
}
