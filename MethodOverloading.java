import static java.lang.System.*;
class MethodOverloading
{
	static int addInteger(int x,int y)
{
	return x+y;
}

	static int  addInteger(int x, int  y, int z)
{
	return x+y+z;
}

	public static void main(String args[])
{
	//int a=addInteger(23,34);
	//System.out.println("After addition value="+a);
	out.println(MethodOverloading.addInteger(23, 34));
	//int b=addInteger(4,7,9);
	//System.out.println("Afer addition value="+b);
	out.println(MethodOverloading.addInteger(4,7,9));
}
}