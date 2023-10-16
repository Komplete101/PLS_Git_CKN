package org.howard.edu.lsp.assignement4;

import java.util.ArrayList;
import java.util.Iterator;

public class IntegerSet  {
	private ArrayList<Integer> set = new ArrayList<Integer>();
	
	public IntegerSet() {
		set = new ArrayList<Integer>();
	}
	
	public void add(int item) {
		if (!set.contains(item)) {
			set.add(item);	
		}
	};
	
	public void remove(int value) { 
		if (set.contains(value)) {
			 set.remove(Integer.valueOf(value));
		}
	}

 	public void clear() {
		set.clear();
	};

	public boolean contains(int value, ArrayList<Integer> set) {
		boolean a = false;
		Iterator<Integer> search = set.iterator();
		while(search.hasNext()) {
			if (search.next()==value) {
				a = true;
				break;
			}
		}
		return a;
	};

	public int smallest(ArrayList<Integer> set) throws IntegerSetException {
		Iterator<Integer> s = set.iterator();
		int small = s.next();
		if (s.hasNext() == false) {
			throw new IntegerSetException("The set is empty");
			break;
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
	public String largest(ArrayList<Integer> set) throws IntegerSetException{
		int large = 0;
		Iterator<Integer> l = set.iterator();
		if (set.isEmpty()) {
			throw new IntegerSetException ("The set is empty") ;
			break;
		}
		while(l.hasNext()) {
			if (l.next()>large) {
				large = l.next();
			}
		}
		return large+ " is the largest number in this set";	}

	public int length(ArrayList<Integer> set) {
		int x = 0;
		Iterator<Integer> count = set.iterator();
		while(count.hasNext()) {
			++x;
		}
		return x;
	};

	public boolean equals(ArrayList<Integer> set1, ArrayList<Integer> set2) {
		boolean a = true;
		Iterator<Integer> search1 = set1.iterator();
		Iterator<Integer> search2 = set2.iterator();
		if (!set1.size()==set2.size()) {
			a = false;
			break
		}
		else{
			while(search1.hasNext() && (search2.hasNext())) {
				if (!search1.next() == search2.next()) {
					a = false;
					break;
				}
			}
		}
		return a;
	};

	public void union(IntegerSet setB) {
		if (!setB.isEmpty()) {
			for (int i = 0; i < setB.length();i++) {
				int value = setB.get(i);
				if (!set.contains(value)) {
					set.add(value);
				}
			}
		}
	}

	public void intersect(ArrayList<Integer> set1,ArrayList<Integer> set2) {
		
	}
	public void diff(IntegerSet intSetb);{
	}
	public void complement(IntegerSet intSetb) {
		
	}
	boolean isEmpty();
	public String toString() {
		
	}
}
