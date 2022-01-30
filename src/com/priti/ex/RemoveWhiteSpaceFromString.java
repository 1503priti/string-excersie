package com.priti.ex;

public class RemoveWhiteSpaceFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "   ssd  fgjkfdl  dfkj fgfd  ";
		String trimStr = str.trim(); // Returns a string whose value is this string, with any leading and
										// trailingwhitespace removed.
		System.out.println(trimStr);
		String plainStr = str.replaceAll("\\s", "");
		System.out.println(plainStr);
	}

}
