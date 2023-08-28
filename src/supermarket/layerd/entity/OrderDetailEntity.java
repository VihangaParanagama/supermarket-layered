/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.layerd.entity;

/**
 *
 * @author Vihanga
 */
public class OrderDetailEntity {
    private String orderId;
    private String itemId;
    private Integer qty;
    private Double Discount;

    public OrderDetailEntity() {
    }

    public OrderDetailEntity(String orderId, String itemId, Integer qty, Double Discount) {
        this.orderId = orderId;
        this.itemId = itemId;
        this.qty = qty;
        this.Discount = Discount;
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
     * @return the itemId
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * @param itemId the itemId to set
     */
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
     * @return the qty
     */
    public Integer getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(Integer qty) {
        this.qty = qty;
    }

    /**
     * @return the Discount
     */
    public Double getDiscount() {
        return Discount;
    }

    /**
     * @param Discount the Discount to set
     */
    public void setDiscount(Double Discount) {
        this.Discount = Discount;
    }

    @Override
    public String toString() {
        return "OrderDetail{" + "orderId=" + orderId + ", itemId=" + itemId + ", qty=" + qty + ", Discount=" + Discount + '}';
    }
    
    
}
