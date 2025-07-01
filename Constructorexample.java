import static java.lang.System.*;
class Constructorexample
{
	
Constructorexample()//default constructor
{
	out.println("This is the default constructor ");
}
Constructorexample(int x, int y)//parameterised constructor
{
	int z= x+y;
	
	out.println("This is the paramterized constructor="+z);
}
Constructorexample(int x, int y,int z)//multivalue parameterised constructor
{
	int a=x+y+z;
	out.println("This is the multiparameterized paramterized constructor="+a);
}

public static void main(String args[])
{
	Constructorexample ce=new Constructorexample();//default
	Constructorexample ce1=new Constructorexample(5,10);//paramterised
	Constructorexample ce2=new Constructorexample(3,6,9);//multivalues parametrised constructor
}
}



