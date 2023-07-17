public class Main {
    public static void main(String[] args) {
        int a = 40;

        long startTime2 = System.nanoTime();
        System.out.println(fib2(a));
        long endTime2 = System.nanoTime();
        long startTime3 = System.nanoTime();
        System.out.println(fib3(a));
        long endTime3 = System.nanoTime();

        System.out.println("time: " + (endTime2 - startTime2));
        System.out.println("time: " + (endTime3 - startTime3));

    }

    public static int fib(int n) {
        if (n < 1)
            return -1;
        if (n == 1)
            return 0;
        if (n <= 3)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }

    public static int fib2(int n) {
        if (n <= 0)
            return -1;
        if (n == 1)
            return 0;
        if (n <= 3)
            return 1;
        return fib2(n, 0, 1);
    }

    public static int fib2(int n, int left, int right) {
        if (n <= 2)
            return right;
        return fib2(n - 1, right, left + right);
    }

    public static int fib3(int n) {
        int left = 0;
        int right = 1;
        if (n <= 0)
            return -1;
        if (n == 1)
            return 0;
        for (int i = 2; i < n; i++) {
            right = left + right;
            left = right - left;
        }
        return right;
    }


}