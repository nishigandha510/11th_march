package coll;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedList2 {
	public static void main(String args[])
	{
		LinkedList al=new LinkedList();
		al.add(12);
		al.add(41);
		al.add(15);
		al.add(10);
		al.add(30);
		al.add(9);
		System.out.println(al);
		LinkedList al2=new LinkedList();
		al2.addAll(al);
		
		System.out.println(al2);
		al2.removeAll(al);
		System.out.println(al2);
		
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		
		Collections.sort(al,Collections.reverseOrder());
		System.out.println(al);
		
		Collections.shuffle(al);
		System.out.println(al);
		
	}
}

		
	
	

		
		