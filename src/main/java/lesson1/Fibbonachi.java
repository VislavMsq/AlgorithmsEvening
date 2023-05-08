package lesson1;

public class Fibbonachi {
    public static void main(String[] args) {
        // 0 1 1 2 3 5 8 13 21 34 55 ...
        // 0 1 2 3 4 5 6 7  8
    }

    // найти 8 число фибиначи
    public static int fibbonachi(int n){
        if( n <= 1){
            return n;
        }
        return fibbonachi(n- 1) + fibbonachi(n -2);
    }
}
