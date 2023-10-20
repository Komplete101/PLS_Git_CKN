package org.howard.edu.lsp.Midterm.problem2;

public class Driver {

	public static void main(String[] args) {
		Range range1 = new Range(5, 10);
		Range range2 = new Range(8, 15);
		int testValue = 7;
		System.out.println("is "+ testValue + " in range1? " + range1.isInRange(testValue));
		System.out.println("DO range1 and range2 overlap? " + range1.isOverlap(range2));
		System.out.println("The size of range1 is " + range1.size());

	}

}
