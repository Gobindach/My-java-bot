import static java.lang.System.*;
 class MultiLevelinheritance1
{
    void isDisplay()
    {
            out.println("The 1st class is Displaying:-");
    }
}

 class MultiLevelinheritance2 extends MultiLevelinheritance1
{
    @Override
    void isDisplay()
    {
        out.println("The 2nd class is Displaying");
        // TODO Auto-generated method stub

    }
}

public class MultiLevelinheritance extends MultiLevelinheritance2

{
    void isDisplay()
    {
        out.println("The 3rd class is Displaying");
        super.isDisplay();
    }
    public static void main(String[] args) 
    {
        MultiLevelinheritance obj=new MultiLevelinheritance();
        obj.isDisplay();
        MultiLevelinheritance1 obj2=new MultiLevelinheritance2();
        obj2.isDisplay();
        MultiLevelinheritance1 obj1=new MultiLevelinheritance1();
        obj1.isDisplay();

    }
    
}
