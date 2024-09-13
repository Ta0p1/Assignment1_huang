public class Multiples {
    public static int multiples(String[] args) {
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % a == 0 && i % b == 0) {
                count++;
            }
        }
        int n = Integer.parseInt(args[0]);
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);
        int result = count;
        System.out.println(result);
    }
}
