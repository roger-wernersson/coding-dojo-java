package se.sigmatechnology.codingdojo.ddd01.corebanking.r0usecase;

import se.sigmatechnology.codingdojo.ddd01.corebanking.r3operational.FinancialTransaction;
import se.sigmatechnology.codingdojo.ddd01.corebanking.r3operational.SubTransaction;
import se.sigmatechnology.codingdojo.ddd01.corebanking.r4potential.Account;
import se.sigmatechnology.codingdojo.ddd01.corebanking.r4potential.AccountId;
import se.sigmatechnology.codingdojo.ddd01.corebanking.r4potential.Money;
import se.sigmatechnology.codingdojo.ddd01.corebanking.r1policy.OverdraftPolicy;
import se.sigmatechnology.codingdojo.ddd01.persistence.AccountRepository;

public class CreateTransaction {

    GetAccountBalance balanceService = new GetAccountBalance();

    void execute(AccountId fromId, AccountId toId, Money amount) {
        FinancialTransaction transaction = new FinancialTransaction();
        AccountRepository repo = new AccountRepository();
        Account fromAccount = repo.findById(fromId);
        Money balance = balanceService.execute(fromId);

        Money result = balance.minus(amount);
        OverdraftPolicy policy = fromAccount.overdraftPolicy;
        if (result.isNegative()) {
            Money fee = policy.fee();
            Money interest = policy.interest();
            Money newOverdraft = fee.plus(interest).minus(result);
            Money totalOverdraft = newOverdraft.plus(fromAccount.overdraft.current);
            if (totalOverdraft.minus(policy.limit()).isNegative()) {
                // reject transaction
            }

            SubTransaction feeTransaction = new SubTransaction(fee, fromId, policy.feeId());
            transaction.add(feeTransaction);

            SubTransaction interestTransaction = new SubTransaction(interest, fromId, policy.interestId());
            transaction.add(interestTransaction);

            SubTransaction overdraftTransaction = new SubTransaction(newOverdraft, policy.providerId(), fromId);
            transaction.add(overdraftTransaction);
        }

        SubTransaction transfer = new SubTransaction(amount, fromId, toId);
        transaction.add(transfer);
    }
}
