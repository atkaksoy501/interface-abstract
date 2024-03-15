package com.turkcell;

import com.turkcell.business.MernisService;
import com.turkcell.business.NeroService;
import com.turkcell.business.StarbucksService;
import com.turkcell.entities.Customer;
import com.turkcell.entities.NeroCustomer;
import com.turkcell.entities.StarbucksCustomer;

public class Main {
    public static void main(String[] args) {
        //Create Starbucks Customer
        // 12345678901 is a dummy national id. So, mernis validation will fail. But it works with a valid national id.
        Customer customer = new StarbucksCustomer("Atakan", "Aksoy", "123456", 100, "12345678901", 2002);
        StarbucksService starbucksService = new StarbucksService(new MernisService());
        starbucksService.add(customer);

        //Add Stars to Starbucks Customer for 1 drink
        starbucksService.addStar(customer, 1);

        //Update Starbucks Customer
        StarbucksCustomer customer1 = (StarbucksCustomer) customer;
        customer1.setStars(200);
        starbucksService.update(customer);

        //Delete Starbucks Customer
        starbucksService.delete(customer);

        //Create Nero Customer
        Customer customer2 = new NeroCustomer("Atakan", "Aksoy", "123456", 2002);
        NeroService neroService = new NeroService();
        neroService.add(customer2);

        //Update Nero Customer
        NeroCustomer customer3 = (NeroCustomer) customer2;
        customer3.setYearOfBirth(2003);
        neroService.update(customer2);

        //Delete Nero Customer
        neroService.delete(customer2);
    }
}