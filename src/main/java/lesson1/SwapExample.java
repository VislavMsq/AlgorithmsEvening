package lesson1;

public class SwapExample {
    public static void main(String[] args) {
// 1 задача
        // берем третью переменную туда копируем первую переменную,
        // берем вторую переменную, копируем ее в первую
        // третью переменную копируем во вторую
        int a = 3;
        int b = 4;
        int tmp = a;    // третья переменная
        a = b;
        b = tmp;

// 2 задача
        // к первой переиенной прибавить вторую (а+b)
        // во вторую переменную запаисать разницу между первой и второй (a-b)
        // в первую переменную записать разницу между первой и второй

        // input a, b
        // a = a + b
        // b = a - b
        // a = a - b

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);

        // написать псевдокод для агритма:
        // сложить три числа и вывести сумму

        System.out.println(addNum(2,3,4));


    }

    public static int addNum(int a, int b, int c) {
        return a + b + c;
    }
}
