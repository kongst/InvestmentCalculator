/*
 * Author: Satit Choatnaphan
 * 
 */
package investmentcalculator;

import investmentcalculator.controller.InvestmentCalculatorController;
import investmentcalculator.view.InvestmentCalculatorView;
import investmentcalculator.controller.IInvestmentCalculatorController;

/**
 *
 * @author Kong
 */
public class InvestmentCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
    
                IInvestmentCalculatorController calculator = new InvestmentCalculatorController();
                
                InvestmentCalculatorView investmentCalculatorView = new InvestmentCalculatorView();
                investmentCalculatorView.setVisible(true);              
                investmentCalculatorView.setInvestmentCalculator(calculator);
            }
        });
    }
    
}
