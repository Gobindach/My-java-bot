//write a java program to check the entered year is leap year or not
import static java.lang.System.*;
import java.util.Scanner;
public class Leapyear 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        out.println("Enter the year:-");
        int year=sc.nextInt();
        if (year%400==0 || year%4==0)
        {
             out.println("The year is leap year:-");
            
        }
        else
        {
             out.println("The year is not leap year:-");
        }
    }
}
