/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.mvc.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import pos.mvc.db.DBConnection;
import pos.mvc.model.OrderDetailModel;
import pos.mvc.model.OrderModel;

/**
 *
 * @author TOSHIBA
 */
public class OrderController {
    public String placeOrder(OrderModel orderModel,ArrayList<OrderDetailModel> orderDetailModels) throws SQLException{
    
    Connection connection=DBConnection.getInstance().getConnection();
    try{
    connection.setAutoCommit(false);
    
     String orderquery="INSERT INTO orders VALUES(?,?,?)" ;
     
     PreparedStatement preparedStatementforOrder=connection.prepareStatement(orderquery); 
     
     
      preparedStatementforOrder.setString(1,orderModel.getOrderId());
       preparedStatementforOrder.setString(2,orderModel.getOrderDate());
       preparedStatementforOrder.setString(3,orderModel.getCustId());
       
     if(preparedStatementforOrder.executeUpdate()>0){
         boolean isOrderDetailSaved=true;
         
        String orderdetailquery="INSERT INTO orderdetail VALUES(?,?,?,?)" ;
        
        for(OrderDetailModel orderDetailModel: orderDetailModels){
          PreparedStatement preparedStatementforOrderDetails=connection.prepareStatement(orderdetailquery); 
     
      preparedStatementforOrderDetails.setString(1,orderModel.getOrderId());
       preparedStatementforOrderDetails.setString(2,orderDetailModel.getItemCode());
       preparedStatementforOrderDetails.setInt(3,orderDetailModel.getOrderQTY());
       preparedStatementforOrderDetails.setDouble(4,orderDetailModel.getDiscount());
           
           if(!(preparedStatementforOrderDetails.executeUpdate()>0)) {
               isOrderDetailSaved=false;
           }
        }
         
         if(isOrderDetailSaved){
             
            boolean isItemUpdated=true;
           String itemquery="UPDATE Item SET QtyOnHand=QtyOnHand- ? WHERE  ItemCode=?" ;  
           for(OrderDetailModel orderDetailModel: orderDetailModels){
            PreparedStatement preparedStatementforItem=connection.prepareStatement(itemquery);   
            preparedStatementforItem.setInt(1, orderDetailModel.getOrderQTY());
            
            preparedStatementforItem.setString(2, orderDetailModel.getItemCode());
            
            if(!(preparedStatementforItem.executeUpdate()>0)){
                
                isItemUpdated=false;
                
            }
               
           }
           
           if(isItemUpdated){
               connection.commit();
               return "Success";
               
           }else{
               connection.rollback();
             return "Item Update Error";  
           }
             
         }else{
             
             connection.rollback();
             return "Order Detail Save Error";
             
         }
         
     }else{
         
         connection.rollback();
         return "Order Save Error";
     }
     
    }catch(Exception e){
        
    connection.rollback();
    e.printStackTrace();
             return e.getMessage(); 
    
    }finally{
        connection.setAutoCommit(true);
    }
    }
}
