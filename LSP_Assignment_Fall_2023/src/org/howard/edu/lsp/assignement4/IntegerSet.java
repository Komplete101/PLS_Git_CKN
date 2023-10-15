package org.howard.edu.lsp.assignement4;

import java.util.ArrayList;
import java.util.Iterator;

public class IntegerSet  {
	private ArrayList<Integer> set = new ArrayList<Integer>();
	
	public IntegerSet() {
		set = new ArrayList<Integer>();
	}
	
 	public IntegerSet(ArrayList<Integer> set) {
 		this.set = set;
	}
 	
 	public void clear(ArrayList<Integer> set) {
 		this.set = new ArrayList<Integer>();	
 	};
 	
	public int length(ArrayList<Integer> set) {
		int x = 0;
		Iterator<Integer> count = set.iterator();
		while(count.hasNext()) {
			++x;
			}
		System.out.println(x);
	}; 
	
	public boolean equals(ArrayList<Integer> set1, ArrayList<Integer> set2) {
		boolean a = true;
		Iterator<Integer> search1 = set1.iterator();
		Iterator<Integer> search2 = set2.iterator();
		while(search1.hasNext() && (search2.hasNext())){
			if (search1.next()!=search2.next()) {
				a=false;
				break;
			}
		}
		System.out.print(a);
	};
	
	public boolean contains(int value, ArrayList<Integer> set) {
		boolean a = false;
		Iterator<Integer> search = set.iterator();
		while(search.hasNext()) {
			if (search.next()==value) {
				 a = true;
			}
		System.out.print(a);
		}
		
	};
	public int largest(ArrayList<Integer> set) throws IntegerSetException{
		int large = 0;
		Iterator<Integer> l = set.iterator();
		if (set.isEmpty()) {
			throw new IntegerSetException ("The set is empty") ;
		}
		while(l.hasNext()) {
			if (l.next()>large) {
				large = l.next();
			}

		return large+ " is the largest number in this set";
}
	
	public int smallest(ArrayList<Integer> set) throws IntegerSetException {
			int small = 0;
			Iterator<Integer> s = set.iterator();
			Integer small = s.next();
			if (s.hasNext() == false) {
				throw new IntegerSetException("The set is empty");
			} else {
				small = s.next();
				while (s.hasNext()) {
					if (s.next() < small) {
						small = s.next();
					}
				}
			}
			return small;
		}


	public void add(int item,ArrayList<Integer> set) {
		if (set.contains(item)) {
			System.out.println("Item already present");
		}
		else {
			set.add(item);	
		}
		
	};
	public void remove(int item,ArrayList<Integer> set ) {
		boolean present = false
		Iterator<Integer> gone = set.iterator();
		while (gone.hasNext()){
			Integer g = gone.next();
			if (g == item){
				 g =  Null
			}
		}
	}

	public void union(ArrayList<Integer> set1,ArrayList<Integer> set2) {
			ArrayList<Integer> un = new ArrayList<Integer>();

		}
		
	};
	public void intersect(IntegerSet intSetb) {
		
	}
	public void diff(IntegerSet intSetb);{
	}
	public void complement(IntegerSet intSetb) {
		
	}
	boolean isEmpty();
	public String toString() {
		
	}
}
