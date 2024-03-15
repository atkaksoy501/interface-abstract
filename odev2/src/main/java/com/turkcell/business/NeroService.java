package com.turkcell.business;

import com.turkcell.entities.Customer;

public class NeroService extends BaseService{
    @Override
    public void add(Customer customer) {
        System.out.println("Nero Customer added: " + customer.getFirstName());
    }

    @Override
    public void update(Customer customer) {
        System.out.println("Nero Customer updated: " + customer.getFirstName());
    }

    @Override
    public void delete(Customer customer) {
        System.out.println("Nero Customer deleted: " + customer.getFirstName());
    }
}
