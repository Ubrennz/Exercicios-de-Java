import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Type your name: ");
        String name = sc.nextLine();
        System.out.print("Type the year that you were born: ");
        int year = sc.nextInt();
        
        int age = 2025 - year;
        System.out.printf("Hello %s, you're %d years old :)%n", name, age);
    }
}