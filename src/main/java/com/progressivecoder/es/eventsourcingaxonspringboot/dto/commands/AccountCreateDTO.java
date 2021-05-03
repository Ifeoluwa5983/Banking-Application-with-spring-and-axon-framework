package com.progressivecoder.es.eventsourcingaxonspringboot.dto.commands;

public class AccountCreateDTO {

    private double startingBalance;

    private String currency;

    public String lastName;

    public String firstName;

    public double getStartingBalance() {
        return startingBalance;
    }

    public void setStartingBalance(double startingBalance) {
        this.startingBalance = startingBalance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
