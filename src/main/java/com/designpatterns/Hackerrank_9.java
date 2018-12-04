package com.designpatterns;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Hackerrank_9 {


	public static void main(String[] args) throws ParseException {
		String time = "07:05:45PM";

		String s = timeConversion(time);
		System.out.println(s);


	}

	static private String timeConversion(String time) throws ParseException {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ssa");
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("HH:mm:ss");

		Date parse = simpleDateFormat.parse(time);

		return simpleDateFormat2.format(parse);
	}
}
