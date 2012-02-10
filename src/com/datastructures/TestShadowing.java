package com.datastructures;

public class TestShadowing {

	/**
	 * Choice of methods dictated by dynamic type
	 * Choice of fields dictated by static type
	 */
	public static void main(String[] args) {
		Sub sub = new Sub();
		Super supe = sub;
		
		int i;
		
		i = supe.x;
		System.out.println("sup.x is " + i);
		
		i = sub.x;
		System.out.println("sub.x is " + i);
		
		i = ((Super) sub).x;
		System.out.println("((Super) sub).x is " + i);
		
		i = ((Sub) supe).x;
		System.out.println( "((Sub) supe).x is " + i);

		
		System.out.println("With function:");
		i = supe.f();
		System.out.println("sup.x is " + i);
		
		i = sub.f();
		System.out.println("sub.x is " + i);
		
		i = ((Super) sub).f();
		System.out.println("((Super) sub).x is " + i);
		
		i = ((Sub) supe).f();
		System.out.println( "((Sub) supe).x is " + i);
	}

}
