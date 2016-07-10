/*
 * Author: Satit Choatnaphan
 * 
 */
package investmentcalculator.view;

import javax.swing.table.DefaultTableModel;
import investmentcalculator.controller.IInvestmentCalculatorController;
import investmentcalculator.model.MonthlyReport;
import java.awt.Dimension;

/**
 *
 * @author Kong
 */
public class InvestmentCalculatorView extends javax.swing.JFrame implements IInvestmentCalculatorView {

    private static final int RESULT_INDEX = 1;
    /**
     * Creates new form InvestmentCalculatorView
     */
    public InvestmentCalculatorView() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InvestmentCalculatorView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        initComponents();
        this.setMinimumSize(new Dimension(780, 540));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        InvestmentDetailPanel = new javax.swing.JPanel();
        startingBalanceLbl = new javax.swing.JLabel();
        annualRateLbl = new javax.swing.JLabel();
        monthlyContributionLbl = new javax.swing.JLabel();
        contributionPeriodLbl = new javax.swing.JLabel();
        calculateBtn = new javax.swing.JButton();
        annualRateOfReturnTxt = new javax.swing.JFormattedTextField();
        monthlyContributionTxt = new javax.swing.JFormattedTextField();
        contributionPeriodTxt = new javax.swing.JFormattedTextField();
        startingBalanceTxt = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        InvestmentResultPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Investment Calculator");
        setPreferredSize(new java.awt.Dimension(780, 550));

        startingBalanceLbl.setText("Starting balance ($):");

        annualRateLbl.setText("Annual rate of return (%):");

        monthlyContributionLbl.setText("Monthly contribution ($):");

        contributionPeriodLbl.setText("Contribution period (months):");

