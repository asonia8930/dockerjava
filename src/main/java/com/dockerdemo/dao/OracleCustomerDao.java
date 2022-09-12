package com.dockerdemo.dao;

import com.dockerdemo.Entity.Customer;
import com.dockerdemo.Entity.CustomerAddress;
import com.dockerdemo.repository.CustomerRepository;
import com.dockerdemo.request.CustomerRequest;
import com.sun.jndi.cosnaming.IiopUrl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class OracleCustomerDao implements CustomerDao {

    @Autowired
    CustomerRepository crudRepository;


    @Override
    public void saveUserData(CustomerRequest customerRequest) {
        Customer customer = new Customer();
        customer.setCustomerName(customerRequest.getCustomerName());
        CustomerAddress customerAddress = new CustomerAddress();
        List<CustomerAddress> lst = new ArrayList<>();
        customerAddress.setCity(customerRequest.getCity());
        customerAddress.setHouseNo(customerRequest.getHouseNo());
        customerAddress.setLandmark(customerRequest.getLandmark());
        customerAddress.setPincode(customerRequest.getPincode());
        customerAddress.setStreet(customerRequest.getStreet());
        lst.add(customerAddress);
        customer.setCustomerAddress(lst);
        crudRepository.save(customer);

    }


}
