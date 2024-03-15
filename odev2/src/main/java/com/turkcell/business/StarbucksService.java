package com.turkcell.business;

import com.turkcell.entities.Customer;
import com.turkcell.entities.StarbucksCustomer;

public class StarbucksService extends BaseService{
    private final MernisService mernisService;

    public StarbucksService(MernisService MernisService) {
        this.mernisService = MernisService;
    }

    @Override
    public void add(Customer customer) {
        if (customer instanceof StarbucksCustomer) {
            if (mernisService.validate(customer)) {
                System.out.println("Starbucks Customer added: " + customer.getFirstName());
            } else {
                System.out.println("MERNIS validation failed. Not a valid person");
            }
        } else {
            System.out.println("Not a valid customer");
        }
    }

    @Override
    public void update(Customer customer) {
        System.out.println("Starbucks Customer updated: " + customer.getFirstName());
    }

    @Override
    public void delete(Customer customer) {
        System.out.println("Starbucks Customer deleted: " + customer.getFirstName());
    }

    public void addStar(Customer customer, int drinkCount) {
        StarbucksCustomer customer1 = (StarbucksCustomer) customer;
        // add 10 stars for each drink
        int amountOfStars = drinkCount * 10;
        customer1.setStars(customer1.getStars() + amountOfStars);
        System.out.println("" + amountOfStars + " stars added to your card for " + drinkCount + " drink(s). Your new star count is: " + customer1.getStars());
    }
}
