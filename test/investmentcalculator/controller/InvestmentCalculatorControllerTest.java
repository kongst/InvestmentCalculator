/*
 * Author: Satit Choatnaphan
 * 
 */
package investmentcalculator.controller;

import investmentcalculator.view.IInvestmentCalculatorView;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kong
 */
public class InvestmentCalculatorControllerTest {
    
    public InvestmentCalculatorControllerTest() {
    }
 

    /**
     * Test of Investment Calculator 
     */
    @Test
    public void testInvestmentCalculator() {
        System.out.println("setInvestmentInfo");
        String startingBalance = "1000";
        String annualRateReturn = "12.00";
        String monthlyContribution = "10";
        String contributionPeriod = "12";
        InvestmentCalculatorController instance = new InvestmentCalculatorController();
        MockInvestmentCalculatorView mockView = new MockInvestmentCalculatorView();
        instance.setInvestmentInfo(startingBalance, annualRateReturn, monthlyContribution, contributionPeriod);
        instance.setInvestmentCalculatorView(mockView);
        instance.updateInvestmentResult();
        
        assertEquals(mockView.result.size(), 12);
        
        // Test first record
        assertEquals(mockView.result.get(0).getReportID(), 1);
        assertEquals(mockView.result.get(0).getBalance(), "1020.10");
        assertEquals(mockView.result.get(0).getMonthInterest(), "10.10");
        assertEquals(mockView.result.get(0).getTotalContributions(), "1010.00");
        assertEquals(mockView.result.get(0).getTotalInterest(), "10.10");
        
        // Test middle record
        assertEquals(mockView.result.get(5).getReportID(), 6);
        assertEquals(mockView.result.get(5).getBalance(), "1123.66");
        assertEquals(mockView.result.get(5).getMonthInterest(), "11.13");
        assertEquals(mockView.result.get(5).getTotalContributions(), "1060.00");
        assertEquals(mockView.result.get(5).getTotalInterest(), "63.66");
        
        // Test last record
        assertEquals(mockView.result.get(11).getReportID(), 12);
        assertEquals(mockView.result.get(11).getBalance(), "1254.92");
        assertEquals(mockView.result.get(11).getMonthInterest(), "12.42");
        assertEquals(mockView.result.get(11).getTotalContributions(), "1120.00");
        assertEquals(mockView.result.get(11).getTotalInterest(), "134.92");
    }
}
