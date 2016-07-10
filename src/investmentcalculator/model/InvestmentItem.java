/*
 * Author: Satit Choatnaphan
 * 
 */
package investmentcalculator.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Kong
 */
public class InvestmentItem {

    public InvestmentItem(String startingBalance, String annualRateReturn, String monthlyContribution, String contributionPeriod) {
        this.startingBalance = new BigDecimal(startingBalance);
        this.annualRateReturn = new BigDecimal(annualRateReturn).divide(new BigDecimal(100), 24, RoundingMode.HALF_UP);
        this.monthlyRateReturn = this.annualRateReturn.divide(new BigDecimal(12), 24, RoundingMode.HALF_UP);
        this.monthlyContribution = new BigDecimal(monthlyContribution);
        this.contributionPeriod = Integer.valueOf(contributionPeriod);
    }
    
    /**
     * @return the startingBalance
     */
    public BigDecimal getStartingBalance() {
        return startingBalance;
    }

    /**
     * @param startingBalance the startingBalance to set
     */
    public void setStartingBalance(BigDecimal startingBalance) {
        this.startingBalance = startingBalance;
    }

    /**
     * @return the annualRateReturn
     */
    public BigDecimal getAnnualRateReturn() {
        return annualRateReturn;
    }

    /**
     * @param annualRateReturn the annualRateReturn to set
     */
    public void setAnnualRateReturn(BigDecimal annualRateReturn) {
        this.annualRateReturn = annualRateReturn;
    }

    /**
     * @return the monthlyContribution
     */
    public BigDecimal getMonthlyContribution() {
        return monthlyContribution;
    }

    /**
     * @param monthlyContribution the monthlyContribution to set
     */
    public void setMonthlyContribution(BigDecimal monthlyContribution) {
        this.monthlyContribution = monthlyContribution;
    }

    /**
     * @return the contributionPeriod
     */
    public int getContributionPeriod() {
        return contributionPeriod;
    }

    /**
     * @param contributionPeriod the contributionPeriod to set
     */
    public void setContributionPeriod(int contributionPeriod) {
        this.contributionPeriod = contributionPeriod;
    }

    /**
     * @return the monthlyRateReturn
     */
    public BigDecimal getMonthlyRateReturn() {
        return monthlyRateReturn;
    }

    /**
     * @param monthlyRateReturn the monthlyRateReturn to set
     */
    public void setMonthlyRateReturn(BigDecimal monthlyRateReturn) {
        this.monthlyRateReturn = monthlyRateReturn;
    }
    
    private BigDecimal startingBalance; // how much money do we start with
    private BigDecimal annualRateReturn; // interest rate per year
    private BigDecimal monthlyRateReturn; // interest rate per month
    private BigDecimal monthlyContribution; // how much the user will invest each month
    private int contributionPeriod; // how much money do we start with
}
