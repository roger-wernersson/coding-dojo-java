package se.sigmatechnology.codingdojo.ddd01.corebanking.r3operational;

import se.sigmatechnology.codingdojo.ddd01.corebanking.r4potential.AccountId;
import se.sigmatechnology.codingdojo.ddd01.corebanking.r4potential.Money;

import java.util.Collections;
import java.util.List;

public class FinancialTransactionList {
    private final List<FinancialTransaction> list = Collections.emptyList();

    public Money balanceOf(AccountId accountId) {
        Money total = new Money();

        for (FinancialTransaction ft : list) {
            total = total.plus(ft.balanceOf(accountId));
        }
        return total;
    }
}
