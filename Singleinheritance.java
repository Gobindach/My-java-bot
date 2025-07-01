import static  java.lang.System.*;
class Singleinheritance1//parent class
{
   void isRunning()
    {
        out.println("The Horse1 is running");
    }
}
class Singleinheritance extends  Singleinheritance1//child class
{
     void isRunning()
    {
        out.println("The Horse2 is running:-");
    }
    public static void main(String args[])
    {
         Singleinheritance obj=new Singleinheritance();
         Singleinheritance1 obj1=new Singleinheritance1();
         obj.isRunning();
         obj1.isRunning();
    }

} 