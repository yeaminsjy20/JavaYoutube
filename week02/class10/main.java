package week02.class10;
public class main {
public static void main(String[] args) throws Exception {
        int sum = 0;
        int i = 5;
        while(i <= 100) {
            sum = sum + i;
            i = i + 5;
        }

        System.out.println("Sum is: " + sum);
    }
}