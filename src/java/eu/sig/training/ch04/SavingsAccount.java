package eu.sig.training.ch04;

// tag::SavingsAccount[]
public class SavingsAccount extends Account {
    private Account registeredCounterAccount;

    public Transfer makeTransfer(String counterAccount, Money amount) 
        throws BusinessException {
            Transfer result = super.makeTransfer(counterAccount, amount); // <2>
            // 3. Check whether withdrawal is to registered counter account:
            if (result.getCounterAccount().equals(this.registeredCounterAccount)) 
            {
                return result;
            } else {
                throw new BusinessException("Counter-account not registered!");
            }
    }
    
    
}
// end::SavingsAccount[]
