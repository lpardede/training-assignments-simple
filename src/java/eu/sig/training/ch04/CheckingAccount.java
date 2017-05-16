package eu.sig.training.ch04;

// tag::CheckingAccount[]
public class CheckingAccount extends Account {
    int transferLimit = 100;

    public Transfer makeTransfer(String counterAccount, Money amount)
        throws BusinessException {
        // 1. Check withdrawal limit:
        if (amount.greaterThan(this.transferLimit)) {
            throw new BusinessException("Limit exceeded!");
        }
        return super.makeTransfer(counterAccount, amount);
    }

}
// end::CheckingAccount[]
