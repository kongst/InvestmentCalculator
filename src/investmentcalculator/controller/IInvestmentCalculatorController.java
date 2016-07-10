/*
 * Author: Satit Choatnaphan
 * 
 */
package investmentcalculator.controller;

import investmentcalculator.view.IInvestmentCalculatorView;

/**
 *
 * @author Kong
 */
public interface IInvestmentCalculatorController {
    void setInvestmentInfo(String startingBalance, String annualRateReturn, String monthlyContribution, String contributionPeriod);
    void setInvestmentCalculatorView(IInvestmentCalculatorView investmentCalculatorView);
    void updateInvestmentResult();
}
