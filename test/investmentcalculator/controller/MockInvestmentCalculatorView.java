/*
 * Author: Satit Choatnaphan
 * 
 */
package investmentcalculator.controller;

import investmentcalculator.model.MonthlyReport;
import investmentcalculator.view.IInvestmentCalculatorView;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kong
 */
public class MockInvestmentCalculatorView implements IInvestmentCalculatorView{

    public MockInvestmentCalculatorView() {
        this.result = new ArrayList<>();
    }
    
    public final List<MonthlyReport> result;

    @Override
    public void addMonthlyReport(MonthlyReport monthlyReport) {
        result.add(monthlyReport);
    }
}
