/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pos.mvc.model;

/**
 *
 * @author TOSHIBA
 */
public class OrderDetailModel {
    
     private String orderId;
    private String ItemCode;
    private Integer   OrderQTY;
    private Double discount;

    public OrderDetailModel() {
    }

    public OrderDetailModel(String orderId, String ItemCode, Integer OrderQTY, Double discount) {
        this.orderId = orderId;
        this.ItemCode = ItemCode;
        this.OrderQTY = OrderQTY;
        this.discount = discount;
    }

    /**
     * @return the orderId
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * @param orderId the orderId to set
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * @return the ItemCode
     */
    public String getItemCode() {
        return ItemCode;
    }

    /**
     * @param ItemCode the ItemCode to set
     */
    public void setItemCode(String ItemCode) {
        this.ItemCode = ItemCode;
    }

    /**
     * @return the OrderQTY
     */
    public Integer getOrderQTY() {
        return OrderQTY;
    }

    /**
     * @param OrderQTY the OrderQTY to set
     */
    public void setOrderQTY(Integer OrderQTY) {
        this.OrderQTY = OrderQTY;
    }

    /**
     * @return the discount
     */
    public Double getDiscount() {
        return discount;
    }

    /**
     * @param discount the discount to set
     */
    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "OrderDetailModel{" + "orderId=" + orderId + ", ItemCode=" + ItemCode + ", OrderQTY=" + OrderQTY + ", discount=" + discount + '}';
    }
    
       
    
    
    
}
