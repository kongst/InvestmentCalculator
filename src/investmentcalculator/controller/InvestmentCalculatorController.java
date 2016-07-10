/*
 * Author: Satit Choatnaphan
 * 
 */
package investmentcalculator.controller;

import investmentcalculator.model.InvestmentItem;
import investmentcalculator.model.MonthlyReport;
import investmentcalculator.view.IInvestmentCalculatorView;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Kong
 */
public class InvestmentCalculatorController implements IInvestmentCalculatorController{

    private static final int SCALE = 2;
    private static final RoundingMode ROUNDING_MODE = RoundingMode.HALF_UP;
    
    @Override
    public void setInvestmentInfo(String startingBalance, String annualRateReturn, String monthlyContribution, String contributionPeriod) {
        this.investmentItem = new InvestmentItem(startingBalance, 
                                                 annualRateReturn, 
                                                 monthlyContribution, 
                                                 contributionPeriod);
    }
    
    @Override
    public void setInvestmentCalculatorView(IInvestmentCalculatorView investmentCalculatorView) {
        this.investmentCalculatorView = investmentCalculatorView;
    }

    @Override
    public void updateInvestmentResult() {

        if (investmentItem != null && investmentCalculatorView != null) {
            BigDecimal totalInterest = new BigDecimal(0);
            BigDecimal totalContributions = investmentItem.getStartingBalance();
            BigDecimal balance = investmentItem.getStartingBalance();

            for (int i = 1; i <= investmentItem.getContributionPeriod(); i++) {
                balance = balance.add(investmentItem.getMonthlyContribution());
                BigDecimal interest = calculateInterestPerMonth(balance, investmentItem.getMonthlyRateReturn());
                balance = balance.add(interest);
                totalInterest = totalInterest.add(interest);
                totalContributions = totalContributions.add(investmentItem.getMonthlyContribution());

                MonthlyReport monthlyReport = new MonthlyReport(i, interest.setScale(SCALE, ROUNDING_MODE).toPlainString(),
                                                                   totalContributions.setScale(SCALE, ROUNDING_MODE).toPlainString(),
                                                                   totalInterest.setScale(SCALE, ROUNDING_MODE).toPlainString(),
                                                                   balance.setScale(SCALE, ROUNDING_MODE).toPlainString());
                
                investmentCalculatorView.addMonthlyReport(monthlyReport);
            }
        } else {
            System.out.println("Error: failed to update investment result - invesetmentItem or investmentCalculatorView is null");
        }
    }
     
    // interest = (P * R * 1)
    private BigDecimal calculateInterestPerMonth (BigDecimal principle, BigDecimal rate) {
        BigDecimal interest = principle.multiply(rate);
        
        return interest;
    }
    
    private InvestmentItem investmentItem;
    private IInvestmentCalculatorView investmentCalculatorView;    
}
