package com.dockerdemo.dao;

import com.dockerdemo.Entity.Customer;
import java.util.List;

public interface CustomerDao {


    void save(List<? extends Customer> items);
  /*  public void saveUserData(Customer customer);*/

    public Customer populateUserData(Customer customer);
}
