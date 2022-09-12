package com.dockerdemo.dao;


import com.dockerdemo.request.CustomerRequest;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
@Service
@Transactional
public interface CustomerDao {
     void saveUserData(CustomerRequest customerRequest);

}
