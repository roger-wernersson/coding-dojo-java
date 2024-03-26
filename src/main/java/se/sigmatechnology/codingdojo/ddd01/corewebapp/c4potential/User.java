package se.sigmatechnology.codingdojo.ddd01.corewebapp.c4potential;

import java.util.Date;

import static java.util.Objects.requireNonNull;
import static se.sigmatechnology.codingdojo.ddd01.corewebapp.c4potential.UserName.NO_NAME;

// DDD Entity
public class User {

    private final UserId id;
    private UserName userName = NO_NAME;
    private Date dateOfBirth;

    public User(UserId id) {
        this.id = id;
    }

    public UserName getUserName() {
        return userName;
    }

    public void setUserName(UserName userName) {
        this.userName = requireNonNull(userName);
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int productsBought() {
        return 0;
    }
}
