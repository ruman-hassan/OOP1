package com;

public class YearRange {
    public int yearsDivisible;
    public int leapYears;
    public int olympicsDivisible;
    private int printYears;

    public YearRange(int i, int i1) {
    }


    public int getYearsDivisible() {
        return yearsDivisible;
    }

    public void setRangeType(int yearsDivisible, int leapYears, int olympicsDivisible) {
        this.yearsDivisible = yearsDivisible ;
        this.leapYears = leapYears;
        this.olympicsDivisible = olympicsDivisible;
    }
        public int  getFirstDivisor(){
        return this.yearsDivisible;
    }

    public int getSecondDivisor(){
        return this.olympicsDivisible;
        }
        public  int getFirstYear(){
        return this.leapYears;
        }
        public int getSecondYear(){
            return this.leapYears;}
        public int printYears() {
           return this.printYears;
        }

    public void setRangeType(int i) {
    }
}
