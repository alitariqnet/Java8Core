package com.ali.project.Java8Core.equalsandhashcode;

import java.util.Objects;

public class Money {
    int amount;
    String currencyCode;

//    @Override
//    public boolean equals(Object o){
//        if(o==this){
//            return true;
//        }
//        if(!(o instanceof Money)){
//            return false;
//        }
//        Money other = (Money)o;
//        boolean currencyCodeEquals = (this.currencyCode==null && other.currencyCode==null)||
//                (this.currencyCode!=null &&this.currencyCode.equals(other.currencyCode));
//        return (this.amount==other.amount) && currencyCodeEquals;
//    }
//    @Override
//    public int hashcode(Object o){
//
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money money = (Money) o;
        return amount == money.amount && Objects.equals(currencyCode, money.currencyCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, currencyCode);
    }
}
