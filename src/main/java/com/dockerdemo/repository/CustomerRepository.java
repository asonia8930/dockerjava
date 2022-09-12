package com.dockerdemo.repository;

import com.dockerdemo.Entity.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CustomerRepository extends CrudRepository<Customer,Integer> {
}
