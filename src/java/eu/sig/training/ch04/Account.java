package eu.sig.training.ch04;

public class Account {
    private static final float INTEREST_PERCENTAGE = 0.04f;
    private Money balance = new Money();

	public Account() {
		super();
	}

	public Transfer makeTransfer(String counterAccount, Money amount)
			throws BusinessException {
			    // 2. Assuming result is 9-digit bank account number, validate 11-test:
			    int sum = 0;
			    for (int i = 0; i < counterAccount.length(); i++) {
			        sum = sum + (9 - i) * Character.getNumericValue(counterAccount.charAt(i));
			    }
			    if (isValid(counterAccount)) {
			        // 3. Look up counter account and make transfer object:
			        CheckingAccount acct = Accounts.findAcctByNumber(counterAccount);
			        
			        return new Transfer(this, acct, amount);
			    } else {
			        throw new BusinessException("Invalid account number!");
			    }
			}

	// tag::isValid[]
	public static boolean isValid(String number) {
	    int sum = 0;
	    for (int i = 0; i < number.length(); i++) {
	        sum = sum + (9 - i) * Character.getNumericValue(number.charAt(i));
	    }
	    return sum % 11 == 0;
	}
	// end::isValid[]
	
    public void addInterest() {
        Money interest = balance.multiply(INTEREST_PERCENTAGE);
        if (interest.greaterThan(0)) {
            balance.add(interest);
        } else {
            balance.substract(interest);
        }
    }
	

}