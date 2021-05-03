package com.progressivecoder.es.eventsourcingaxonspringboot.events;

public class AccountCreatedEvent extends BaseEvent<String> {

    public final double accountBalance;

    public final String currency;

    public final  String lastName;

    public final String firstName;

    public AccountCreatedEvent(String id, double accountBalance, String currency, String lastName, String firstName) {
        super(id);
        this.accountBalance = accountBalance;
        this.currency = currency;
        this.lastName = lastName;
        this.firstName = firstName;
    }
}
