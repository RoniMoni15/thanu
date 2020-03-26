package org.abstrac;

public class Ktm implements Bike {
public void cost() {
	System.out.println("Cost of Ktm");
}
public void speed() {
	System.out.println("Speed of Ktm");
}
public static void main(String[] args) {
	Ktm k = new Ktm();
	k.cost();
	k.speed();
}
}
