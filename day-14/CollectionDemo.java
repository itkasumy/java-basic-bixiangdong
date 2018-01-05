import java.util.*;

class CollectionDemo
{
	public static void base_method()
	{
		ArrayList al = new ArrayList();

		al.add("java01");
		al.add("java02");
		al.add("java03");
		al.add("java04");

		sop("原集合：" + al);

		al.remove("java02");
		// al.clear();

		sop("java03是否存在：" + al.contains("java03"));

		sop("al是否为空：" + al.isEmpty());

		sop("size:" + al.size());

		sop("现集合：" + al);
	}

	public static void method_get()
	{
		ArrayList al = new ArrayList();

		al.add("java01");
		al.add("java02");
		al.add("java03");
		al.add("java04");

		sop(al);

		Iterator it = al.iterator();

		while(it.hasNext())
		{
			sop(it.next());
		}
	}
	public static void method02()
	{
		ArrayList al1 = new ArrayList();

		al1.add("java01");
		al1.add("java02");
		al1.add("java03");
		al1.add("java04");

		ArrayList al2 = new ArrayList();

		al2.add("java01");
		al2.add("java02");
		al2.add("java05");
		al2.add("java06");

		//al1.retainAll(al2);

		al1.removeAll(al2);

		sop("al1: " + al1);
		sop("al2: " + al2);
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		// base_method();
		// method02();

		method_get();
	}
}