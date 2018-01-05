class StopThreadDemo
{
	public static void main(String[] args)
	{
		private boolean flag = true;

		public void changeFlag()
		{
			this.flag = false;
		}

		StopThread s = new StopThread();
		
		Thread t1 = new Thread(s);
		Thread t2 = new Thread(s);

		t1.start();
		t2.start();

		int num = 0;
		while(flag)
		{
			if(num++ == 60)
			{
				s.changeFlag();
				break;
			}
			System.out.println(Thread.currentThread().getName() + ".................." + num);
		}
	}
}

class StopThread implements Runnable
{
	public void run()
	{
		while(true)
		{
			System.out.println(Thread.currentThread().getName() + "...run");
		}
	}
}
