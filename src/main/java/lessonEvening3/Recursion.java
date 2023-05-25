package lessonEvening3;

public class Recursion {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println(sum);
        int sumRec = recFunk(10);
        System.out.println(sumRec);
    }

    public static int recFunk(int n) {
        if (n <= 0) {
            return 0;
        }
        return  n + recFunk(n -1);
    }
}
