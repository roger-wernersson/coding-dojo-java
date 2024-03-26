package se.sigmatechnology.codingdojo.ddd01.corewebapp.c4potential;

import static java.util.Objects.requireNonNull;

// Value Object
public class UserName {
    public static UserName NO_NAME = new UserName("", "");
    private final String firstName;
    private final String lastName;

    public UserName(String firstName, String lastName) {
        this.firstName = requireNonNull(firstName);
        this.lastName = requireNonNull(lastName);
    }

    public boolean isValid() {
        return false;
    }
}
