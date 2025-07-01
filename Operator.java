 class Operator {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.print("----------Arithmetic operators-----------\n");
		int a=24,b=6;
		String kl="klu";
		System.out.println(a+b+"\n");
		System.out.println(a-b+"\n");
		System.out.println(a*b+"\n");
		System.out.println(a/b+"\n");
		System.out.println(a%b+"\n");
		System.out.print("----------Assignment operators-----------\n");
		System.out.println(b+=a);
		System.out.println(b-=a);
		System.out.println("----------Bitwise operator-----------\n");
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(a^b);
		System.out.println("----------Increment/Decrement operator-----------\n");
		System.out.println(++b);//pre increment b=1 ,2
		System.out.println(b++);//post increment b=1,1,2
		System.out.println(--b);
		System.out.println(b--);
		System.out.println("----------comparision operator-----------\n");
		System.out.println((a>b)?a:b);//condtional operator
		System.out.println("----------Relation operator-----------\n");
		System.out.print((a>b)+"\n");
		System.out.print((a<b)+"\n");
		System.out.print((a>=b)+"\n");
		System.out.print((a<=b)+"\n");
		System.out.print((a!=b)+"\n");
		System.out.println("----------Logical Operator-----------\n");
		System.out.println((a>b)&&(a<b));
		System.out.println((a>b)||(a<b));
		System.out.println((a>b)!=(a<b));
		System.out.println("----------Shift operator-----------\n");
		System.out.println(b>>2); //010=2 001=1,100=4(6*2^2),(6*1/2^2)
		System.out.println(b<<2);	
		System.out.println("----------Instanceof operator-----------\n");
		Operator o=new Operator();
		System.out.println(o instanceof Operator );
		System.out.println("----------Indexeof operator-----------\n");
		System.out.println(kl.indexOf("u"));
	}

}
