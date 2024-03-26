package se.sigmatechnology.codingdojo.ddd01.corebanking.r1policy;

import se.sigmatechnology.codingdojo.ddd01.corebanking.r4potential.AccountId;
import se.sigmatechnology.codingdojo.ddd01.corebanking.r4potential.Money;

public interface OverdraftPolicy {
    Money limit();
    AccountId providerId();
    Money fee();
    AccountId feeId();
    Money interest();
    AccountId interestId();
}
