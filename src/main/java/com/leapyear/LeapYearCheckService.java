package com.leapyear;

public class LeapYearCheckService {

   public boolean isLeapYear(int year){
        if(isYearDivisibleBy400(year)) return true;
        if(isYearDivisibleBy100(year) && !isYearDivisibleBy400(year)) return false;
        if(isYearDivisibleBy4(year) && !isYearDivisibleBy100(year)) return true;
        return isYearDivisibleBy4(year);
   }

   public boolean isYearDivisibleBy400(int year){
        return (year % 400 == 0);
   }

    public boolean isYearDivisibleBy100(int year){
        return (year % 100 == 0);
    }

    public boolean isYearDivisibleBy4(int year){
        return (year % 4 == 0);
    }

}
