class SumForAndWhile
{
	public static void main(String[] args) {
		int sum = 0;

		/*
		int i = 1;
		while (i <= 10)
		{
			sum += i;
			i++;
		}

		System.out.println("while sum = " + sum);
		*/
		for (int i = 1; i <= 10 ; i++)
		{
			sum += i;
		}

		System.out.println("for sum = " + sum);
	}
}