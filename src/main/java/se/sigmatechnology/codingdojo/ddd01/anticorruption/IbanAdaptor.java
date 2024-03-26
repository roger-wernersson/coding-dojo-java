package se.sigmatechnology.codingdojo.ddd01.anticorruption;

import se.sigmatechnology.codingdojo.ddd01.corebanking.r3operational.FinancialTransactionList;
import se.sigmatechnology.codingdojo.ddd01.corebanking.r4potential.Account;
import se.sigmatechnology.codingdojo.ddd01.corebanking.r4potential.AccountId;
import se.sigmatechnology.codingdojo.ddd01.externalbanks.Iban;
import se.sigmatechnology.codingdojo.ddd01.persistence.AccountRepository;

public class IbanAdaptor {
    private IbanFacade facade = new IbanFacade();
    private TransactionTranslator transactionTranslator = new TransactionTranslator();
    private IbanTranslator ibanTranslator = new IbanTranslator();

    public FinancialTransactionList getTransactionsFor(AccountId accountId) {
        AccountRepository repo = new AccountRepository();
        Account account = repo.findById(accountId);
        Iban iban = ibanTranslator.fromAccount(account);

        ExternalTransactions transactions = facade.getTransactionFor(iban);
        FinancialTransactionList list = transactionTranslator.internalFromExternal(transactions);

        return list;
    }
}
