package madvirus.spring.chap06.controller;

import madvirus.spring.chap06.model.Address;
import madvirus.spring.chap06.model.OrderItem;

import java.util.List;

public class OrderCommand {

    private List<OrderItem> orderItems;
    private Address address;

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

}
