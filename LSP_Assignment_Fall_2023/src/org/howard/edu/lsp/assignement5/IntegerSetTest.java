package org.howard.edu.lsp.assignement5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class IntegerSetTest {

	private IntegerSet set1;
	private IntegerSet set2;

	@BeforeEach
	void creationSet() {
		set1 = new IntegerSet();
		set2 = new IntegerSet();
	}

	@Test
	@DisplayName("Test for add() method")
	void testAdd() {
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5); //set1 is [1,2,3,4,5]

		assertEquals(true, set1.contains(1)); //set1 is [1,2,3,4,5]
		assertEquals(false,set1.contains(0));
	}

	@Test
	@DisplayName("Test for remove() method")
	void testRemove() {
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5); //set1 is [1,2,3,4,5]
		assertEquals(true, set1.contains(2)); //set1 contains 2
		set1.remove(2); //set1 is [1,3,4,5]
		assertEquals(false, set1.contains(2)); 	//set1 does not contain 2
	}


	@Test
	@DisplayName("Test for clear() method")
	void testClear() {
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		set1.add(5); //set1 is [1,2,3,4,5]
		assertEquals(false,set1.length()==0); //set1 is not empty
		set1.clear(); //set1 is []
		assertEquals(true,set1.length()==0); //set1 is empty
	}


	@Test
	@DisplayName("Test for contains() method")
	void testContians(){
		set1.add(0);
		set1.add(1); //set1 is [0,1]
		assertEquals(true,set1.contains(1)); //set1 contains 1
		assertEquals(false,set1.contains(2)); //set1 does not contain 2
	}

	@Test
	@DisplayName("Test for smallest() method")
	void testSmallest() throws IntegerSetException{
		set1.add(0);
		set1.add(1);
		set1.add(2);
		set1.add(3); 	//set1 is [0,1,2,3]
		assertEquals(0,set1.smallest()); //set1.smallest() is 0
		set1.remove(0); //set1 is [1,2,3]
		assertEquals(1,set1.smallest()); //set1.smallest() is 1
	}

	@Test
	@DisplayName("Test for smallest() will throw exception")
	void testSmallestException() throws IntegerSetException{
		set1.add(0);
		set1.add(1);
		set1.add(2);
		set1.add(3); //set1 is [0,1,2,3]
		set1.clear(); //set1 is []
		assertThrows(IntegerSetException.class, () -> set1.smallest()); //set1.smallest() will throw an exception
	}

	@Test
	@DisplayName("Test for largest() method")
	void testLargest() throws IntegerSetException {
		set1.add(0);
		set1.add(1);
		set1.add(2);
		set1.add(3);  //set1 is [0,1,2,3]
		assertEquals(3,set1.largest()); //set1.largest() is 3
		set1.remove(3); //set1 is [0,1,2]
		assertEquals(2,set1.largest()); //set1.largest() is 2
	}

	@Test
	@DisplayName("Test for largest() will throw exception")
	void testLargestException() throws IntegerSetException{
		set1.add(0);
		set1.add(1);
		set1.add(2);
		set1.add(3); //set1 is [0,1,2,3]
		set1.clear(); //set1 is []
		assertThrows(IntegerSetException.class, () -> set1.largest()); //set1.largest() will throw an exception
	}

	@Test
	@DisplayName("Test for length() method")
	void testLength(){
		set1.add(0);
		set1.add(1);
		set1.add(2);
		set1.add(3); //set1 is [0,1,2,3]
		assertEquals(4,set1.length()); //set1.length() is 4
		set1.remove(3); //set1 is [0,1,2]
		assertEquals(3,set1.length()); //set1.length() is 3
	}

	@Test
	@DisplayName("Test for equals method")
	void testEquals(){
		set1.add(0);
		set1.add(1);
		set1.add(2);
		set1.add(3); //set1 is [0,1,2,3]
		set2.add(0);
		set2.add(1);
		set2.add(2);
		set2.add(3); //set2 is [0,1,2,3]
		assertEquals(true,set1.equals(set2)); //set1.equals(set2) is true
		set2.remove(3); //set2 is [0,1,2]
		assertEquals(false,set1.equals(set2)); //set1.equals(set2) is false
	}


	@Test
	@DisplayName("Test for union() method")
	void testUnion(){
		set1.add(0);
		set1.add(1);
		set1.add(2);
		set1.add(3); //set1 is [0,1,2,3]
		set2.add(3);
		set2.add(4);
		set2.add(5); //set2 is [3,4,5]
		set1.union(set2); //set1 union is [0,1,2,3,4,5]
		assertEquals(true,set1.contains(5)); //set1.union(set2) is [0,1,2,3,4,5]
		assertEquals(false,set1.contains(6)); //set1.union(set2) is [0,1,2,3,4,5]

	}


	@Test
	@DisplayName("Test for intersect() method")
	void testIntersect() {
		set1.add(0);
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set1.intersect(set2); //set1.intersect(set2) is [3]
		assertEquals(true,set1.contains(3)); //set1.intersect(set2) is [3]
		assertEquals(false,set1.contains(4));
	}

	@Test
	@DisplayName("Test for diff() method")
	void testDiff(){
		set1.add(0);
		set1.add(1);
		set1.add(2);
		set1.add(3); //set1 is [0,1,2,3]
		set2.add(3);
		set2.add(4);
		set2.add(5); //set2 is [3,4,5]
		set1.diff(set2);
		assertEquals(true,set1.contains(0)); //set1.diff(set2) is [0,1,2]
		assertEquals(false,set1.contains(3)); //set1.diff(set2) is [0,1,2]
	}


	@Test
	@DisplayName("Test for complement() method")
	void testComplement(){
		set1.add(0);
		set1.add(1);
		set1.add(2);
		set1.add(3); //set1 is [0,1,2,3]
		set2.add(0);
		set2.add(4);
		set2.add(5); //set2 is [0,4,5]
		set1.complement(set2); //set1.complement(set2) is [1,2,3]
		assertEquals(true,set1.contains(3)); //set1.complement(set2) is [1,2,3]
		assertEquals(false,set1.contains(4));
	}


	@Test
	@DisplayName("Test for isEmpty() method")
	void testIsEmpty(){
		set1.add(0);
		set1.add(1);
		set1.add(2);
		set1.add(3); //set1 is [0,1,2,3]
		assertEquals(false,set1.isEmpty()); //set1 is not empty
		set1.clear(); //set1 is []
		assertEquals(true,set1.isEmpty()); //set1 is empty

	}


	@Test
	@DisplayName("Test for toString() method")
	void testToString(){
		set1.add(0);
		set1.add(1);
		set1.add(2);
		set1.add(3);
		String exp = "0, 1, 2, 3"; //set1 is [0,1,2,3]

		assertEquals(set1.toString(),exp); //set1.toString() is "0, 1, 2, 3"
		set1.clear();
		String exp2 = ""; //set1 is []
		assertEquals(set1.toString(),exp2); //set1.toString() is ""
	}
}
