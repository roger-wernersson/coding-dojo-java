package se.sigmatechnology.codingdojo.ddd01.corewebapp.c3operational;

import se.sigmatechnology.codingdojo.ddd01.corewebapp.c4potential.User;

// Entity
public class Order {
    private final String id;
    private User user;

    public Order(String id, User user) {
        this.id = id;
        this.user = user;
    }
}
