import static java.lang.System.*;
abstract class AbstractclassExample1
{
    abstract void run();//method declare
}
class AbstractclassExample
{
    void run()//method define
    {
        out.println("The Horse is running:-");
    }
    public static void main(String args[])
    {
        AbstractclassExample ab=new AbstractclassExample();
        ab.run();
         
    }
}