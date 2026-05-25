package com.example.order.dto;


public class OrderRequest {

    private String customerName;
    private String email;
    private Double amount;

    public OrderRequest() {
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

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
