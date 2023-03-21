package poly;

public class Abc {
	static void x1()
	{
		System.out.println("Mumbai");
	}
	void m1(int i)
	{
		System.out.println("Pune" +i);
	}
	void m1(String a)
	{
		System.out.println("Amravti" +a);
	}

     public static void main(String[] args)
     {
		Abc a=new Abc();
		x1();
		a.m1(20);
		a.m1("Sanket");
		
		
	}
}
