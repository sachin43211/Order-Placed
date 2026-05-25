package com.example.order.producer;

public class OrderEvent {

    private Long orderId;
    private String customerName;
    private String email;
    private Double amount;
    private String status;

    public OrderEvent() {
    }

    public OrderEvent(Long orderId, String customerName, String email, Double amount, String status) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.email = email;
        this.amount = amount;
        this.status = status;
    }

    public Long getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public Double getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}