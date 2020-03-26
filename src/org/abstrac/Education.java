package org.abstrac;

public class Education extends Arts {
public void ug() {
	System.out.println("under graduation");
	
}
public void pg() {
	System.out.println("post graduation");
}
public static void main(String[] args) {
	Education e = new Education();
	e.bA();
	e.bBA();
	e.bEd();
	e.bSc();
	e.ug();
	e.pg();
}
	

}
