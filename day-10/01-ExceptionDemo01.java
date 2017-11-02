class FushuException extends Exception
{
	FushuException(String msg)
	{
		super(msg);
	}
}

class Demo01
{
	int div(int a, int b) throws FushuException
	{
		if(b < 0)
			throw new FushuException("除数为负数");
		return a / b;
	}
}

class ExceptionDemo01
{
	public static void main(String[] args)
	{
		Demo01 d = new Demo01();
		try
		{
			d.div(6, -7);
		}
		catch (FushuException e)
		{
			System.out.println(e.toString());
			return;
		}
		finally
		{
			System.out.println("finally");
		}

		System.out.println("over");
	}
}