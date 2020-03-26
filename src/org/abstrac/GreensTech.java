package org.abstrac;

public class GreensTech {
	public void greensOMR() {
		System.out.println("OMR");
		}
	public void greensOMR(int a) {
		System.out.println("Anna Nagar");
		}
	public void greensOMR(char a) {
		System.out.println("Adayar");
		}
	public static void main(String[] args) {
		GreensTech g = new GreensTech();
		g.greensOMR('a');
		g.greensOMR(5);
		g.greensOMR();
	}

}
