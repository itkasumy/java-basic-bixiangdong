/* class Single
{
	private static final Single s = new Single();
	private Single() {}
	public static Single getInstance()
	{
		return s;
	}
}
*/

class Single
{
	private static Single s = null;
	private Single () {};
	public synchronized static Single getInstance ()
	{
		if(s == null)
		{
			synchronized(Single.class)
			{
				if(s == null)
					s = new Single();
			}
		}
		return s;
	}
}

class SingleDemo
{
	public static void main(String[] args)
	{
	
	}
}