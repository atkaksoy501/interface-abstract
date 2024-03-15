package com.turkcell.business;

import com.turkcell.dataAccess.CustomerDao;
import com.turkcell.entities.Customer;

public class BaseService implements CustomerDao {

    @Override
    public void add(Customer customer) {
        System.out.println("Customer added: " + customer.getFirstName());
    }

    @Override
    public void update(Customer customer) {
        System.out.println("Customer updated: " + customer.getFirstName());
    }

    @Override
    public void delete(Customer customer) {
        System.out.println("Customer deleted: " + customer.getFirstName());
    }
}
