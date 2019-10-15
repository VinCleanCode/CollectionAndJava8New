package com.rp.lib.notice;

import java.util.*;

public class NullHandlingExample {

	public static void testStingValue() {
		HashMap<?,?> testMap = new HashMap();
		System.out.println("Begin");
		System.out.println(testMap.get("key"));
		System.out.println("End");

		try {
			String value = (String) testMap.get("key");
			System.out.println(value);
			System.out.println(value.equals("null"));
			System.out.println(value.equals(null));
			System.out.println(value.length());
		} catch (Exception e) {
			e.printStackTrace();
		}

		String stringValue =String.valueOf(testMap.get("key"));
		System.out.println(stringValue);
		System.out.println(stringValue.length());
		System.out.println(stringValue.equals("null"));
		System.out.println(stringValue.equals(null));
	}

	public static void main(String[] args) {
		testStingValue();
	}
}
