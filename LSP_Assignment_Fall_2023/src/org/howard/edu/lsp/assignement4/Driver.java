package org.howard.edu.lsp.assignement4;


import java.util.ArrayList;

import org.howard.edu.lsp.assignement4.IntegerSet;


public class Driver {

	public static void main(String[] args) throws IntegerSetException {
        IntegerSet set1 = new IntegerSet();
        
        set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		System.out.println("Set1 "+set1.toString());
		set1.clear();
		System.out.println("Cleared set1 "+set1.toString());
		set1.add(5);
		set1.add(4);
		set1.add(2);
		System.out.println(set1.toString());



		IntegerSet set2 = new IntegerSet();

		set2.add(0);
		set2.add(1);
		set2.add(2);
		set2.add(3);
		set2.add(4);



		System.out.println("Set2 "+set2.toString());
		set2.clear();
		System.out.println("Cleared set2 "+set2.toString());
		set2.add(5);
		set2.add(3);
		set2.add(2);
		System.out.println("Set2 "+set2.toString());
		
		System.out.println("Equals "+set1.equals(set2));
		System.out.println("Equals "+set1.equals(set1));
		
		System.out.println("Largest set1 "+set1.largest());
		System.out.println("Largest set2 "+set2.largest());
		
		System.out.println("Smallest set1 "+set1.smallest());
		System.out.println("Smallest set2 "+set2.smallest());

		System.out.println("Set1 "+set1.toString());
		System.out.println("Set2 "+set2.toString());
		System.out.println("Union of the sets ");
		set1.union(set2);
		
		
		System.out.println("Set1 "+set1.toString());
		System.out.println("Set2 "+set2.toString());
		set1.diff(set2);
		System.out.println("Difference of the sets "+set1);
		
		set1.add(5);
		set1.add(4);
		set1.add(2);

		System.out.println("Set1 "+set1.toString());
		set1.remove(5);
		System.out.println("Item removed Set1 "+set1.toString());
		
		set1.intersect(set2);
		System.out.println("Shared item "+set1.toString());
		
		set1.clear();
		set2.clear();
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);		
		set1.add(5);
		System.out.println("Length of set1 "+ set1.length());

		set2.add(1);
		set2.add(2);
		set2.add(3);
		System.out.println("set 1 contains 5:" +set1.contains(5));
		set1.complement(set2);
		System.out.println("The complement "+set1);
		


		
		
		
		

		
		
		



	}

}
