
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        Float num1 = sc.nextFloat();
        System.out.println("Enter the operator:");
        char ch = sc.next().charAt(0);
        System.out.println("Enter the value of b:");
        Float num2 = sc.nextFloat();
        switch (ch) {
            case '+':
                System.out.println("Sum:" + (num1+num2));
                break;
            case '-':
                System.out.println("Subtraction:" + (num1-num2));
                break;
            case '*':
                System.out.println("Division:" + (num1*num2));
                break;
            case '/':
                System.out.println("Division:" + (num1/num2));
                break;
            default:
                System.out.println("Invalid Input.");
                break;
        }
        sc.close();
    }
    
}
