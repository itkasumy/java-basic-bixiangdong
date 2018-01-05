class Res
{
	private String name;
	private String sex;
	private Boolean flag = false;

	public synchronized void set(String name, String sex)
	{
		if(flag)
			try { this.wait(); } catch (Exception e) {}
		this.name = name;
		this.sex = sex;
		flag = true;
		this.notify();
	}

	public synchronized void out()
	{
		if(!flag)
			try { this.wait(); } catch (Exception e) {}
		System.out.println(name + "......" + sex);
		flag = false;
		this.notify();
	}
}

class Input implements Runnable
{
	private Res r;
	Input(Res r)
	{
		this.r = r;
	}
	public void run()
	{
		int x = 0;
		while(true)
		{
			if(x == 0)
				r.set("mike", "man");
			else
				r.set("丽丽", "女女女女女女女女女女女女女女女女女女");
			x = (x + 1) % 2;
			/*synchronized(r){
				if(r.flag)
					try { r.wait(); } catch (Exception e) {}
				if(x == 0)
				{
					r.name = "mike";
					r.sex = "man";
				} else {
					r.name = "丽丽";
					r.sex = "女女女女女女女女女女女女女女女女女女";
				}
				x = (x + 1) % 2;
				r.flag = true;
				r.notify();
			}*/
		}
	}
}

class Output implements Runnable
{
	private Res r;
	Output(Res r)
	{
		this.r = r;
	}
	public void run()
	{
		while(true)
		{
			r.out();
			/*synchronized(r) {
				if(!r.flag)
					try { r.wait(); } catch (Exception e) {}
				System.out.println(r.name + "......" + r.sex);
				r.flag = false;
				r.notify();
			}*/
		}
	}
}

class InputOutputDemo
{
	public static void main(String[] args)
	{
		Res r = new Res();

		new Thread(new Input(r)).start();
		new Thread(new Output(r)).start();

		/*Input in = new Input(r);
		Output out = new Output(r);

		Thread t1 = new Thread(in);
		Thread t2 = new Thread(out);

		t1.start();
		t2.start();*/
	}
}