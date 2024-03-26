package se.sigmatechnology.codingdojo.ddd01.anticorruption;

import se.sigmatechnology.codingdojo.ddd01.corebanking.r3operational.FinancialTransactionList;
import se.sigmatechnology.codingdojo.ddd01.corebanking.r4potential.AccountId;

// Service
public class GetExternalTransactions {
    private IbanAdaptor adaptor = new IbanAdaptor();

    public FinancialTransactionList getTransactionsFor(AccountId accountId) {
        return adaptor.getTransactionsFor(accountId);
    }
}
