package io.java.pkg;

public class TypeInterfaceEmpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// StringLengthLamda strLength=(String s) -> s.length();
		/*
		 * as type is already provided inside the interface reference ,compiler
		 * will check the type from interface declaration
		 */
		// StringLengthLamda strLength=(s) -> s.length();
		/* even parenthesis can be removed for single argument*/
		StringLengthLamda strLength = s -> s.length();
		System.out.println(strLength.getStringLength("hello lambda"));

	}

	interface StringLengthLamda {
		int getStringLength(String s);
	}

}
