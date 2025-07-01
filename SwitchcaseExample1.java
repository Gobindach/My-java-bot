import static java.lang.System.*;
public class SwitchcaseExample1
 {
    
    public static void main(String args[])
    {
        int day=5;
         switch(day)
         {
            case 1:
            {
                out.println("Monday");
            }
            break;
            case 2:
            {
                out.println("Tuesday");
            }
            break;
            case 3:
            {
                out.println("Wednessday");
            }
            break;
            case 4:
            {
                out.println("Thursday");
            }
            break;
            case 5:
            {
                out.println("Friday");
            }
            break;
            case 6:
            {
                out.println("Saterday");
            }
            break;
            case 7:
            {
                out.println("Sunday");
            }
            break;
            default:
            {
                out.println("Default day");
            }
         }
    }
   
    
}
