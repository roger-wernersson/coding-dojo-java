package se.sigmatechnology.codingdojo.ddd01.corebanking.r0usecase;

import se.sigmatechnology.codingdojo.ddd01.corebanking.r3operational.FinancialTransactionList;
import se.sigmatechnology.codingdojo.ddd01.corebanking.r4potential.Account;
import se.sigmatechnology.codingdojo.ddd01.corebanking.r4potential.AccountId;
import se.sigmatechnology.codingdojo.ddd01.corebanking.r4potential.Money;
import se.sigmatechnology.codingdojo.ddd01.persistence.AccountRepository;
import se.sigmatechnology.codingdojo.ddd01.persistence.TransactionRepository;

public class GetAccountBalance {

    public Money execute(AccountId accountId) {
        AccountRepository accounts = new AccountRepository();
        TransactionRepository transactions = new TransactionRepository();

        FinancialTransactionList list = transactions.findById(accountId);
        Account account = accounts.findById(accountId);
        Money transactionSum = list.balanceOf(accountId);
        return account.balance().plus(transactionSum);
    }
}
