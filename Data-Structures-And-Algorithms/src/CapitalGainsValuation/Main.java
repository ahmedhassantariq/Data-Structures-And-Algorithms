package CapitalGainsValuation;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //Mar 15: Buy 100 Share @ $25/share
        Valuation.bought.add(new Transaction(100,25, new Date(2022,3,15)));
        //Jun 10: Sell 60 Share @ $30/share
        Valuation.sold.add(new Transaction(60,30, new Date(2022,6,10)));
        //Aug 20: Buy 200 Share @ $20/share
        Valuation.bought.add(new Transaction(200,20, new Date(2022,8,20)));
        //Oct 25: Sell 240 Share @ $55/share
        Valuation.sold.add(new Transaction(240,50, new Date(2022,10,25)));

        //Return Gains
        System.out.println(Valuation.valuate());
    }
}
