import java.util.Scanner;
public class EuclideanAlgorithm {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number.");
        int num1 = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please enter second number.");
        int num2 = scanner.nextInt();
        int steps = 0;
        int dividend = num1;
        int divisor = num2;
        int gcd;
        int quotient;
        int remainder;
        System.out.printf("Finding the greatest common divisor of %d and %d.\n",num1,num2);

        if(divisor > dividend){
            System.out.println("The inputs would have caused an unnecessary step.");
            int swap = divisor;
            divisor = dividend;
            dividend = swap;
        }
        else{
            System.out.println("An extra step was avoided.");
        }
        do{
            steps++;
            quotient = dividend / divisor;
            remainder = dividend % divisor;
            System.out.printf("Steps %d: %d = %d * %d + %d\n",steps,dividend,divisor,quotient,remainder);
            gcd = divisor;
            dividend = divisor;
            divisor = remainder;
        }
        while(remainder != 0);

        System.out.println("The GCD is " + gcd + ".");

        switch(steps){
            case 1:
                System.out.println("Only one step was needed!");
                break;
            case 2:
                System.out.println("Two steps were taken!");
                break;
            case 3:
                System.out.println("This process took three steps.");
                break;
            case 4:
                System.out.println("Wow! Four steps.");
                break;
            default:
                System.out.println(steps + " steps is a lot of steps!");
                break;
        }
        if(gcd == 1){
            System.out.println(num1 + " and " + num2 + " are relatively prime.");
        }
        else{
            System.out.println(num1 + " and " + num2 + " are not relatively prime.");
        }



    }
}
