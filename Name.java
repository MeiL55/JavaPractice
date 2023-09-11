import java.util.Scanner;
public class Name {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        scanner.nextLine();//
        int age = scanner.nextInt();
        System.out.println("Hello, "+name+"! Your age is "+ age +" years old!");
    }
}
