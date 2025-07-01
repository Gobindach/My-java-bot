//Recusion of function Example
import static java.lang.System.*;
public class Fiboncaii 
{
    public static void main(String[] args) 
    {
        int n=10;//no of terms
        int x=0,y=1;
        out.print("Fibonacii series:-"+x+"  "+y);
        for (int i=2;i<=n;i++)
        {
            int z=x+y;
            x=y;
            y=z;
            out.print("\t"+z);

        }


        
    }
    
}
