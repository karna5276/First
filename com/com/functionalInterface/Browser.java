package com.functionalInterface;

@FunctionalInterface

public abstract interface Browser {

	void Media();

	// I Want add one more method but functional intrface is not allow

	default void Music() {
		System.out.println("listen");
	}

}
