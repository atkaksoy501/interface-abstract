package com.turkcell.dataAccess;

import com.turkcell.entities.Customer;

public interface CustomerDao {
    void add(Customer customer);
    void update(Customer customer);
    void delete(Customer customer);
}
