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
	
	public boolean equals(Object o) {
		
	};
	public boolean contains(int value) {
		
	};
	public int largest() {
		
	};
	public int smallest() IntegerSetException {
		
	};
	
	public void add(int item,ArrayList<Integer> set) {
		if (set.contains(item)) {
			System.out.println("Item already present");
		}
		else {
			set.add(item);	
		}
		
	};
	public void remove(int item) {
		
	};
	public void union(IntegerSet intSetb) {
		
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

