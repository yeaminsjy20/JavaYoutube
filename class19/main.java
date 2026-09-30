package class19;

import java.util.Scanner;

public class main {
    static int add(int x, int y) {
        int result = x + y;
        return result;
    }

    static int subtract(int x, int y) {
        int result = x - y;
        return result;
    }

    static int multiply(int x, int y) {
        int result = x * y;
        return result;
    }

    static int divide(int x, int y) {
        int result = x / y;
        return result;
    }
        
    public static void main(String[] args) {
        int x, y;
        System.out.println("Please enter the value of x and y:");
        
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        sc.close();

        int sum = add(x, y);
        System.out.println("Addition Output: " + sum);

        int diff = subtract(x, y);
        System.out.println("Subtraction Output: " + diff);

        int prod = multiply(x, y);
        System.out.println("Multiplication Output: " + prod);

        if (y != 0) {
            int quot = divide(x, y);
            System.out.println("Division Output: " + quot);
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }



}
