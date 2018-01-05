class IntegerDemo
{
	/* 基本数据类型对象包装类 */
	public static void main(String[] args)
	{
		// sop("int max = " + Integer.MAX_VALUE);
		// sop("int min = " + Integer.MIN_VALUE);

		// int num = Integer.parseInt("123");
		// long l = Long.parseLong("1234");

		// sop("num = " + (num + 4));
		// sop("l = " + (l + 5));

		// sop(Integer.toBinaryString(-6));
		// sop(Integer.toHexString(60));

		// int x = Integer.parseInt("110", 2);
		// sop("x = " + x);


		// Integer x = new Integer("123");
		// Integer y = new Integer(123);

		// sop("x == y: " + (x == y));
		// sop("x.equals(y): " + x.equals(y));

		Integer a = 128;
		Integer b = 128;
		sop("a == b: " + (a == b));

		Integer m = 127;
		Integer n = 127;
		sop("m == n: " + (m == n));
	}

	public static void sop(String str)
	{
		System.out.println(str);
	}
}
