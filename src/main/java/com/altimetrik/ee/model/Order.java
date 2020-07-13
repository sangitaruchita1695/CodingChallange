package com.altimetrik.ee.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Order {
    @Id
    private String id;

    private String restaurantId;
    private List<ItemQuantity> items;
    private int totalPrice;
    private long orderTime;
    private String specialNote;
    private long deliveryTime;
    private String paymentId;
    private String note;

    private UserInfo userInfo;

    public UserInfo getUserInfo() {
        return userInfo;
    }
}
