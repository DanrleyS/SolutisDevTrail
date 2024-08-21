public class Q49FibonacciNumeros {
    public static void main(String[] args) {
        int n = 50;
        long[] fibonacci = new long[n];

        if (n > 0){
            fibonacci[0] = 0;
        }
        if (n > 1){
            fibonacci[1] = 1;
        }

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        for (int i = 0; i < n; i++) {
            System.out.println(fibonacci[i]);
        }
    }
}

