package hwLesson1;

import java.util.Random;

public class HWexample1 {
    public static void main(String[] args) {
/*
1.Что такое алгоритм (можно своими словами)
    Метод решения поставленной задачи путем максимальной ее эффективности.
2.Какие основные параметры алгоритма?
    space complexity - кл-во памяти которые ты потратишь на свою задачу
    time complexity - кл-во времени
3.Какие основные способы описания алгоритма существуют?
    - блок-схемы
    - псевдокод
    - реальный код
    - простое описаине тектом
4.Какие факторы учитываются при построении алгоритма? В чем они измеряются? Опишите алгоритм и
    напишите код для следующих задач (сделайте оценку сколько потребовалось памяти и времени):
5.Дан массив из 10 чисел (заполните любыми числами в промежутке от -100 до 100), необходимо найти
    сумму всех положительных чисел
 */
//   Вариант 1
        //
        int[] arr = new int[10];
        Random random = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(201) - 100;
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sum += arr[i];
            }
        }
        System.out.println("sum of all positive numbers: " + sum);
    // Вариант 2
        int[] arr2 = {-80,90,14,19,66,-75,33,-55,20,-4};
        int sum2 = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] > 0){
                sum2 += arr2[i];
            }
        }
        System.out.println("sum of all positive numbers: " + sum2);
    }
}

