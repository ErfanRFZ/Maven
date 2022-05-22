package lib;

public class Fibonacci {
    public static int fn(int n)
    {
        if (n <= 1) {
            return n;
        }

        return fn(n - 1) + fn(n - 2);
    }
}
