package com.datastructures;

public class Sub extends Super {
	int x = 4;               // Shadows  Super.x
	int f() { return 4; }   // Overrides Super.f
	
	void g() {
		int i;
		i = this.x;              // 4
		i = ((Super)this).x;     // 2
		i = super.x;             // 2
		
	}

}
