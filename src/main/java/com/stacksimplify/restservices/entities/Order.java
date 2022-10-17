package com.stacksimplify.restservices.entities;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonIgnore;


public class Order extends ResourceSupport {











    private Long orderid;
    private String orderdescription;


    private User user;
    public Order() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Long getOrderid() {
        return orderid;
    }
    public void setOrderid(Long orderid) {
        this.orderid = orderid;
    }
    public String getOrderdescription() {
        return orderdescription;
    }
    public void setOrderdescription(String orderdescription) {
        this.orderdescription = orderdescription;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }


}