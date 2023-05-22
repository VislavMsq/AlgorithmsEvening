package lesson2;

public class Task2 {
    public static void main(String[] args) {
        int sum = 0;
        int n = 100;
        for (int i = 0; i < n; i++) {               // O(n)
            for (int j = 0; j <= n * 5; j++) {      // J(5*n) = O(n)
                sum = sum + i - j;
            }
        }
        // O(n^2)
        int secondSum = 0;
        for (int i = 0; i < n; i++) {   // O(n)
            secondSum = secondSum + i;
        }
        // O(n^2) + o(n) = O(n^2 + n) = O(n^2)
        // O(n^2 + n) = O(n*(n+1)) = O(n) * O(n) = O(n^2)

        // О - асемптотически - то как быстро растет кл-во операций при n действий
        // n-> O(n) * O(5*n) = O(n * 5*n) = O(n^2)
        // x -> x^2 * constant
        // y -> y^2 * constant

        // n - константа в формуле
        // n -> 3 * n -> 0(3 * n) = 0(n)
        // 10 -> 30
        // 100 -> 300
        // 1000 -> 3000
        System.out.println(sum);
    }

    public static void consnantTimeAlgorithm() {
        // задача коммивояжёра - одна из самых тяжелых в исполнении

        // O(1) - константная сложность
        // O(log(n)) - логорифмическая сложность
        // O(n) - линейная сложность
        // O(n* log(n)) - линейно-логарифмическая сложность
        // O(n^2) - квадратичная сложность
        // O(n^3) - кубическая сложность

        int paramOne = 1000;
        int paramTwo = 670000;
        int sum = paramOne + paramTwo;  // f(x) = 1
        // O(f(x)) = O(2 * 1) = O(1)
        int[] array = {10, 18, 17, 6, 5, 34, 23, 5454};
        int n = 1;  // n -> 0 до размера массива -1
        System.out.println(array[n]);   // O(1) - когда достаешь из массива используешь только одну операцию, т.е за константное вреся

        // найти индекс элемента по входному значению - поиск по значению
        int x = 34;
        int[] arrayCope = new int[array.length];    // O(n)
        for (int i = 0; i < array.length; i++) {    // n -> O(n)
            if(array[i] == x){
                System.out.println(i);
            }
            arrayCope[i] = array[i];
        }
    }
}
