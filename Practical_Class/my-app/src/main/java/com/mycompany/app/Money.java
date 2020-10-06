package com.mycompany.app;

abstract class Money {
    protected int amount;
   Money(int amount){
       this.amount = amount;
   }
   static Dollar dollar(int amount)  {
    return new Dollar(amount);
 }
 
    static Money franc(int amount) {
        return new Franc(amount);
 }   

 abstract Money times(int multiplier); 

    public boolean equals(Object object)  {
       Money money = (Money) object;
       return amount == money.amount && getClass().equals(money.getClass());
    }
}
