import static java.lang.System.*;
class Hierarchicalinheritance1
{
    void isCalling()
    {
        out.println("The 1st class is Calling");
    }    
}
class Hierarchicalinheritance2 extends Hierarchicalinheritance1
{
    @Override
    void isCalling()
    {
        out.println("The 2nd class is Calling:-");
    }
}

class Hierarchicalinheritance3 extends Hierarchicalinheritance1
{
    @Override
    void isCalling()
    {
        out.println("The 3rd class is Calling:-");
    }
}

public class Hierarchicalinheritance 
{
    public static void main(String[] args) 
    {
        Hierarchicalinheritance1 obj1=new Hierarchicalinheritance1();
        obj1.isCalling();
        Hierarchicalinheritance2 obj2=new Hierarchicalinheritance2();
        obj2.isCalling();
        Hierarchicalinheritance3 obj3=new Hierarchicalinheritance3();
        obj3.isCalling();
    }
}
