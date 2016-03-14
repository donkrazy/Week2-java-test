package prob3;

public class Money {
	private int amount;
    public Money(int amount) {
        this.amount = amount;
    }
    public Money add( Money money ) {
    	int result = amount + money.amount;
    	return new Money(result);
    }
    public Money minus( Money money ) {
    	int result = amount - money.amount;
    	return new Money(result);
    }
    public Money multiply( Money money ) {
    	int result = amount * money.amount;
    	return new Money(result);
    }
    public Money devide( Money money ) {
    	int result = amount / money.amount;
    	return new Money(result);
    }
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Money other = (Money) obj;
		if (amount != other.amount)
			return false;
		return true;
	}
    
}
