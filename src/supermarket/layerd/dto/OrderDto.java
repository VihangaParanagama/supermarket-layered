/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.layerd.dto;

import java.util.List;

/**
 *
 * @author Vihanga
 */
public class OrderDto {
    private String orderId;
    private String customerId;
    
    private List<OrderDetailDto> orderDetailDto;

    public OrderDto() {
    }

    public OrderDto(String orderId, String customerId, List<OrderDetailDto> orderDetailDto) {
        this.orderId = orderId;
        this.customerId = customerId;
        this.orderDetailDto = orderDetailDto;
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
     * @return the customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * @param customerId the customerId to set
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * @return the orderDetailDto
     */
    public List<OrderDetailDto> getOrderDetailDto() {
        return orderDetailDto;
    }

    /**
     * @param orderDetailDto the orderDetailDto to set
     */
    public void setOrderDetailDto(List<OrderDetailDto> orderDetailDto) {
        this.orderDetailDto = orderDetailDto;
    }

    @Override
    public String toString() {
        return "OrderDto{" + "orderId=" + orderId + ", customerId=" + customerId + ", orderDetailDto=" + orderDetailDto + '}';
    }
    
    
}
