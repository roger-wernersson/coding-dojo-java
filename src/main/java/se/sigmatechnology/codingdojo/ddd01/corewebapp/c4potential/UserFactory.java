package se.sigmatechnology.codingdojo.ddd01.corewebapp.c4potential;

import static java.util.Objects.requireNonNull;

public class UserFactory {

    public User CreateGuestUser() {
        return new User(new UserId());
    }

    public User CreateRegisteredUser(UserName userName) {
        User user = new User(new UserId());
        user.setUserName(requireNonNull(userName));
        return user;
    }
}
