package CapitalGainsValuation;

import java.util.ArrayList;
import java.util.Queue;

public class Valuation {
    public static ArrayList<Transaction> bought = new ArrayList<>();
    public static ArrayList<Transaction> sold = new ArrayList<>();
    private static Transaction buy;
    private static Transaction sell;
    private static int gains = 0;


    public static int valuate() {
        while (!bought.isEmpty() && !sold.isEmpty()) {
            buy = bought.get(0);
            sell = sold.get(0);
            if (buy.count < sell.count) {
                gains += buy.count * (sell.price - buy.price);
                bought.remove(0);
                sold.get(0).count = sold.get(0).count - buy.count;
            } else {
                gains += sell.count * (sell.price - buy.price);
                sold.remove(0);
                if (buy.count == sell.count) {
                    bought.remove(0);
                } else {
                    bought.get(0).count = bought.get(0).count - sell.count;
                }
            }
        }
        return gains;
    }

}
