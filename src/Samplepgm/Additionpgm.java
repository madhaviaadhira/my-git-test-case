package Samplepgm;


public class Additionpgm {

	
		 public static int a=10;
		 public static int b=5;
		 public static int c;
		
		 void add()
			{
				c=a-b;
				System.out.println(c);
			}
		void sub()
		{
			c=a-b;
			System.out.println(c);
		}
		void mul()
		{
			c=a*b;
			System.out.println(c);
		}
		void div()
		{
			c=a%b;
			Object system;
			System.out.println(c);
		}
		public static void main(String[] args)
		{

		Additionpgm ex=new Additionpgm();
		ex.add();
		ex.sub();
		ex.mul();
		ex.div();
			
		}

}
