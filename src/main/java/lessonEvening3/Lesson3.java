package lessonEvening3;

public class Lesson3 {


        void method(int n) {
            for (int i = 0; i < n / 2; i++) {               // n/2 -> 0(n/2) = 0(n)
                for (int j = 1; j + n / 2 <= n; j++) {      // n/2 -> 0(n/2) = 0(n)
                    for (int k = 1; k <= n; k = k * 2) {    // -0(1) > 0(..) < 0(n)
                        System.out.println("I am expert!");
                    }
                }
            }

        }
    }

