package com.blogging.stringBufferBuilder;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder s = new StringBuilder("Rachel and Ross were on break");
		s.replace(7, 20, "alone was");//StringBuilder is mutable
		System.out.println(s);
		
		StringBuffer b = new StringBuffer("Chandler loved Monica");
		b.append(" Geller");
		System.out.println(b);//StringBuffer is mutable
		
		

	}

}
