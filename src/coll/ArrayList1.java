package coll;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {
public static void main(String args[])
{
	ArrayList al=new ArrayList();
	al.add("mina");
	al.add(true);
	al.add('a');
	al.add(10);
	al.add(10.5);
	System.out.println(al);
	System.out.println(al.size());
   
	 //remove
	al.remove(true); 
	System.out.println(al);
	al.add(1,true);
	System.out.println(al);
	
	System.out.println(al.get(2));
	al.set(1,"advaint");
	System.out.println(al);
	
	System.out.println(al.isEmpty());
	
	for(int i=0;i<al.size();i++)
	{
		System.out.println(al.get(i));
	}
	
	 for(Object ob:al)
	{
		System.out.println(ob);
	}
	
	Iterator it=al.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
 
}


}
