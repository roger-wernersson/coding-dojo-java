package se.sigmatechnology.codingdojo.ddd01.corewebapp.c2decisionsupport;

import se.sigmatechnology.codingdojo.ddd01.corewebapp.c3operational.Product;
import se.sigmatechnology.codingdojo.ddd01.corewebapp.c4potential.User;

public class CanSellUsedProducts {
    public boolean isValid(User user, Product product) {
        return user.productsBought() > 5 && product.soldByUs();
    }
}
