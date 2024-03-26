package se.sigmatechnology.codingdojo.ddd01.corewebapp.c1usecases;

import se.sigmatechnology.codingdojo.ddd01.corewebapp.c2decisionsupport.CanSellUsedProducts;
import se.sigmatechnology.codingdojo.ddd01.corewebapp.c2decisionsupport.CompositeUserSpecification;
import se.sigmatechnology.codingdojo.ddd01.corewebapp.c2decisionsupport.UserSpecification;
import se.sigmatechnology.codingdojo.ddd01.corewebapp.c2decisionsupport.ValidUserSpecification;
import se.sigmatechnology.codingdojo.ddd01.corewebapp.c3operational.Product;
import se.sigmatechnology.codingdojo.ddd01.corewebapp.c4potential.*;
import se.sigmatechnology.codingdojo.ddd01.persistence.ProductRepository;
import se.sigmatechnology.codingdojo.ddd01.persistence.UserRepository;

/// Use case object (Application Layer)
public class RegisterUser {

    private UserFactory factory = new UserFactory();
    private UserRepository userRepo = new UserRepository();
    private ProductRepository productRepo = new ProductRepository();
    private ValidUserSpecification spec = new ValidUserSpecification();
    private UserSpecification spec2 = new UserSpecification(46);
    private CompositeUserSpecification spec3 = new CompositeUserSpecification();

    public int firsts(String firstName, String lastName) {

        User user = factory.CreateRegisteredUser(new UserName(firstName, lastName));

        if (spec.isValid(user)){
            userRepo.store(user);
            return 0;
        } else {
            return -1;
        }
    }

    public int second(String firstName, String lastName) {
        User user = factory.CreateRegisteredUser(new UserName(firstName, lastName));

        if (spec2.isValid(user)){
            userRepo.store(user);
            return 0;
        } else {
            return -1;
        }
    }

    public String third(String firstName, String lastName) {
        User user = factory.CreateRegisteredUser(new UserName(firstName, lastName));

        CompositeUserSpecification rest = spec3.validate(user);

        if (rest.isEmpty()) {
            userRepo.store(user);
        } else {
            return rest.toString();
        }
        return firstName;
    }

    public String fourth(UserId userId, ProductId productId) {
        User user = userRepo.findById(userId);
        Product product = productRepo.findById(productId);

        CanSellUsedProducts spec = new CanSellUsedProducts();

        if (spec.isValid(user, product)) {
            // sell products
            return "done";
        } else {
            return "not yet";
        }
    }
}
