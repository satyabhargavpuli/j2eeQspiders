package com.in28min.functionalProgramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;


class EvenNumberPredicate implements Predicate<Integer>{

	@Override
	public boolean test(Integer t) {
		return t%2==0;
	}
	 
}

class PrintConsumer implements Consumer<Integer>{

	@Override
	public void accept(Integer number) {
System.out.println(number);		
	}
}

class MulFun implements Function<Integer,Integer> {

	@Override
	public Integer apply(Integer t) {

		return t*t;
	}
	
}
public class LamdaBehindTheScreens {

	public static void main(String[] args) {
		List.of(22, 43, 34, 45, 36, 48)
		.stream().filter(new EvenNumberPredicate()).map(new MulFun())
		.forEach(new PrintConsumer());
	
	
		List.of(22, 43, 34, 45, 36, 48).
		stream()
		.filter(n -> n%2 == 0).map(n -> n*n)
		.forEach(s -> System.out.println(s));
         	
	}
}
