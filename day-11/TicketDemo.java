class Ticket implements Runnable // extends Thread
{
	// private int tick = 100;
	private static int tick = 100;
	Object obj = new Object();
	public void run()
	{
		while(true)
		{
			synchronized(obj)
			{
				if(tick > 0)
				{
					try
					{
						Thread.sleep(1);
					}
					catch (Exception e)
					{
					}
					System.out.println(Thread.currentThread().getName() + "...sale: " + tick--);
				}
			}
		}
	}
}

class TicketDemo
{
	public static void main(String[] args)
	{
		// System.out.println();
		// Ticket t1 = new Ticket();
		// Ticket t2 = new Ticket();
		// Ticket t3 = new Ticket();
		// Ticket t4 = new Ticket();

		// t1.start();
		// t2.start();
		// t3.start();
		// t4.start();

		Ticket t = new Ticket();
		
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		Thread t4 = new Thread(t);

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}