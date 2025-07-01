import static java.lang.System.*;
public class AdditionFunction 
{
    int addthreeNumbers(int a, int b, int c)//function intialization
    {
        return a+b+c;//defination of function
    }
    public static void main(String args[])
    {
            AdditionFunction af=new AdditionFunction();
            out.println("After addtion of three numbers:-"+af.addthreeNumbers(20, 40, 60));//function calling
    }
    
}
