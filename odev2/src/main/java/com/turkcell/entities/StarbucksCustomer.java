package com.turkcell.entities;

public class StarbucksCustomer extends Customer {
    private String starbucksCardNumber;
    private int stars;

    public StarbucksCustomer(String firstName, String lastName, String starbucksCardNumber, int stars, String nationalId, int yearOfBirth) {
        super(firstName, lastName, nationalId, yearOfBirth);
        this.starbucksCardNumber = starbucksCardNumber;
        this.stars = stars;
    }

    public String getStarbucksCardNumber() {
        return starbucksCardNumber;
    }

    public void setStarbucksCardNumber(String starbucksCardNumber) {
        this.starbucksCardNumber = starbucksCardNumber;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }
}
