/*
 * Author: Satit Choatnaphan
 * 
 */
package investmentcalculator.model;

/**
 *
 * @author Kong
 */
public class MonthlyReport {
    
    /**
     *
     * @param reportID
     * @param monthInterest
     * @param totalContributions
     * @param totalInterest
     * @param balance
     */
    public MonthlyReport(int reportID, String monthInterest, String totalContributions, String totalInterest, String balance) {
        this.reportID = reportID;
        this.monthInterest = monthInterest;
        this.totalContributions = totalContributions;
        this.totalInterest = totalInterest;
        this.balance = balance;
    }

    /**
     * @return the reportID
     */
    public int getReportID() {
        return reportID;
    }

    /**
     * @param reportID the reportID to set
     */
    public void setReportID(int reportID) {
        this.reportID = reportID;
    }

    /**
     * @return the monthInterest
     */
    public String getMonthInterest() {
        return monthInterest;
    }

    /**
     * @param monthInterest the monthInterest to set
     */
    public void setMonthInterest(String monthInterest) {
        this.monthInterest = monthInterest;
    }

    /**
     * @return the totalInterest
     */
    public String getTotalInterest() {
        return totalInterest;
    }

    /**
     * @param totalInterest the totalInterest to set
     */
    public void setTotalInterest(String totalInterest) {
        this.totalInterest = totalInterest;
    }

    /**
     * @return the totalContributions
     */
    public String getTotalContributions() {
        return totalContributions;
    }

    /**
     * @param totalContributions the totalContributions to set
     */
    public void setTotalContributions(String totalContributions) {
        this.totalContributions = totalContributions;
    }

    /**
     * @return the balance
     */
    public String getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(String balance) {
        this.balance = balance;
    }
    
    private int reportID;
    private String monthInterest;
    private String totalInterest;
    private String totalContributions;
    private String balance;
}
