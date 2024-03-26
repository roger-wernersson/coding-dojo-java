package se.sigmatechnology.codingdojo.ddd01.corebanking.r3operational;

import se.sigmatechnology.codingdojo.ddd01.corebanking.r4potential.AccountId;
import se.sigmatechnology.codingdojo.ddd01.corebanking.r4potential.FinancialStatus;
import se.sigmatechnology.codingdojo.ddd01.corebanking.r4potential.Money;

import java.util.List;

public class FinancialTransaction {
    private FinancialStatus status;
    public List<SubTransaction> chain;

    public Money balanceOf(AccountId accountId) {
        Money total = new Money();
        for(SubTransaction st: chain) {
            total.plus(st.balanceOf(accountId));
        }
        return null;
    }

    public void add(SubTransaction feeTransaction) {

    }
}
