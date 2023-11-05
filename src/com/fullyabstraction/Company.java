package com.fullyabstraction;

public class Company implements EmployeeData {

	@Override
	public void employeeName() {
		System.out.println("Employee Name is: Maha");
	}

	@Override
	public void employeeId() {
		System.out.println("Employee Id is: 8765");
	}

	@Override
	public void employeeStatus() {
		System.out.println("Employee Status is: Married");

	}

	public static void main(String[] args) {
		Company c = new Company();

		c.employeeName();
		c.employeeId();
		c.employeeStatus();

	}

}
