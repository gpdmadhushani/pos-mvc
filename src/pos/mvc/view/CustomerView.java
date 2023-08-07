/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pos.mvc.view;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pos.mvc.model.CustomerModel;
import pos.mvc.controller.CustomerController;

/**
 *
 * @author TOSHIBA
 */
public class CustomerView extends javax.swing.JFrame {
    private CustomerController customerController;

    /**
     * Creates new form CustomerView
     */
    public CustomerView() {
        customerController=new CustomerController();
        initComponents();
        loadAllCustomers();
    }

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basepanel = new javax.swing.JPanel();
        headerpanel = new javax.swing.JPanel();
        headerlabel = new javax.swing.JLabel();
        homepanel = new javax.swing.JPanel();
        customerTitleLabel = new javax.swing.JLabel();
        custTitletext = new javax.swing.JTextField();
        customerIdLabel = new javax.swing.JLabel();
        custIdtext = new javax.swing.JTextField();
        customerNameLabel = new javax.swing.JLabel();
        custNametext = new javax.swing.JTextField();
        customerSalaryLabel = new javax.swing.JLabel();
        custSalarytext = new javax.swing.JTextField();
        customerAddressLabel = new javax.swing.JLabel();
        custAddresstext = new javax.swing.JTextField();
        customerPostalLabel = new javax.swing.JLabel();
        custCitytext = new javax.swing.JTextField();
        customerProvinceLabel = new javax.swing.JLabel();
        custProvincetext = new javax.swing.JTextField();
        customerCityLabel = new javax.swing.JLabel();
        custPostaltext = new javax.swing.JTextField();
        customerDOBLabel1 = new javax.swing.JLabel();
        custDOBtext = new javax.swing.JTextField();
        tablepanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        customerTable = new javax.swing.JTable();
        deleteCustButton = new javax.swing.JButton();
        updateCustButton = new javax.swing.JButton();
        addCustButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(850, 650));

        basepanel.setPreferredSize(new java.awt.Dimension(800, 550));

        headerpanel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        headerpanel.setPreferredSize(new java.awt.Dimension(800, 500));

        headerlabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        headerlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerlabel.setText("Manage Customer");
        headerlabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        homepanel.setPreferredSize(new java.awt.Dimension(800, 400));

        customerTitleLabel.setText("Customer Title");

        customerIdLabel.setText("Customer Id");

        customerNameLabel.setText("Customer Name");

        customerSalaryLabel.setText("Salary");

        customerAddressLabel.setText("Address");

        customerPostalLabel.setText("Postal Code");

        customerProvinceLabel.setText("Province");

        custProvincetext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custProvincetextActionPerformed(evt);
            }
        });

        customerCityLabel.setText("City");

        customerDOBLabel1.setText("Customer DOB");

        tablepanel.setPreferredSize(new java.awt.Dimension(750, 750));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(600, 600));

        customerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        customerTable.setPreferredSize(new java.awt.Dimension(900, 900));
        customerTable.setShowGrid(false);
        customerTable.setShowVerticalLines(true);
        customerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(customerTable);

        deleteCustButton.setText("Delete Customer");
        deleteCustButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteCustButtonActionPerformed(evt);
            }
        });

        updateCustButton.setText("Update Customer");
        updateCustButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateCustButtonActionPerformed(evt);
            }
        });

        addCustButton.setText("Save Customer");
        addCustButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tablepanelLayout = new javax.swing.GroupLayout(tablepanel);
        tablepanel.setLayout(tablepanelLayout);
        tablepanelLayout.setHorizontalGroup(
            tablepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablepanelLayout.createSequentialGroup()
                .addContainerGap(342, Short.MAX_VALUE)
                .addComponent(deleteCustButton)
                .addGap(18, 18, 18)
                .addComponent(updateCustButton)
                .addGap(18, 18, 18)
                .addComponent(addCustButton, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tablepanelLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        tablepanelLayout.setVerticalGroup(
            tablepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tablepanelLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(tablepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteCustButton)
                    .addComponent(updateCustButton)
                    .addComponent(addCustButton))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(255, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout homepanelLayout = new javax.swing.GroupLayout(homepanel);
        homepanel.setLayout(homepanelLayout);
        homepanelLayout.setHorizontalGroup(
            homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homepanelLayout.createSequentialGroup()
                .addGroup(homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homepanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(homepanelLayout.createSequentialGroup()
                                .addGroup(homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, homepanelLayout.createSequentialGroup()
                                        .addComponent(customerPostalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(custPostaltext))
                                    .addGroup(homepanelLayout.createSequentialGroup()
                                        .addComponent(customerCityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(custCitytext, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(32, 32, 32)
                                .addComponent(customerProvinceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(custProvincetext, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(homepanelLayout.createSequentialGroup()
                                    .addComponent(customerAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(custAddresstext))
                                .addGroup(homepanelLayout.createSequentialGroup()
                                    .addComponent(customerDOBLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(custDOBtext, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(customerSalaryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(custSalarytext, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(homepanelLayout.createSequentialGroup()
                                    .addComponent(customerTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(custIdtext, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(homepanelLayout.createSequentialGroup()
                                            .addComponent(custTitletext, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(customerNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(custNametext, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(homepanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tablepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(homepanelLayout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(customerIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(749, Short.MAX_VALUE)))
        );
        homepanelLayout.setVerticalGroup(
            homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homepanelLayout.createSequentialGroup()
                .addGroup(homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homepanelLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(customerTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(custTitletext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customerNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(custNametext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(homepanelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(custIdtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(custSalarytext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerSalaryLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(custDOBtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerDOBLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(custAddresstext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(custCitytext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(customerProvinceLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(custProvincetext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(homepanelLayout.createSequentialGroup()
                        .addComponent(customerCityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(customerPostalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(custPostaltext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tablepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144))
            .addGroup(homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(homepanelLayout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(customerIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(790, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout headerpanelLayout = new javax.swing.GroupLayout(headerpanel);
        headerpanel.setLayout(headerpanelLayout);
        headerpanelLayout.setHorizontalGroup(
            headerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(headerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headerlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(headerpanelLayout.createSequentialGroup()
                        .addComponent(homepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 2118, Short.MAX_VALUE))))
        );
        headerpanelLayout.setVerticalGroup(
            headerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerlabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(homepanel, javax.swing.GroupLayout.PREFERRED_SIZE, 787, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout basepanelLayout = new javax.swing.GroupLayout(basepanel);
        basepanel.setLayout(basepanelLayout);
        basepanelLayout.setHorizontalGroup(
            basepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 2924, Short.MAX_VALUE)
        );
        basepanelLayout.setVerticalGroup(
            basepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(basepanel, javax.swing.GroupLayout.DEFAULT_SIZE, 2924, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(basepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(834, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void custProvincetextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custProvincetextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_custProvincetextActionPerformed

    private void addCustButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustButtonActionPerformed
        saveCustomer();
    }//GEN-LAST:event_addCustButtonActionPerformed

    private void customerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerTableMouseClicked
        searchCustomer();
    }//GEN-LAST:event_customerTableMouseClicked

    private void updateCustButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateCustButtonActionPerformed
        updateCustomer();
    }//GEN-LAST:event_updateCustButtonActionPerformed

    private void deleteCustButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteCustButtonActionPerformed
        deleteCustomer();
    }//GEN-LAST:event_deleteCustButtonActionPerformed

   

   
           
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCustButton;
    private javax.swing.JPanel basepanel;
    private javax.swing.JTextField custAddresstext;
    private javax.swing.JTextField custCitytext;
    private javax.swing.JTextField custDOBtext;
    private javax.swing.JTextField custIdtext;
    private javax.swing.JTextField custNametext;
    private javax.swing.JTextField custPostaltext;
    private javax.swing.JTextField custProvincetext;
    private javax.swing.JTextField custSalarytext;
    private javax.swing.JTextField custTitletext;
    private javax.swing.JLabel customerAddressLabel;
    private javax.swing.JLabel customerCityLabel;
    private javax.swing.JLabel customerDOBLabel1;
    private javax.swing.JLabel customerIdLabel;
    private javax.swing.JLabel customerNameLabel;
    private javax.swing.JLabel customerPostalLabel;
    private javax.swing.JLabel customerProvinceLabel;
    private javax.swing.JLabel customerSalaryLabel;
    private javax.swing.JTable customerTable;
    private javax.swing.JLabel customerTitleLabel;
    private javax.swing.JButton deleteCustButton;
    private javax.swing.JLabel headerlabel;
    private javax.swing.JPanel headerpanel;
    private javax.swing.JPanel homepanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel tablepanel;
    private javax.swing.JButton updateCustButton;
    // End of variables declaration//GEN-END:variables

private void saveCustomer(){
    CustomerModel customer=new CustomerModel(custIdtext.getText(), custTitletext.getText(), custNametext.getText(),custDOBtext.getText(), Double.parseDouble(custSalarytext.getText()),custAddresstext.getText(), custCitytext.getText(),custProvincetext.getText(),custPostaltext.getText());
    
        try {
            String response= customerController.saveCustomer(customer);
            JOptionPane.showMessageDialog(this, response);
             loadAllCustomers();
            clear();
            
        } catch (SQLException ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
        JOptionPane.showMessageDialog(this, ex.getMessage());
        
        }
}
private void clear(){
    custIdtext.setText("");
    custTitletext.setText("");
    custNametext.setText("");
    custDOBtext.setText("");
    custSalarytext.setText("");
    custAddresstext.setText("");
    custCitytext.setText("");
    custProvincetext.setText("");
    custPostaltext.setText("");
    
    
}
private void loadAllCustomers(){
        try {
            String[] Columns={"Id","Name","Address","Salary","Postal code"};
            DefaultTableModel dtm=new DefaultTableModel(Columns,0){
                
                public boolean isCellEditable(int row,int column){
                    return false;
                }
                
            };
            
            customerTable.setModel(dtm);
            
            ArrayList<CustomerModel> customers=customerController.getAllCustomers();
            
            for(CustomerModel customer :customers){
                Object[] rowData={customer.getCustId(),customer.getTitle()+" "+customer.getName(),customer.getAddress()+", "+customer.getCity(),customer.getSalary(),customer.getZip()};
                dtm.addRow(rowData);
            }  } catch (SQLException ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
        }
}
private void searchCustomer() {
        try {
            String custId=customerTable.getValueAt(customerTable.getSelectedRow(), 0).toString();
            CustomerModel customerModel=customerController.getCustomer(custId);
            
            if(customerModel!=null){
                
               custIdtext.setText(customerModel.getCustId());
    custTitletext.setText(customerModel.getTitle());
    custNametext.setText(customerModel.getName());
    custDOBtext.setText(customerModel.getDob());
    custSalarytext.setText(Double.toString(customerModel.getSalary()));
    custAddresstext.setText(customerModel.getAddress());
    custCitytext.setText(customerModel.getCity());
    custProvincetext.setText(customerModel.getProvince());
    custPostaltext.setText(customerModel.getZip());  
                
                
                }else{
                
                JOptionPane.showMessageDialog(this,"Customer Not Found");
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    
}

public void updateCustomer(){
    
        try {
            CustomerModel customer=new CustomerModel(custIdtext.getText(),
                    custTitletext.getText(),
                    custNametext.getText(),
                    custDOBtext.getText(),
                    Double.parseDouble(custSalarytext.getText()),
                    custAddresstext.getText(),
                    custCitytext.getText(),
                    custProvincetext.getText(),
                    custPostaltext.getText());
           String resp= customerController.updateCustomer(customer);
           
            JOptionPane.showMessageDialog(this, resp);
             loadAllCustomers();
            
            clear();
           
           
        } catch (SQLException ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
}

private void deleteCustomer(){
        try {
            String custId=custIdtext.getText();
            String resp= customerController.deleteCustomer(custId);
            
            JOptionPane.showMessageDialog(this, resp);
            clear();
            loadAllCustomers();
        } catch (SQLException ex) {
            Logger.getLogger(CustomerView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    
    
}

}
