class StringBufferDemo
{
	public static void method_add()
	{
		StringBuffer sb = new StringBuffer();
		// StringBuffer sb1 = sb.append(34);

		sb.append("abc").append(true).append(36);

		sb.insert(1, "qq");
		sop(sb.toString());
		// sop("sb == sb1:" + (sb == sb1));
		// sop(sb.toString());
		// sop(sb1.toString());
	}

	public static void method_del()
	{
		StringBuffer sb = new StringBuffer("abcdef");
		// sb.delete(1, 3);
		// sb.delete(0, sb.length());
		// sb.delete(2, 3);
		sb.deleteCharAt(2);

		sop(sb.toString());
	}

	public static void method_update()
	{
		StringBuffer sb = new StringBuffer("abcdef");

		// sb.replace(2, 3, "java");

		sb.setCharAt(2, 'k');

		sop(sb.toString());
	}

	public static void method_getChars()
	{
		StringBuffer sb = new StringBuffer("abcdefghijklmn");

		char[] chs = new char[6];

		sb.getChars(1, 4, chs, 1);

		for(int i = 0; i < chs.length; i++)
		{
			sop("chs[" + i + "] = " + chs[i] + ";");
		}
	}

	public static void method_getChars_builder()
	{
		StringBuilder sb = new StringBuilder("abcdefghijklmn");

		char[] chs = new char[6];

		sb.getChars(1, 4, chs, 1);

		for(int i = 0; i < chs.length; i++)
		{
			sop("chs[" + i + "] = " + chs[i] + ";");
		}
	}

	public static void main(String[] args)
	{
		// method_del();
		// method_update();
		// method_getChars();
		method_getChars_builder();
	}

	public static void sop(String str)
	{
		System.out.println(str);
	}
}