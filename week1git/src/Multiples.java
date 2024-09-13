public class Multiples {
    public static int multiples(int n, int a, int b) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % a == 0 && i % b == 0) {
                count++;
            }
        }
        return count;
    }

    public static int main(String[] args) {

        int n = Integer.parseInt(args[0]);
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);

        return multiples(n, a, b);
    }
}

