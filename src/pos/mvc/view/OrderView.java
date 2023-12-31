/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pos.mvc.view;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pos.mvc.controller.CustomerController;
import pos.mvc.controller.ItemController;
import pos.mvc.controller.OrderController;
import pos.mvc.model.CustomerModel;
import pos.mvc.model.ItemModel;
import pos.mvc.model.OrderDetailModel;
import pos.mvc.model.OrderModel;

/**
 *
 * @author TOSHIBA
 */
public class OrderView extends javax.swing.JFrame {

    private CustomerController customerController;
    
     private ItemController itemController;
     private OrderController orderController;
     
     ArrayList<OrderDetailModel> orderDetailModel=new ArrayList<>();
    public OrderView() {
        customerController=new CustomerController();
        itemController=new ItemController();
        orderController=new OrderController();
       
        initComponents();
        
         loadTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        basepanel = new javax.swing.JPanel();
        headerpanel = new javax.swing.JPanel();
        headerlabel = new javax.swing.JLabel();
        homepanel = new javax.swing.JPanel();
        customerLabel = new javax.swing.JLabel();
        customertext = new javax.swing.JTextField();
        orderIdLabel = new javax.swing.JLabel();
        orderIdtext = new javax.swing.JTextField();
        tablepanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemsTable = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        itemIdLabel = new javax.swing.JLabel();
        quentitytext = new javax.swing.JTextField();
        searchitemButton = new javax.swing.JButton();
        itemdetailsLabel = new javax.swing.JLabel();
        quentityIdLabel = new javax.swing.JLabel();
        itemIdtext1 = new javax.swing.JTextField();
        discountLabel = new javax.swing.JLabel();
        discounttext = new javax.swing.JTextField();
        addItemButton = new javax.swing.JButton();
        searchButton = new javax.swing.JButton();
        custdetails = new javax.swing.JLabel();
        placeOrdereButton = new javax.swing.JButton();
        totalLabel = new javax.swing.JLabel();
        totalTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        basepanel.setPreferredSize(new java.awt.Dimension(800, 900));

        headerpanel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        headerpanel.setPreferredSize(new java.awt.Dimension(800, 500));

        headerlabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        headerlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerlabel.setText(" Order");
        headerlabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        homepanel.setPreferredSize(new java.awt.Dimension(800, 400));

        customerLabel.setText("Customer");

        orderIdLabel.setText("Order Id");

        tablepanel.setPreferredSize(new java.awt.Dimension(800, 750));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(600, 600));

