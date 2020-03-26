package org.abstrac;

public class AxisBank extends BankInfo {
	public void deposite() {
		System.out.println("deposit Amount in Axis");
			}
public static void main(String[] args) {
	AxisBank ax = new AxisBank();
	ax.fixed();
	ax.saving();
	ax.deposite();
}
}
