
import java.util.Scanner;

public class nestedif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("Adult");
            if(age>=60){
                System.out.println("Old age");
            }
            else{
                System.out.println("Young");
            }
        }
        else{
            System.out.println("Minor");
            if(age<=10){
                System.out.println("Child");
            }
        }
        sc.close();
    }
    
}
