package com.supplier;

import java.util.Calendar;
import java.util.function.Supplier;

public class SupplierEx implements Supplier<Object> {

	@Override
	public Object get() {
		Calendar calendar = Calendar.getInstance();
		// calendar.getTime();

		return calendar.getTime();
	}
	
	
	public static void main(String[] args) {
		SupplierEx ex=new SupplierEx();
		System.out.println(ex.get());
	}

}