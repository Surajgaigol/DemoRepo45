 package poly;

public class Xyz extends Abc{
	void m1(int a) {
		System.out.println("Software Developer");
	}
	
	
	void m1(String a)
		{
			System.out.println("Software Tester" +a);
		}
		
		public static void main(String[] args) {
			
			
			Xyz c=new Xyz();
			Abc b=new Abc();
			b.m1("suraj");
			c.m1("suraj");
			c.m1(20);
			b.m1(22);
		
		}
	}

