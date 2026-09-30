package class18;

public class main {
    tatic int getSum(int x, int y) {
        int sum = x + y;

        return sum;
    }
    
    public static void main(String[] args) {
        System.out.println("Program Start:");
        sayHi();

        int addition = getSum(100, 50);
        System.out.println("Result: " + addition);
    }

    static void sayHi() {
        System.out.println("Hi");
    }
    
}
