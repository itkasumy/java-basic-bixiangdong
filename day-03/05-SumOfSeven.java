class SumOfSeven
{
	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		for (int i = 1; i <= 100 ; i++ )
		{
			if (i % 7 == 0)
			{
				count++;
				sum += i;
			}
		}

		System.out.println("100以内7的倍数的和是：" + sum + ",7的倍数共计：" + count + "个");
	}
}