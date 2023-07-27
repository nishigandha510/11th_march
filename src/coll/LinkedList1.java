package coll;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String args[])
	{
		LinkedList ll=new LinkedList();
		ll.add(10);
		ll.add("abc");
		ll.add(10.15);
		ll.add(null);
		ll.add(true);
		ll.add('a');
		
		System.out.println(ll);
		System.out.println(ll.size());
		ll.remove(true);
		System.out.println(ll);
		ll.add(5,true);
		System.out.println(ll);
		System.out.println(ll.get(2));
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		
		System.out.println(ll.isEmpty());
		
		System.out.println(ll.contains("abc"));
		
		for(int i=0;i<ll.size();i++)
		{
			System.out.print(ll.get(i)+" ");
		}
		System.out.println();
		for(Object ob:ll)
		{
			System.out.print(ob+" ");
		}
		System.out.println();
		Iterator it=ll.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next() +" ");
		}
		System.out.println();
		
		
	}
}
