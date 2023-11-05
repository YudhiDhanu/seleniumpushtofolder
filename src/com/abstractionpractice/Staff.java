package com.abstractionpractice;

public class Staff extends StudentData {

	@Override
	public void studentPercentage() {
		System.out.println("Student Percentage is: 80");

	}

	@Override
	public void studentRank() {
		System.out.println("Student Rank is: 12");

	}

	public static void main(String[] args) {
		Staff s = new Staff();
		s.studentId();
		s.studentName();
		s.studentPercentage();
		s.studentRank();
	}

}
