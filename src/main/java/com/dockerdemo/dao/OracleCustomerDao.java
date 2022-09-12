package com.dockerdemo.dao;

import com.dockerdemo.Entity.Customer;
import com.dockerdemo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class OracleCustomerDao implements CustomerDao {

    /*@Autowired
    CustomerRepository crudRepository;*/

    @Override
    public void save(List<? extends Customer> items) {

    }

    /*@Override
    public void saveUserData(Customer customer) {
        crudRepository.save(customer);
    }*/

    @Override
    public Customer populateUserData(Customer customer) {
        return null;
    }
}
