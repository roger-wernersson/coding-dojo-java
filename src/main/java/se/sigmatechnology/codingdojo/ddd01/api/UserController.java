package se.sigmatechnology.codingdojo.ddd01.api;

import se.sigmatechnology.codingdojo.ddd01.corewebapp.c4potential.User;
import se.sigmatechnology.codingdojo.ddd01.corewebapp.c4potential.UserFactory;
import se.sigmatechnology.codingdojo.ddd01.corewebapp.c4potential.UserName;
import se.sigmatechnology.codingdojo.ddd01.corewebapp.c2decisionsupport.ValidUserSpecification;

// Spring
public class UserController {

    public Result createUser(String firstName, String lastname, String dateOfBirth) {
        UserFactory factory = new UserFactory();
        User user = factory.CreateRegisteredUser(new UserName(firstName, lastname));

        ValidUserSpecification spec = new ValidUserSpecification();
        if (spec.isValid(user)) {
            // go on with usecase
            // inside the baricade
        } else {
            return new Result();
        }
    }
}
