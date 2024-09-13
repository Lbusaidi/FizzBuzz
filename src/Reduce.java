public class Reduce {
    public static void main(String[] args) {

        int steps = 0;
        for (int n = 100; n > 0;){

            if (n % 2 == 0) {
                n /= 2;
            }
            else {

                n -= 1;
            }
            steps++;

        }
        System.out.println(steps);
    }
}
