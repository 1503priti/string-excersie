package com.priti.ex;

public class RemoveSpecialCharFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "@#jkdsh!$dff%^dsad";
		String plainStr = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(plainStr);
	}

}
