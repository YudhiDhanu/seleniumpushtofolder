package com.abstractionpractice;

public abstract class StudentData {

	// Non Abstraction Method
	public void studentId() {
		System.out.println("Student ID is: 4321");
	}

	public void studentName() {
		System.out.println("Student Name is: Deva");
	}
	// Abstraction method

	public abstract void studentPercentage();

	public abstract void studentRank();

}
