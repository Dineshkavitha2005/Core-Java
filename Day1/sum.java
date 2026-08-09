
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();
        int num3 =num1 + num2;
        System.out.println("The sum of the 2 numbers are:" + num3);
        sc.close();

    }
    
}
