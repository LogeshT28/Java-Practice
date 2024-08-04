//package LinkedListLearning;

import java.util.*;
 class checkelements
{
	public static void main(String[] args)
	{
		LinkedList <String> technology = new LinkedList <String> ();
		technology.add("c,c++");
		technology.add("python");
		technology.add("java");
		technology.add("php");
		technology.add("nodejs");
		technology.add("Angular");
		System.out.println("Given linked list: " + technology);
		if (technology.contains("java"))
		{
			System.out.println("technology java is in our list");
		}
		else
		{
			System.out.println("technology java is not in our list..");
		}
 
		if (technology.contains("React"))
		{
			System.out.println("Technology React is Present..");
		}
		else
		{
			System.out.println("Technology React is not in our list.");
		}
	}
}

