public class FactorialRecursion {
    public static void main(String[] args) {
        int number = 5; // Замініть це число на бажане
        long factorial = calculateFactorialRecursively(number);
        System.out.println("Факторіал " + number + " = " + factorial);
    }

    public static long calculateFactorialRecursively(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorialRecursively(n - 1);
        }
    }
}
