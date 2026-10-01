package week02.class5;

public class Main {
    public static void main(String[] args) {
        int age = 19;

        if(age < 2) {
            System.out.println("Infant");
        }else if(age >= 2 && age < 10) {
            System.out.println("Child");
        }else if(age < 20) {
            System.out.println("Teenage");
        }else if(age < 30) {
            System.out.println("Adult");
        }else {
            System.out.println("Old");
        }
    }
}
