package com._28min.setcollection;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) throws Exception{
		Set<String> sdata = Set.of("hey", "haii", "heythere", "welcome");
		
		System.out.println(sdata);
		Set<String> hashData = new HashSet<String>(sdata);
		hashData.add("bb");
		System.out.println(hashData);
		hashData.add("haillli");
		System.out.println(hashData );
		//System.out.println(hashData.);
		
	} 
}
