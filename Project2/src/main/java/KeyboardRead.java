import java.util.Scanner;

public class KeyboardRead {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Enter your Full name");
//        String name = sc.next();
        String name = sc.nextLine();
        System.out.println("My name is "+ name);
        System.out.println("Enter your age");
        int age;
        age = sc.nextInt();
        System.out.println("My age is " + age);
    }
}
