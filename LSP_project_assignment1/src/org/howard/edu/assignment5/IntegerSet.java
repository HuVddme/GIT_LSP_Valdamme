package org.howard.edu.assignment5;


import java.util.ArrayList;
import java.util.List;

public class IntegerSet {

    private List<Integer> elements;

    public IntegerSet() {
        elements = new ArrayList<Integer>();
    }

    public void clear() {
        elements.clear();
    }

    public int length() {
        return elements.size();
    }

    public boolean equals(IntegerSet otherSet) {
        if (elements.size() != otherSet.length()) {
            return false;
        }
        for (int item : otherSet.elements) {
            if (!elements.contains(item)) {
                return false;
            }
        }
        return true;
    }

    public boolean contains(int value) {
        return elements.contains(value);
    }

    public int largest() throws IntegerSetException {
        if (isEmpty()) {
            throw new IntegerSetException("Set is empty");
        }
        int largest = elements.get(0);
        for (int element : elements) {
            if (element > largest) {
                largest = element;
            }
        }
        return largest;
    }

    public int smallest() throws IntegerSetException {
        if (isEmpty()) {
            throw new IntegerSetException("Set is empty");
        }
        int smallest = elements.get(0);
        for (int element : elements) {
            if (element < smallest) {
                smallest = element;
            }
        }
        return smallest;
    }

    public void add(int item) {
        if (!contains(item)) {
            elements.add(item);
        }
    }

    public void remove(int item) {
        elements.remove(Integer.valueOf(item));
    }

    public void union(IntegerSet otherSet) {
        for (int item : otherSet.elements) {
            if (!elements.contains(item)) {
                elements.add(item);
            }
        }
    }

    public void intersect(IntegerSet otherSet) {
        elements.retainAll(otherSet.elements);
    }

    public void diff(IntegerSet otherSet) {
        elements.removeAll(otherSet.elements);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        for (int i = 0; i < elements.size(); i++) {
            sb.append(elements.get(i));
            if (i != elements.size() - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        return sb.toString();
    }

	public void complement(IntegerSet set2) {
		// TODO Auto-generated method stub
		
	}
}
