
import java.util.Scanner;

public class Greatest_of_three_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number:");
        int num1= sc.nextInt();
        System.out.println("Enter the 2nd number:");
        int num2= sc.nextInt();
        System.out.println("Enter the 3rd number:");
        int num3= sc.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println("Number 1 is greatest and the number is:" + num1);
        }
        else if(num2>num3 && num2>num1){
            System.out.println("Number 2 is greatest and the number is:" + num2);
        }
        else{
            System.out.println("Number 3 is greatest and the number is:" + num3);
        }
        sc.close();
    }
    
}
