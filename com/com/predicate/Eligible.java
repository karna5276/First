package com.predicate;

import java.util.function.Predicate;

public class Eligible {

	public static void main(String[] args) {
		
		// boolean value go for predicate

		Predicate<Integer> eligible1 = (age) -> age >= 18;

		

		System.out.println(eligible1.test(20));
	}

}