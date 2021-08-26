package com.company;
import com.YearRange;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	YearRange myFirstRange = new YearRange(1314,2014);
	myFirstRange.setRangeType(1);

	YearRange mySecondRange = new YearRange(1100, 31500);
	mySecondRange.setRangeType(2);

	YearRange myThirdRange = new YearRange(1500,1890);
	myThirdRange.setRangeType(3);

	System.out.println("List of all years divisible by"+
            myFirstRange.getFirstDivisor() + "and"+
            myFirstRange.getSecondDivisor());
	myFirstRange.printYears();
        System.out.println("List of all leap years between" +
                mySecondRange.getFirstYear() + " and " +
                mySecondRange.getSecondYear());
        mySecondRange.printYears();
        System.out.println("List of all Olympic years between " +
                myThirdRange.getFirstYear() + "and" + myThirdRange.getSecondYear() +
"that are divisible by" + myThirdRange.getFirstDivisor());
        myThirdRange.printYears();
    }
    }

