public class Reduce {
    public static int main(int n) {

        int steps = 0;
        for (int i = n; i > 0;){

            if (i % 2 == 0) {
                i /= 2;
            }
            else {

                i -= 1;
            }
            steps++;

        }
        return steps;
    }
}
