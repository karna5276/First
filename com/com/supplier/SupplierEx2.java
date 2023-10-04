package com.supplier;

import java.util.Calendar;
import java.util.function.Supplier;

public class SupplierEx2 {
	
	//anonumusstyle 
	public static void main(String[] args) {

		Supplier<Object> supplier = new Supplier<Object>() {

			@Override
			public Object get() {
				Calendar calendar = Calendar.getInstance();
				// calendar.getTime();

				return calendar.getTime();
			}

		};
		System.out.println(supplier.get());

	}

}