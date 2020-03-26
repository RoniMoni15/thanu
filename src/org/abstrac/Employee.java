package org.abstrac;

public class Employee {
public void empId() {
	System.out.println("Employee ID");
	}
public void empId(int a) {
	System.out.println("Employee ID 2");
	}
public static void main(String[] args) {
	Employee e =  new Employee();
	e.empId();
	e.empId(5);
}

}
