package lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        int q = 3;
        int w = 6;
        int e = 4;

        if(q + w > e && q + e > w && w + e > q){
            System.out.println(true);
        }else {
            System.out.println(false);
        }
    }
}
