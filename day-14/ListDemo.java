import java.util.*;

class ListDemo
{
	public static void main(String[] args)
	{
		// method();
		ListDemoo();
	}

	public static void ListDemoo()
	{
		ArrayList al = new ArrayList();

		al.add("java01");
		al.add("java02");
		al.add("java03");

		sop(al);

		Iterator it = al.iterator();

		while (it.hasNext())
		{
			// sop("next:" + it.next());

			Object obj = it.next();

			if (obj.equals("java02"))
				// al.add("java008");
				it.remove();

			sop("obj=" + obj);
		}

		sop(al);
	}

	public static void method()
	{
		ArrayList al = new ArrayList();

		al.add("java01");
		al.add("java02");
		al.add("java03");

		sop("原集合是：" + al);

		al.add(1, "java09");

		// al.remove(2);

		al.set(2, "java07");

		sop("get(1):" + al.get(1));

		for (int i = 0; i < al.size(); i++)
		{
			sop("al(" + i + ")" + al.get(i));
		}

		sop("现在的集合是：" + al);

		Iterator it = al.iterator();
		while (it.hasNext())
		{
			sop("next:" + it.next());
		}

		sop("index=" + al.indexOf("java02"));

		List sub = al.subList(1, 3);

		sop("sub=" + sub);
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}