package com.leapyear;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LeapYearCheckServiceTest {
    private LeapYearCheckService leapYearCheckService;

    @Before
    public void init(){
        leapYearCheckService = new LeapYearCheckService();
    }

    @Test
    public void returnTrueIfYearIsLeapYear(){
        Assert.assertTrue(leapYearCheckService.isLeapYear(2000));
        Assert.assertTrue(leapYearCheckService.isLeapYear(2008));
    }

    @Test
    public void returnFalseIfYearIsNotLeapYear(){
        Assert.assertFalse(leapYearCheckService.isLeapYear(2100));
        Assert.assertFalse(leapYearCheckService.isLeapYear(2017));
    }

    @Test
    public void returnTrueIfYearDivisibleBy100(){
        Assert.assertTrue(leapYearCheckService.isYearDivisibleBy100(1800));
    }

    @Test
    public void returnFalseIfYearNotDivisibleBy100(){
        Assert.assertFalse(leapYearCheckService.isYearDivisibleBy100(1801));
    }

    @Test
    public void returnTrueIfYearDivisibleBy400(){
        Assert.assertTrue(leapYearCheckService.isYearDivisibleBy400(2000));
    }

    @Test
    public void returnFalseIfYearNotDivisibleBy400(){
        Assert.assertFalse(leapYearCheckService.isYearDivisibleBy400(1800));
    }

    @Test
    public void returnTrueIfYearDivisibleBy4(){
        Assert.assertTrue(leapYearCheckService.isYearDivisibleBy4(1600));
    }

    @Test
    public void returnFalseIfYearNotDivisibleBy4(){
        Assert.assertFalse(leapYearCheckService.isYearDivisibleBy4(1301));
    }
}
