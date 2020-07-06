package com.in28min.Generics;

import java.util.ArrayList;

public class GenericEg<G extends Number> {
	
	ArrayList<G> list = new ArrayList<>();
	
	public void addElement(G element) {
		list.add(element);
	}
	public void removeElement(G element) {
		list.remove(element);
	}
	@Override
	public String toString() {
		return "GenericEg [list=" + list + "]";
	}
	public G get(int index) {
		// TODO Auto-generated method stub
		return list.get(index);
	}
	
}
