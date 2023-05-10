package hwLesson1;

public class HWexample2 {
    public static void main(String[] args) {

/*
деньги которые у нас есть - 1000 рублей
стоимость пиццы - 230 рублей
стоимость жвачки - 26 рублей
стоимость конфеты - 2,5 рубля Задача: представим себе что мы зашли в магазин, и наша задача: купить максимум возможных
пиц, затем на сдачу купить максимум жвачек, затем на оставшуюся сдачу купить конфет. В результате нам нужно сделать
математический просчет и вывести на консоль примерно вот такую информацию: На эти деньги мы можем купить:
4 пиццы
3 жвачки
0 конфет Сдача с магазина: 2 рубля.
 */
        int allSum = 1000;
        int pizza = 230;
        int gum = 26;
        double candy = 2.5;

        int pizzaMore = allSum / pizza;
        int allSumAfterPizza = allSum % pizza;
        int gumMore = allSumAfterPizza / gum;
        int allSumAfterGum = allSumAfterPizza % gum;
        int candyMore = (int) (allSumAfterGum / candy);
        double walletAfterGum = allSumAfterGum % candy;


        System.out.println("all my purchases");
        System.out.println("i buy " + pizzaMore + " pizza");
        System.out.println("i buy " + gumMore + " gum");
        System.out.println("i buy " + candyMore + " candy");
        System.out.println("I have money left: " + walletAfterGum);
    }
}
