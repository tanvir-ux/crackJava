class Fib {
    public static void main(String[] args) {
        allFib(50);
    }

    public static void allFib(int n) {
        for(int i=0; i < n; i++) {
            System.out.println(i + " : " + fib(i));
        }
    }

    public static int fib(int n) {
        if(n <= 0) return 0;
        else if(n == 1) return 1;
        return fib(n-1) + fib(n-2);
    }

    // works fine upto n value of 45 ok


}

