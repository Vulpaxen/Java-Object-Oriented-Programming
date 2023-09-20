class Test
{
	static int i=1;
	int j;

	public void setJ(int a)
	{
		j=a;
		i=10;
	}

	public int getJ()
	{
		return j;
	}

	public static void coba()
	{
		i=10;
		System.out.println("i = "+i);
	}
}

public class TestClass
{
	public static void main(String[]args)
	{
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();

		t1.setJ(10);
		Test.i = 10;
		t2.setJ(20);
		t2.i = 20;
		t3.setJ(30);
		t3.i = 30;

		System.out.println("j="+t1.getJ()+" i="+t1.i);
		System.out.println("j="+t2.getJ()+" i="+t2.i);
		System.out.println("j="+t3.getJ()+" i="+t3.i);
		t1.coba();
		Test.coba();
	}
}

