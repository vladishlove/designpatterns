package com.designpatterns;

public class Hackerrank_17 {

	public static void main(String[] args) {
		System.out.println(dayOfProgrammer(1918));
	}

	static String dayOfProgrammer(int year) {
		int yearSum = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
		int leapYearSum = yearSum + 1;
		int year18Sum = yearSum - 13;
		boolean is18Year = year == 1918;
		boolean isLeapYear = leapYear(year);

		int septemberDay;

		if (isLeapYear) {
			septemberDay = 256 - leapYearSum;
		} else if (is18Year) {
			septemberDay = 256 - year18Sum;
		} else {
			septemberDay = 256 - yearSum;
		}

		return septemberDay + "." + "09." + year;
	}

	private static boolean leapYear(int year) {
		if (year > 1918) {
			if (year % 400 == 0) {
				return true;
			} else return year % 4 == 0 && year % 100 != 0;
		} else return year % 4 == 0;
	}
}
