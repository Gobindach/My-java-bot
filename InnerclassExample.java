import static java.lang.System.*;
class Outer
{
    int x=23;

class Inner
{
      void show()
    {
        out.println(x);

    }

}
}

public class InnerclassExample 
{
    public static void main(String[] args)
     {
        Outer outer=new Outer();
        Outer.Inner inner=outer.new Inner();
        inner.show();
    }
    
    
}
