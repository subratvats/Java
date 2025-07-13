public class BasicPrograms {

    // 1. Check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        int original = number, reversed = 0;
        while (number > 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return original == reversed;
    }

    // 2. Calculate factorial using recursion
    public static long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    // 3. Print first n Fibonacci numbers
    public static void printFibonacci(int n) {
        int a = 0, b = 1;
        System.out.print("Fibonacci: " + a + " " + b + " ");
        for (int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
        System.out.println();
    }

    // 4. Check if number is prime
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    // 5. Reverse a string
    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }


    public static void main(String[] args) {
        int number = 121;
        System.out.println(number + " is palindrome? " + isPalindrome(number));

        int factInput = 5;
        System.out.println("Factorial of " + factInput + " is " + factorial(factInput));

        printFibonacci(10);

        int primeCheck = 17;
        System.out.println(primeCheck + " is prime? " + isPrime(primeCheck));

        String word = "hello";
        System.out.println("Reverse of " + word + " is " + reverseString(word));
    }
}
