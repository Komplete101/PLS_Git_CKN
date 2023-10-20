package org.howard.edu.lsp.Midterm.problem2;

public class Range {
	private int beginning;
	private int end;
	public Range(int beginning, int end) {
		this.beginning = beginning;
		this.end = end;
	}
		public boolean isInRange(int value) {
			if (value >= beginning && value <= end) {
				return true;
			}
			else {
				return false;
			}
		}
		public boolean isOverlap(Range range) {
			if (range.beginning >= beginning && range.beginning <= end) {
				return true;
			}
			else if (range.end >= beginning && range.end <= end) {
				return true;
			}
			else {
				return false;
			}
		}
		public int size() {
			return end - beginning+1;
		}

	}
