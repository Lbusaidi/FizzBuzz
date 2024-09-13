public class Multiples {

    public static int main(int n, int a, int b) {

        int count = 0;
        for (int i = 1; i < n; i++) {

            // Find out if divisible by 3 or 5.
            boolean divisibleBya = i % a == 0;
            boolean divisibleByb = i % b == 0;

            // update count
            if (divisibleBya || divisibleByb) {
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {

        int defaultN = 1000;
        int defaultA = 3;
        int defaultB = 5;

        int result = main(defaultN, defaultA, defaultB);
        System.out.println(result);
    }

    }

