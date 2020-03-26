package org.abstrac;

public class Desktop implements Hardware, Software  {
public void desktopModel() {
	System.out.println("Desktop Model");
}
public void softwareRescources() {
	System.out.println("Software Resource");
}
public void hardwareResources() {
	System.out.println("Hardware Resource");
}
public static void main(String[] args) {
	Desktop d = new Desktop();
	d.desktopModel();
	d.hardwareResources();
	d.softwareRescources();
	
}

}
