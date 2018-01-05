import java.util.*;

class LinkListDemo
{
	public static void main(String[] args)
	{
		LinkedList link = new LinkedList();

		link.addFirst("java01");
		link.addFirst("java02");
		link.addFirst("java03");
		link.addFirst("java04");

		// sop(link);
		// sop(link.getFirst());
		// sop(link.getLast());
		// sop("size:" + link.size());
		// sop(link.removeFirst());
		// sop("size:" + link.size());

		while (!link.isEmpty())
		{
			sop(link.removeLast());
		}
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}