import static java.lang.System.*;
interface InterfaceExample1
{
    abstract void display();
}


 class InterfaceExample2 implements InterfaceExample1
  {
    
    public void display()
    {
        out.println("display the screen:-");
    }
}
public class InterfaceExample

{
    public static void main(String[] args)
     {
        InterfaceExample1 Ie=new InterfaceExample2();
        Ie.display();
    }
}
