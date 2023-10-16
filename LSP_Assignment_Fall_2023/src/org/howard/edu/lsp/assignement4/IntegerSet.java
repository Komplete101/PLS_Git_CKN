package org.howard.edu.lsp.assignement4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class IntegerSet  {
	private ArrayList<Integer> set = new ArrayList<Integer>();
	public ArrayList<Integer> gett(){
		return this.set;
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

	public int smallest() throws IntegerSetException {
		int smallest = 0;
		if(set.isEmpty()) {
			throw new IntegerSetException("IntegerSetException: The provided list is empty; there is no smallest integer.");
		}
		else {
			ArrayList<Integer> sortedList = new ArrayList<Integer>(set);
			Collections.sort(sortedList);								// this already existing Java method sorts in ascending order
			smallest = sortedList.get(0);
			return smallest;
		}
	}
	public int largest() throws IntegerSetException{
		int largest = 0;
		if(set.isEmpty()) {
			throw new IntegerSetException("IntegerSetException: The provided list is empty; there is no largest integer.");
		}
		else {
			ArrayList<Integer> sortedList = new ArrayList<Integer>(set);
			Collections.sort(sortedList);								
			largest = sortedList.get(sortedList.size() -1);
			return largest;
		}
	}

	public int length() {
		return set.size();
	};

	public boolean equals(Integer setB) {
		ArrayList<Integer> set1 = setB.gett();
		if(set.containsAll(set1) && set1.containsAll(set)) {		
			return true;		}	
		else {
			return false;
	}
}

	public void union(IntegerSet setB) {
		ArrayList<Integer> set1 = setB.gett();			
	    for (int i = 0; i < set1.size(); i++) {			
	       if (!set.contains(set1.get(i)))  {				
	           add(set1.get(i));							
	       }
	    }
		System.out.println(set1);
	}	
	

	public void intersect(IntegerSet setB) {
		ArrayList<Integer> set1 = set;			
		ArrayList<Integer> set2 = setB.gett();	
		set1.retainAll(set2);
	}
	
	public void diff(IntegerSet setB){
		ArrayList<Integer> set1 = set;
		ArrayList<Integer> set2 = setB.gett();
		for (int i = 0; i< set2.size();i++) {
			if (set1.contains(set2.get(i))) {
				set1.remove(set2.get(i));
			}
		}
	}
	public void complement(IntegerSet setB) {
		ArrayList<Integer> set1 = set;
		ArrayList<Integer> set2 = setB.gett();
		for (int i = 0; i< set2.size();i++) {
			if (set1.contains(set2.get(i))) {
				set1.remove(set2.get(i));
			}
		}		
	}
	public boolean isEmpty() {
		boolean empty;
		empty = (!(set.size()>0));
		return empty;
		
	}
	public String toString() {
		String setstr= "";
		for (int i = 0; i< set.size(); i++) {
			setstr = setstr.concat(String.valueOf(set.get(i)));
			if (i<set.size()-1) {
				setstr = setstr.concat(", ");
				
			}
		}
		return setstr;
		
	}
}
