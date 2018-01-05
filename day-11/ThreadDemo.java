class Demo extends Thread
{
	public void run()
	{
		for(int i = 0; i < 60; i++)
			System.out.println("demo run..." + i);
	}
}

class ThreadDemo
{
	public static void main(String[] args)
	{
		Demo d = new Demo();
		// d.start();
		d.run();

		for(int i = 0; i < 60; i++)
			System.out.println("Hello World..." + i);
	}
}