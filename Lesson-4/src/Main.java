public class Main {
    public static void main(String[] args) {
        System.out.println(Fibo(7));

    }

    public static void prinfF(int n) {
        if (n > 9) {
            return;
        }
        System.out.println("Start: " + n);
        prinfF(n + 1);
        System.out.println("end: " + n);
    }

    public static int GiaiThua(int n) {
        if (n == 0) {
            return 1;
        }
        return n * GiaiThua(n - 1);
    }

    public static int Fibo(int n) {
        if (n <= 2) {
            return 1;
        }
        return Fibo(n - 1) + Fibo(n - 2);
    }

    public int fib(int n) {
        int n1 = 0;
        int n2 = 1;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        for (int i = 1; i < n; i++) {
            int temp = n1;
            n1 = n2;
            n2 = n1 + temp;
        }
        return n2;
    }

    public void reverseString(char[] s) {
        hoanvi(s, 0, s.length - 1);
    }

    public void hoanvi(char[] s, int start, int end) {
        if (start >= end) {
            return;
        }
        char c = s[start];
        s[start] = s[end];
        s[end] = c;
        hoanvi(s, start + 1, end - 1);
    }

}


}
