
import java.util.Arrays;

public class UtilityMethods {

    // 1. Check whether a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        int i = 2;
        while (i <= n / i) {
            if (n % i == 0) {
                return false;
            }
            i++;
        }

        return true;
    }

    // 2. Convert Celsius to Fahrenheit
    public static double cToF(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    // 3. Count vowels, ignoring case
    public static int countVowels(String str) {
        if (str == null) {
            return 0;
        }

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));

            if (ch == 'a' || ch == 'e' || ch == 'i'
                    || ch == 'o' || ch == 'u') {
                count++;
            }
        }

        return count;
    }

    // 4. Format salary using the dollar sign
    public static String format(double salary) {
        return "$" + salary;
    }

    // Overloaded format method
    public static String format(double salary, String currencySymbol) {
        return currencySymbol + salary;
    }

    // 5. Find the maximum of two integers
    public static int getMax(int a, int b) {
        return Math.max(a, b);
    }

    // Overloaded method: maximum of three integers
    public static int getMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    // 6. Reverse an array in place
    public static void reverse(int[] arr) {
        if (arr == null) {
            return;
        }

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    // 7. Find the index of the smallest element
    public static int getMinIndex(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int minIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }

        return minIndex;
    }

    // 8. Merge two arrays
    public static int[] merge(int[] a, int[] b) {
        if (a == null) {
            a = new int[0];
        }

        if (b == null) {
            b = new int[0];
        }

        int[] result = new int[a.length + b.length];

        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);

        return result;
    }

    // 9. Check whether a string is a palindrome
    public static boolean isPalindrome(String text) {
        if (text == null) {
            return false;
        }

        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            char first = Character.toLowerCase(text.charAt(left));
            char last = Character.toLowerCase(text.charAt(right));

            if (first != last) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }

    // 10. Return the nth Fibonacci number
    public static int getFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException(
                "n must be non-negative"
            );
        }

        if (n <= 1) {
            return n;
        }

        int first = 0;
        int second = 1;
        int i = 2;

        while (i <= n) {
            int next = first + second;
            first = second;
            second = next;
            i++;
        }

        return second;
    }

    // Main method to test all utility methods
    public static void main(String[] args) {
        System.out.println("Prime: " + isPrime(7));
        System.out.println("Celsius to Fahrenheit: " + cToF(25));
        System.out.println("Vowels: " + countVowels("Hello World"));

        System.out.println("Salary: " + format(50000.0));
        System.out.println("Salary: " + format(50000.0, "Rs. "));

        System.out.println("Max of two: " + getMax(10, 20));
        System.out.println("Max of three: " + getMax(10, 20, 15));

        int[] arr = {1, 2, 3, 4, 5};
        reverse(arr);
        System.out.println("Reversed array: " + Arrays.toString(arr));

        int[] numbers = {8, 3, 6, 2, 9};
        System.out.println("Minimum index: " + getMinIndex(numbers));

        int[] merged = merge(new int[]{1, 2, 3}, new int[]{4, 5, 6});
        System.out.println("Merged array: " + Arrays.toString(merged));

        System.out.println("Palindrome: " + isPalindrome("Madam"));
        System.out.println("Fibonacci: " + getFibonacci(6));
    }
}
