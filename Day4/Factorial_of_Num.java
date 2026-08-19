import java.util.Scanner;
public class Factorial_of_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int fact=1;
        for(int i=2; i<=n; i++){
            fact=fact*i;
        }
        System.out.println("The factorial of the given number is: "+ fact);
    sc.close();
    }    
}