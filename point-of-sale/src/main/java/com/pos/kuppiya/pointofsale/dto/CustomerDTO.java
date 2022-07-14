package com.pos.kuppiya.pointofsale.dto;

import java.util.ArrayList;

public class CustomerDTO
{
    private int customerid;
    private String customerName;
    private String customeradress;
    private double customersalary;
    private ArrayList contactnumber;
    private String nic;
    private boolean activestate;

    public CustomerDTO()
    {
        
    }

    public CustomerDTO(int customerid, String customerName, String customeradress, double customersalary, ArrayList contactnumber, String nic, boolean activestate)
    {
        this.customerid = customerid;
        this.customerName = customerName;
        this.customeradress = customeradress;
        this.customersalary = customersalary;
        this.contactnumber = contactnumber;
        this.nic = nic;
        this.activestate = activestate;
    }

    public int getCustomerid() {
        return customerid;
    }

    public void setCustomerid(int customerid) {
        this.customerid = customerid;
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

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "customerid=" + customerid +
                ", customerName='" + customerName + '\'' +
                ", customeradress='" + customeradress + '\'' +
                ", customersalary=" + customersalary +
                ", contactnumber=" + contactnumber +
                ", nic='" + nic + '\'' +
                ", activestate=" + activestate +
                '}';
    }
}
