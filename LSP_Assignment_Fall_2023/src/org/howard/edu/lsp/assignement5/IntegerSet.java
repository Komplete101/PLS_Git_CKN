package org.howard.edu.lsp.assignement5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
/**
 * Integer set submission
 * @author Kyle Nwosu
 * @version 10/16/2026
 * 
 */
public class IntegerSet  {
	private ArrayList<Integer> set = new ArrayList<Integer>();
	/**
	 * 
	 * @return returns set to be used
	 */
	public ArrayList<Integer> gett(){
		return this.set;
	}
	/**
	 * Adds item to set
	 * @param item value to be added
	 */
	public void add(int item) {
		if (!set.contains(item)) {
			set.add(item);	
		}
	};
	/**
	 * Removes item from set
	 * @param value value to be removed
	 */
	public void remove(int value) { 
		if (set.contains(value)) {
			 set.remove(Integer.valueOf(value));
		}
	}
	/**
	 *Clears all items from set
	 */
 	public void clear() {
		set.clear();
	};
	/**
	 * Checks if value is present in set
	 * @param value value checking for
	 * @return Returns bool
	 */
	public boolean contains(int value) {
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
	/**
	 * Returns the smallest value in set
	 * @return the smalllest value
	 * @throws IntegerSetException Exception if set to small
	 */
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
	/**
	 *Returns the largest value in set
	 * @return the largest value
	 * @throws IntegerSetException Exception if set to small
	 */
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
	/**
	 * Returns length of set

	 * @return The size of set
	 */
	public int length() {
		return set.size();
	};
	/**
	 * Returns a boolean if sets are equal
	 * @param setB Set being compared
	 * @return returns bool
	 */
	public boolean equals(IntegerSet setB) {
		ArrayList<Integer> set1 = setB.gett();
		if(set.containsAll(set1) && set1.containsAll(set)) {		
			return true;		}	
		else {
			return false;
	}
}
	/**
	 * Combines the sets with no duplicates
	 * @param setB Set being combined
	 */
	public void union(IntegerSet setB) {
		ArrayList<Integer> set1 = setB.gett();			
	    for (int i = 0; i < set1.size(); i++) {			
	       if (!set.contains(set1.get(i)))  {				
	           add(set1.get(i));							
	       }
	    }
		System.out.println(set1);
	}	
	/**
	 * Returns what is shared between sets
	 * @param setB Sett beign checked
	 */

	public void intersect(IntegerSet setB) {
		ArrayList<Integer> set1 = set;			
		ArrayList<Integer> set2 = setB.gett();	
		set1.retainAll(set2);
	}
	/**
	 * Subtracts all items that are present in one set from another set
	 * @param setB set being subtracted from
	 */
	public void diff(IntegerSet setB){
		ArrayList<Integer> set1 = set;
		ArrayList<Integer> set2 = setB.gett();
		for (int i = 0; i< set2.size();i++) {
			if (set1.contains(set2.get(i))) {
				set1.remove(set2.get(i));
			}
		}
	}
	
	/**
	 * Returns items the subset doesn't have but the set does
	 * @param setB Subset
	 */
	public void complement(IntegerSet setB) {
		ArrayList<Integer> set1 = set;
		ArrayList<Integer> set2 = setB.gett();
		for (int i = 0; i< set2.size();i++) {
			if (set1.contains(set2.get(i))) {
				set1.remove(set2.get(i));
			}
		}		
	}
	
	/**
	 * Returns if the set is empty
	 * @return Return bool if empty or not
	 */
	
	public boolean isEmpty() {
		boolean empty;
		empty = (!(set.size()>0));
		return empty;
	}
	
	/**
	 * Converts the set to string
	 */
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
