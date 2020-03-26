package org.abstrac;

public class CompanyInfo {
public void companyName() {
	System.out.println("Company Name : ABC");
}
public void companyName(int a) {
	System.out.println("Company Name : 123");
}
public void companyName(int a, int b) {
	System.out.println("Company Name : Joul");
}
public void companyName(String a, double b) {
	System.out.println("Company Name : Roni 28.12");
}
public static void main(String[] args) {
	CompanyInfo ci = new CompanyInfo();
	ci.companyName();
	ci.companyName(5);
	ci.companyName(14, 1992);
	ci.companyName("Roni", 28.12);
	}
}
