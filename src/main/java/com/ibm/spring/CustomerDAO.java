package com.ibm.spring;

import java.util.List;

public interface CustomerDAO {

    public List<CustomerTo>getAllCustomers();

    public CustomerTo getCustomerByCid(int cid);

    public CustomerTo getCustomerByEmail(String email);

    public CustomerTo getCustomerByCity(String city);

    public int getCustomersCount();

    public String getCustomersCityByEmail(String email);

    public Long getCustomerPhoneByEmail(String email);


}