        calculateBtn.setText("Calculate");
        calculateBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                calculateBtnMouseClicked(evt);
            }
        });

        annualRateOfReturnTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        annualRateOfReturnTxt.setText("0.00");

        monthlyContributionTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        monthlyContributionTxt.setText("0.00");

        contributionPeriodTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        contributionPeriodTxt.setText("0");

        startingBalanceTxt.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        startingBalanceTxt.setText("0.00");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Assumption"));

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("1. Interest compounded monthly by added at the end of each month.\n2. Final value at the end of investment period specified by user\n- This is a total return, can be found at the last row in column \"Balance ($)\" in tab \"Result\"\n3. Total interest (compound interest)\n- Can be found at the last row in column \"Total interest ($)\" in tab \"Result\"\n4. Total contributions\n- Can be found at the last row in column \"Total Contributions ($)\" in tab \"Result\"\n5. Interest earned over time\n- This is a total interest in each month, can be found in column \"Total interest ($)\" in tab \"Result\"\n6. Contributions over time\n- This is a total contributions in each month, can be found in column \"Total Contributions ($)\" in tab \"Result\"");
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout InvestmentDetailPanelLayout = new javax.swing.GroupLayout(InvestmentDetailPanel);
        InvestmentDetailPanel.setLayout(InvestmentDetailPanelLayout);
        InvestmentDetailPanelLayout.setHorizontalGroup(
            InvestmentDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InvestmentDetailPanelLayout.createSequentialGroup()
                .addGroup(InvestmentDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(InvestmentDetailPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(calculateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, InvestmentDetailPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(InvestmentDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(InvestmentDetailPanelLayout.createSequentialGroup()
                                .addGroup(InvestmentDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(annualRateLbl)
                                    .addComponent(startingBalanceLbl)
                                    .addComponent(monthlyContributionLbl)
                                    .addComponent(contributionPeriodLbl))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(InvestmentDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(annualRateOfReturnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
                                    .addComponent(monthlyContributionTxt)
                                    .addComponent(contributionPeriodTxt)
                                    .addComponent(startingBalanceTxt))))))
                .addContainerGap())
        );
        InvestmentDetailPanelLayout.setVerticalGroup(
            InvestmentDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InvestmentDetailPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InvestmentDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startingBalanceLbl)
                    .addComponent(startingBalanceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InvestmentDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(annualRateLbl)
                    .addComponent(annualRateOfReturnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InvestmentDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(monthlyContributionLbl)
                    .addComponent(monthlyContributionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InvestmentDetailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contributionPeriodLbl)
                    .addComponent(contributionPeriodTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(calculateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Investment Detail", InvestmentDetailPanel);

        resultTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Month", "Interest ($)", "Total Contributions ($)", "Total Interest ($)", "Balance ($)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(resultTable);
        if (resultTable.getColumnModel().getColumnCount() > 0) {
            resultTable.getColumnModel().getColumn(0).setResizable(false);
            resultTable.getColumnModel().getColumn(0).setPreferredWidth(5);
            resultTable.getColumnModel().getColumn(1).setResizable(false);
            resultTable.getColumnModel().getColumn(1).setPreferredWidth(15);
            resultTable.getColumnModel().getColumn(2).setResizable(false);
            resultTable.getColumnModel().getColumn(3).setResizable(false);
            resultTable.getColumnModel().getColumn(4).setResizable(false);
        }

        javax.swing.GroupLayout InvestmentResultPanelLayout = new javax.swing.GroupLayout(InvestmentResultPanel);
        InvestmentResultPanel.setLayout(InvestmentResultPanelLayout);
        InvestmentResultPanelLayout.setHorizontalGroup(
            InvestmentResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 747, Short.MAX_VALUE)
        );
        InvestmentResultPanelLayout.setVerticalGroup(
            InvestmentResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 432, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Result", InvestmentResultPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void setInvestmentCalculator(IInvestmentCalculatorController calculator){
        investmentCalculator = calculator;
        investmentCalculator.setInvestmentCalculatorView(this);
    }
    
    private void clearTable() {
        DefaultTableModel model = (DefaultTableModel) resultTable.getModel();
        int rowCount = model.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            model.removeRow(i);
        }
    }
    
    private void calculateBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_calculateBtnMouseClicked
        if (investmentCalculator != null) {
            clearTable();
            investmentCalculator.setInvestmentInfo(startingBalanceTxt.getText(), annualRateOfReturnTxt.getText(), monthlyContributionTxt.getText(), contributionPeriodTxt.getText());
            investmentCalculator.updateInvestmentResult();
            jTabbedPane1.setSelectedIndex(RESULT_INDEX);
        }else {
            System.out.println("Error: failed to calculate investment result - investmentCalculator is null");
        }
    }//GEN-LAST:event_calculateBtnMouseClicked
   
    @Override
    public void addMonthlyReport(MonthlyReport monthlyReport) {
        DefaultTableModel model = (DefaultTableModel) resultTable.getModel();
        model.addRow(new Object[]{monthlyReport.getReportID(), 
                                  monthlyReport.getMonthInterest(), 
                                  monthlyReport.getTotalContributions(), 
                                  monthlyReport.getTotalInterest(), 
                                  monthlyReport.getBalance()});       
    }
    
    private IInvestmentCalculatorController investmentCalculator;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel InvestmentDetailPanel;
    private javax.swing.JPanel InvestmentResultPanel;
    private javax.swing.JLabel annualRateLbl;
    private javax.swing.JFormattedTextField annualRateOfReturnTxt;
    private javax.swing.JButton calculateBtn;
    private javax.swing.JLabel contributionPeriodLbl;
    private javax.swing.JFormattedTextField contributionPeriodTxt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel monthlyContributionLbl;
    private javax.swing.JFormattedTextField monthlyContributionTxt;
    private javax.swing.JTable resultTable;
    private javax.swing.JLabel startingBalanceLbl;
    private javax.swing.JFormattedTextField startingBalanceTxt;
    // End of variables declaration//GEN-END:variables

  
}
