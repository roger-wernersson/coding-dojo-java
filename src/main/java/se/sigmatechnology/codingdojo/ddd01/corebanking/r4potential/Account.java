package se.sigmatechnology.codingdojo.ddd01.corebanking.r4potential;

import se.sigmatechnology.codingdojo.ddd01.corebanking.r3operational.Overdraft;
import se.sigmatechnology.codingdojo.ddd01.corebanking.r1policy.OverdraftPolicy;

public class Account {
    public AccountId id;
    private UserId userId;
    public OverdraftPolicy overdraftPolicy;
    public Overdraft overdraft;

    public Money balance() {
        return null;
    }
}
