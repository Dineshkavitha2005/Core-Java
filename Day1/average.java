
import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First number:");
        Float num1 = sc.nextFloat();
        System.out.println("Enter the second number:");
        Float num2 = sc.nextFloat();
        Float sum = num1 + num2;
        Float avg = sum/2;
        System.out.println("The avarege of the given number is: " + avg);
        sc.close();

    }
    
}
