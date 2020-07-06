package com.in28min.Generics;

import java.util.ArrayList;
import java.util.List;

public class GenericRunner {
	
	// any type<G>  G means return type  and develop is method name (G  value) is passing arg
	static <G> G  develop(G value) {
		
		return value;
	}
	
	static <G extends List> void duplicate(G list) {
		list.size();
	}
	public static void main(String[] args) {
		    GenericEg<Integer> genericEg = new GenericEg<>();
		    genericEg.addElement(8);
		    genericEg.addElement(12);
		    System.out.println(genericEg);
		    genericEg.removeElement(5);
		    System.out.println(genericEg);
           Integer value = genericEg.get(0);
		    System.out.println(value);
		    Integer develops = develop(4);
		    System.out.println("///"+develops);
		     String developk = develop("hello");
		     System.out.println(developk);
		     ArrayList<Integer> arrayList = new ArrayList<>(List.of(14, 16));
		     duplicate(arrayList);
		     System.out.println(arrayList);
		    
		    GenericEg<Integer> genericEg1 = new GenericEg<>();
		    genericEg1.addElement(Integer.valueOf(12));
		    System.out.println(genericEg1);
		    Integer valuez = genericEg1.get(0);
		    System.out.println(valuez);
		    
	}

}
