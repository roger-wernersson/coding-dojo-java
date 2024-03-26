package se.sigmatechnology.codingdojo.ddd01.corewebapp.c2decisionsupport;

import se.sigmatechnology.codingdojo.ddd01.corewebapp.c4potential.User;

public class ValidUserSpecification {

    public boolean isValid(User user) {
        return user.getUserName().isValid();
    }
}
