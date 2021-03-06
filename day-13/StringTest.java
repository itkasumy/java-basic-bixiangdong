class StringTest
{
	public static void sop(String str)
	{
		System.out.println(str);
	}

	public static void main(String[] args)
	{
		String str = "abc def";
		sop(str);
		// sop("(" + myTrim(str) + ")");

		// sop("(" + reverseString(str) + ")");

		sop("(" + reverseString(str, 1, 6) + ")");
	}

	public static String myTrim(String str)
	{
		int start = 0, end = str.length() - 1;

		while(start <= end && str.charAt(start) == ' ')
			start++;

		while(start <= end && str.charAt(end) == ' ')
			end--;

		return str.substring(start, end + 1);
	}

	public static String reverseString(String str)
	{
		// char[] chars = str.toCharArray();
		// reverse(chars);
		// return new String(chars);
		return reverseString(str, 0, str.length());
	}

	public static String reverseString(String str, int start, int end)
	{
		char[] chars = str.toCharArray();
		reverse(chars, start, end);
		return new String(chars);
	}

	private static void reverse(char[] arr)
	{
		for(int start = 0, end = arr.length - 1; start < end; start++, end--)
		{
			swap(arr, start, end);
		}
	}

	private static void reverse(char[] arr, int x, int y)
	{
		for(int start = x, end = y - 1; start < end; start++, end--)
		{
			swap(arr, start, end);
		}
	}

	private static void swap(char[] arr, int x, int y)
	{
		char temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
}