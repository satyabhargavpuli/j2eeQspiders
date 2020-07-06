package com.in28min.exceptions;

class PredException extends Exception{
	
}

class Amount {
	
	private String currency;
	private int amount;
	public Amount(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Amount [currency=" + currency + ", amount=" + amount + "]";
	}
	public void add(Amount amt) throws Exception {
		if(!this.currency.equals(amt.currency)){
        throw  new PredException();	
}
		 this.amount=this.amount+amt.amount;
	}
}





public class ThrowingExceptionRunner  {

	public static void main(String[] args)throws Exception {
		
		Amount amount = new Amount("rupee", 20);
		Amount amount1 = new Amount("usd", 20);

		amount.add(amount1);
		System.out.println(amount);
	}
}
