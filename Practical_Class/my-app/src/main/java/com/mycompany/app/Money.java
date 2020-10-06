package com.mycompany.app;

abstract class Money {
    protected int amount;
    private String currency;
  
    static Dollar dollar(int amount)  {
    return new Dollar(amount, "USD");
 }
 
    static Money franc(int amount) {
        return new Franc(amount, "CHF");
 } 
   
    Money(int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }
 
 
 abstract String currency();
 
 abstract Money times(int multiplier); 

    public boolean equals(Object object)  {
       Money money = (Money) object;
       return amount == money.amount && getClass().equals(money.getClass());
    }
}
