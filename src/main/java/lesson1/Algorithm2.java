package lesson1;

public class Algorithm2 {
    public static void main(String[] args) {
       /*
        input: arr[] , x
        for elem in arr
        begin
        if elem == x then return true
        end
        return false
        */

        //Найти число x  в массиве из 10 чисел
        //1. принять число х и массив из 10 чисел
        //2. пройтись по всем числам массива
        //3. если число нашли - вернуть true
        //4. иначе вернуть - false

        int[] arr = {1, 3, 2, 16, 4, 3, 6, 7, 0, 98, 55, 34};
        System.out.println(findNumberInArray(arr, 5));      // false
        System.out.println(findNumberInArray(arr, 100));    // false
        System.out.println(findNumberInArray(arr, 98));     // true
        System.out.println(findNumberInArray(arr, 3));      // true

    }
    // метод для поиска числа в массиве
    public static boolean findNumberInArray(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {  // space complexity - 1
            if (arr[i] == x) {  // time complexity размер массива
                return true;
            }
        }
        return false;
    }
}

