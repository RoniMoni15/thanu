package org.abstrac;

public class College extends University {
public void ug() {
	System.out.println("UG in College");
	}
public void pg() {
	System.out.println("PG in College");
	}
public static void main(String[] args) {
	College c = new College();
	c.ug();
	c.pg();
}
}
