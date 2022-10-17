package com.stacksimplify.restservices.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;









        import javax.persistence.GeneratedValue;
        import javax.persistence.Id;
        import javax.persistence.OneToMany;
        import javax.persistence.Table;
        import javax.validation.constraints.NotEmpty;
        import javax.validation.constraints.Size;

        import org.springframework.hateoas.ResourceSupport;

//Entity
// and
public class User extends ResourceSupport {


    private Long userid;


    private String username;

    private String firstname;

    private String lastname;

    private String email;

    private String role;

    private String ssn;

    @OneToMany(mappedBy = "user")
    private List<Order> orders;

    // No Argument Constructor
    public User() {
    }

    // Fields Constructor
    public User(Long userid,
                String email, String role, String ssn, List<Order> orders) {
        super();
        this.userid = userid;
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.role = role;
        this.ssn = ssn;
        this.orders = orders;
    }
    // Getters and Setters

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    // To String


    public String toString() {
        return "User [userid=" + userid + ", username=" + username + ", firstname=" + firstname + ", lastname="
                + lastname + ", email=" + email + ", role=" + role + ", ssn=" + ssn + ", orders=" + orders + "]";
    }

}