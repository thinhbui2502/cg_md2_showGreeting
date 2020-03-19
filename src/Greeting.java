import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter your name!");

        String name = scn.nextLine();
        System.out.println("Hello" + name);
    }
}
