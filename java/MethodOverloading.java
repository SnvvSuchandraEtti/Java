public class MethodOverloading {
    static void add(int a, int b) {
        System.out.println(a + b);
    }

    static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    static void add(double a, double b) {
        System.out.println(a + b);
    }

    static void add(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }

    static int max(int a, int b) {
        return a < b ? b : a;
    }

    public static void main(String[] args) {
        int a = 10, b = 5, c = 9;
        add(a, b);
        add(a, b, c);
        int[] ar = {10, 30, 40, 50};
        int n = 4;
        add(ar, n);
        System.out.println(max(5, 10));
    }
}