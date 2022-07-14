package com.pos.kuppiya.pointofsale.entity;

import com.vladmihalcea.hibernate.type.json.JsonType;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;


//create customer table....
@Entity
@Table(name = "customer")
@TypeDefs({
        @TypeDef(name = "json",typeClass = JsonType.class)
})

public class Customer
{
 // create customer id...
    @Id
    @Column(name = "customer_id",length = 20)
    private int customer;

//create customer name...
    @Column(name = "customer_name",length = 30,nullable = false)
    private String customerName;

//create customer customeradress...
    @Column(name = "customer_adress",length = 100)
    private String customeradress;

//create customer customersalary...
    @Column(name = "customer_salary",length = 10)
    private double customersalary;

// create customer contactnumber...
    @Type(type = "json")
    @Column(name = "contact_number",columnDefinition = "json")
    private ArrayList contactnumber;

// create customer nic...
    @Column(name = "nic",length = 13,unique = true)
    private String nic;

// create customer contactnumber...
    @Column(name = "active_state",columnDefinition = "TINYINT default 1")
    private boolean activestate;



// create no arg constructor...
    public Customer()
    {

    }
 //create getter and setters.....
    public int getCustomer() {
        return customer;
    }

    public void setCustomer(int customer) {
        this.customer = customer;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomeradress() {
        return customeradress;
    }

    public void setCustomeradress(String customeradress) {
        this.customeradress = customeradress;
    }

    public double getCustomersalary() {
        return customersalary;
    }

    public void setCustomersalary(double customersalary) {
        this.customersalary = customersalary;
    }

    public ArrayList getContactnumber() {
        return contactnumber;
    }

    public void setContactnumber(ArrayList contactnumber) {
        this.contactnumber = contactnumber;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public boolean isActivestate() {
        return activestate;
    }

    public void setActivestate(boolean activestate) {
        this.activestate = activestate;
    }


 //to string.....
    @Override
    public String toString() {
        return "customer{" +
                "customer=" + customer +
                ", customerName='" + customerName + '\'' +
                ", customeradress='" + customeradress + '\'' +
                ", customersalary=" + customersalary +
                ", contactnumber=" + contactnumber +
                ", nic='" + nic + '\'' +
                ", activestate=" + activestate +
                '}';
    }

    // create full arg constructor......
    public Customer(int customer, String customerName, String customeradress, double customersalary, ArrayList contactnumber, String nic, boolean activestate) {
        this.customer = customer;
        this.customerName = customerName;
        this.customeradress = customeradress;
        this.customersalary = customersalary;
        this.contactnumber = contactnumber;
        this.nic = nic;
        this.activestate = activestate;





    }
}