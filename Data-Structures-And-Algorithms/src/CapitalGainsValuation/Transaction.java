package CapitalGainsValuation;

import java.util.Date;

public class Transaction {
    public int count;
    public int price;
    public Date date;

    public Transaction(int count, int price, Date date) {
        this.count = count;
        this.price = price;
        this.date = date;
    }

}
