import static java.lang.System.*;
public class Copyconstructor
 {
    int a;
    int b;
    Copyconstructor()
    {
        this.a=34;
       this.b=76;

    }
    
    Copyconstructor(Copyconstructor cc)//here we are creating the cloning object of default constructor
    {
        this.a=cc.a;
        this.b=cc.b;
       
        out.println("This is the example of copy constructor:-");
    }
    public static void main(String args[])
    {
        
        Copyconstructor cp=new Copyconstructor();
        Copyconstructor cp1=new Copyconstructor();
        out.println("it is the origioanal constructor:-"+cp.a+"  "+cp.b);
        out.println("it is the cloned constructor:-"+cp1.a+" "+cp1.b);
    }
    
}
