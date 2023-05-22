package lesson2;

public class Task {
    public static void main(String[] args) {
        int money = 1000;
        int pizzaPrice = 230;
        int gymPrice = 26;
        double candyPrice = 2.5;
        int pizzaCount = 0;

        // долгий алгоритм
        while(money > pizzaPrice){           // 1*4
            money = money - pizzaCount;      // 2*4
            pizzaCount = pizzaCount + 1;     // 1*4
        }
        // 20
        pizzaCount = money / pizzaPrice;      // 2
        money = money % pizzaPrice;           // 2
        // 4
        int gymCount = money / gymPrice;      // 2
        money = money % gymPrice;             // 2
        int candyCount = (int) (money / candyPrice);    // how many candies could we buy
        money = money - (int)(candyPrice * candyCount);


    }
}