        itemsTable.setModel(new javax.swing.table.DefaultTableModel(
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
        itemsTable.setPreferredSize(new java.awt.Dimension(900, 900));
        itemsTable.setShowGrid(false);
        itemsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                itemsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(itemsTable);

        itemIdLabel.setText("Item Id");

        searchitemButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchitemButton.setText("Search");
        searchitemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchitemButtonActionPerformed(evt);
            }
        });

        quentityIdLabel.setText("QTY");

        discountLabel.setText("Discount");

        addItemButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addItemButton.setText("Add Item");
        addItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tablepanelLayout = new javax.swing.GroupLayout(tablepanel);
        tablepanel.setLayout(tablepanelLayout);
        tablepanelLayout.setHorizontalGroup(
            tablepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tablepanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(tablepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tablepanelLayout.createSequentialGroup()
                        .addComponent(quentityIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(quentitytext, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(tablepanelLayout.createSequentialGroup()
                        .addGroup(tablepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tablepanelLayout.createSequentialGroup()
                                .addComponent(discountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(discounttext, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(addItemButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(tablepanelLayout.createSequentialGroup()
                                .addComponent(itemIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(itemIdtext1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(searchitemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(itemdetailsLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(tablepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tablepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 729, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 812, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        tablepanelLayout.setVerticalGroup(
            tablepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tablepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(tablepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(itemIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchitemButton)
                    .addComponent(itemdetailsLabel)
                    .addComponent(itemIdtext1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tablepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quentityIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quentitytext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tablepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(discountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(discounttext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addItemButton))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(386, Short.MAX_VALUE))
        );

        searchButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout homepanelLayout = new javax.swing.GroupLayout(homepanel);
        homepanel.setLayout(homepanelLayout);
        homepanelLayout.setHorizontalGroup(
            homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homepanelLayout.createSequentialGroup()
                .addGroup(homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homepanelLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(customerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(orderIdtext, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(customertext))
                        .addGap(18, 18, 18)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(custdetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(homepanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tablepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(homepanelLayout.createSequentialGroup()
                    .addGap(24, 24, 24)
                    .addComponent(orderIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(749, Short.MAX_VALUE)))
        );
        homepanelLayout.setVerticalGroup(
            homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homepanelLayout.createSequentialGroup()
                .addGroup(homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(homepanelLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(customerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customertext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchButton)))
                    .addGroup(homepanelLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(orderIdtext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(custdetails, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tablepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
            .addGroup(homepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(homepanelLayout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(orderIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                        .addGap(0, 0, Short.MAX_VALUE))))
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

        placeOrdereButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        placeOrdereButton.setText("Place Order");
        placeOrdereButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrdereButtonActionPerformed(evt);
            }
        });

        totalLabel.setText("Total Price");

        javax.swing.GroupLayout basepanelLayout = new javax.swing.GroupLayout(basepanel);
        basepanel.setLayout(basepanelLayout);
        basepanelLayout.setHorizontalGroup(
            basepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, basepanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(totalLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(placeOrdereButton, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        basepanelLayout.setVerticalGroup(
            basepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerpanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(basepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(placeOrdereButton)
                    .addGroup(basepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(totalLabel)
                        .addComponent(totalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(327, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(basepanel, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(basepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_itemsTableMouseClicked
        
    }//GEN-LAST:event_itemsTableMouseClicked

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        searchCustomer();
    }//GEN-LAST:event_searchButtonActionPerformed

    private void searchitemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchitemButtonActionPerformed
       searchItem();
    }//GEN-LAST:event_searchitemButtonActionPerformed

    private void addItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemButtonActionPerformed
        addToTable();
    }//GEN-LAST:event_addItemButtonActionPerformed

    private void placeOrdereButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_placeOrdereButtonActionPerformed
       placeOrder();
    }//GEN-LAST:event_placeOrdereButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OrderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrderView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrderView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addItemButton;
    private javax.swing.JPanel basepanel;
    private javax.swing.JLabel custdetails;
    private javax.swing.JLabel customerLabel;
    private javax.swing.JTextField customertext;
    private javax.swing.JLabel discountLabel;
    private javax.swing.JTextField discounttext;
    private javax.swing.JLabel headerlabel;
    private javax.swing.JPanel headerpanel;
    private javax.swing.JPanel homepanel;
    private javax.swing.JLabel itemIdLabel;
    private javax.swing.JTextField itemIdtext1;
    private javax.swing.JLabel itemdetailsLabel;
    private javax.swing.JTable itemsTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel orderIdLabel;
    private javax.swing.JTextField orderIdtext;
    private javax.swing.JButton placeOrdereButton;
    private javax.swing.JLabel quentityIdLabel;
    private javax.swing.JTextField quentitytext;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton searchitemButton;
    private javax.swing.JPanel tablepanel;
    private javax.swing.JLabel totalLabel;
    private javax.swing.JTextField totalTextField;
    // End of variables declaration//GEN-END:variables

private void searchCustomer(){

        try {
            String custId=customertext.getText();
            CustomerModel customer=customerController.getCustomer(custId);
            if(customer!=null){
                custdetails.setText("Customer Name:"+customer.getName()+"    |      Address:"+customer.getAddress());
            }else{
                 JOptionPane.showMessageDialog(this,"Customer Not Found");
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrderView.class.getName()).log(Level.SEVERE, null, ex);
            
            JOptionPane.showMessageDialog(this,ex.getMessage());
        }


}


private void searchItem(){
    
    try {
            String itemId=itemIdtext1.getText();
            ItemModel item=itemController.getItem(itemId);
            if(item!=null){
                itemdetailsLabel.setText("Item Name:"+item.getDescription()+"|Unit Price:  "+item.getUnitprice()+"|QtyOnHand:"+item.getQoh());
            }else{
                 JOptionPane.showMessageDialog(this,"Item Not Found");
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrderView.class.getName()).log(Level.SEVERE, null, ex);
            
            JOptionPane.showMessageDialog(this,ex.getMessage());
        } 
    
    
}


private void loadTable(){
    
  String[] Columns={"Item Code","Qty","Discount"};
 DefaultTableModel dtm=new DefaultTableModel(Columns,0){
     
     public boolean isCellEditable(int row,int column){
                    return false;
                }
                 
     };
itemsTable.setModel(dtm);



  
    
    
}

private void addToTable() {
    OrderDetailModel od =new OrderDetailModel("", itemIdtext1.getText(), Integer.parseInt(quentitytext.getText()), Double.parseDouble(discounttext.getText()));
orderDetailModel.add(od);
Object[] rowData={od.getItemCode(),"                   "+od.getOrderQTY(),"       "+od.getDiscount()};

DefaultTableModel dtm=(DefaultTableModel) itemsTable.getModel();
dtm.addRow(rowData);
       try {
            loadtotal();
        } catch (SQLException ex) {
            Logger.getLogger(OrderView.class.getName()).log(Level.SEVERE, null, ex);
        }
cleanItemData();
}


private void cleanItemData(){
      itemIdtext1.setText("");
    quentitytext.setText("");
    discounttext.setText("");
    itemdetailsLabel.setText("");
    
}

private void placeOrder(){
        try {
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            
            OrderModel orderModel=new OrderModel(orderIdtext.getText(),sdf.format(new Date()),customertext.getText());
            
            String result=orderController.placeOrder(orderModel,orderDetailModel);
            JOptionPane.showMessageDialog(this, result);
        } catch (SQLException ex) {
            Logger.getLogger(OrderView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,ex.getMessage());
        }

clearForm();
}

    private void clearForm() {
        loadTable();
        orderIdtext.setText("");
        customertext.setText("");
        
        
    }

    private void loadtotal() throws SQLException {
        
        OrderDetailModel od =new OrderDetailModel("", itemIdtext1.getText(), Integer.parseInt(quentitytext.getText()), Double.parseDouble(discounttext.getText()));
        
        
         String itemId=itemIdtext1.getText();
            ItemModel item=itemController.getItem(itemId);
            if(totalTextField.getText().isEmpty()){
            
              Double m=item.getUnitprice();
              int n=od.getOrderQTY();
             
              
              double dis=Double.parseDouble(discounttext.getText());
              
               double total=(double)((m*n)-(dis));
              String orderTotal=String.valueOf(total);
              totalTextField.setText(orderTotal);
            
            }else{
                
                
                double s1=Double.parseDouble(totalTextField.getText());
                
               // totalTextField.setText("");
                 Double m1=item.getUnitprice();
              int n1=od.getOrderQTY();
             
              
              double dis1=Double.parseDouble(discounttext.getText());
                
                double total1=(double)((s1)+((m1*n1)-(dis1))); 
                String orderTotal1=String.valueOf(total1);
              totalTextField.setText(orderTotal1);
                
                
            }
    
        
    }
}
