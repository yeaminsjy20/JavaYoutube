package class12;
import java.util.Scanner;

public class main {
    static void getInfo(String name, String nidNumber) {
        System.out.println("Name: " + name);
        System.out.println("NID Number: " + nidNumber);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your NID number: ");
        String nidNumber = input.nextLine();

        getInfo(name, nidNumber);
        input.close();
    }
}