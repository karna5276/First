package com.consumer;

import java.util.function.Consumer;

public class ConsumerEx {

	

	public void Lambda() {
		
		Consumer<String>conusmer1=(input)->System.out.println(input);
		conusmer1.accept("Vannakkam");
	}

	/*
	 * // Type 1: we can implements consumer interface direclty called method accpet
	 * public class ConsumerEx implements Consumer<String> {
	 * 
	 * @Override public void accept(String input) { System.out.println(input);
	 * 
	 * }
	 */
	public static void main(String[] args) {
		ConsumerEx ex = new ConsumerEx();
		ex.Lambda();

	}

}