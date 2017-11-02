class BreakContinueDemo
{
	public static void main(String[] args) {
		w: for (int i = 0; i < 60 ; i++ )
		{
			n: for (int j = 0; j < 60 ; j++ )
			{
				if (i % 2 == 0)
				{
					break n;
				}

				System.out.print(i);
			}

			if (i % 3 == 0)
			{
				continue;
			}
		}
	}
}