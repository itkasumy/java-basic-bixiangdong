class Test extends Thread
{
	// private String name;
	Test(String name)
	{
		// this.name = name;
		super(name);
	}
	public void run()
	{
		for(int i = 0; i < 60; i++)
			// System.out.println(this.name + " test run..." + i);
			// System.out.println(this.getName() + " test run..." + i);
			System.out.println(Thread.currentThread().getName() + " test run..." + i);
	}
}

class ThreadTest
{
	public static void main(String[] args)
	{
		Test t1 = new Test("one---");
		Test t2 = new Test("two---");

		t1.start();
		t2.start();
		
		for(int i = 0; i < 60; i++)
			System.out.println("main run..." + i);
	}
}