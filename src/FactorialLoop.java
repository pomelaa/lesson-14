public class FactorialLoop {
    public static void main(String[] args) {
        int number = 5; // Замініть це число на бажане
        long factorial = calculateFactorialUsingLoop(number);
        System.out.println("Факторіал " + number + " = " + factorial);
    }

    public static long calculateFactorialUsingLoop(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Число повинно бути не менше 0");
        }

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}

