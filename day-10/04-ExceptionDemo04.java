interface Shape
{
	void getArea();
}

class NoValueException extends RuntimeException
{
	NoValueException(String msg)
	{
		super(msg);
	}
}

class Rec implements Shape
{
	private int len, wid;
	Rec(int len, int wid) // throws NoValueException
	{
		if(len <= 0 || wid <= 0)
			throw new NoValueException("出现非法值");

		this.len = len;
		this.wid = wid;
	}

	public void getArea()
	{
		System.out.println(len * wid);
	}
}

class Circle implements Shape
{
	private int radius;
	public static final double PI = 3.1;

	Circle(int radius)
	{
		if(radius <= 0)
			throw new NoValueException("非法");
		this.radius = radius;
	}

	public void getArea()
	{
		System.out.println(radius * radius * PI);
	}
}

class ExceptionDemo04
{
	public static void main(String[] args)
	{
		// try
		// {
			// Rec r = new Rec(-3, 4);
			// r.getArea();
		// }
		// catch (NoValueException e)
		// {
			// System.out.println(e.toString());
		// }

		Circle c = new Circle(-3);
		c.getArea();

		System.out.println("over");
	}
}