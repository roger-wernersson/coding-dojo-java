package se.sigmatechnology.codingdojo.ddd01.corebanking.r3operational;

import se.sigmatechnology.codingdojo.ddd01.corebanking.r4potential.Account;
import se.sigmatechnology.codingdojo.ddd01.corebanking.r4potential.AccountId;
import se.sigmatechnology.codingdojo.ddd01.corebanking.r4potential.Money;
import se.sigmatechnology.codingdojo.ddd01.corebanking.r4potential.SubStatus;

public class SubTransaction {
    private SubStatus status;
    public Money amount;
    public AccountId from;
    public AccountId to;

    public SubTransaction(Money amount, AccountId from, AccountId to) {
        this.amount = amount;
        this.from = from;
        this.to = to;
    }

    public Money balanceOf(AccountId accountId) {
        if (to == accountId) {
            return amount;
        } else if (from == accountId) {
            return amount.negative();
        }
        return Money.ZERO;
    }
}
