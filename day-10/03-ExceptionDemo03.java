class AException extends Exception
{
	AException(String msg) 
	{
		super(msg);
	}
}

class BException extends AException
{
	BException(String msg)
	{
		super(msg);
	}
}

class CException extends Exception
{
	CException(String msg)
	{
		super(msg);
	}
}

class Fu
{
	void show() throws AException
	{
	
	}
}

class Test
{
	void function(Fu f)
	{
		try
		{
			f.show();
		}
		catch (AException e)
		{

		}
	}
}

class Zi extends Fu
{
	void show() throws AException
	{
	
	}
}

class ExceptionDemo03
{
	public static void main(String[] args)
	{
		System.out.println("");
	}
}