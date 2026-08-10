
import java.util.Scanner;

public class ifelseif {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = in.nextInt();
        if(age<=3){
            System.out.println("Child");
        }
        else if(age>=4 && age<=12){
            System.out.println("Kid");
        }
        else if(age>=13 && age<=18){
            System.out.println("Teenager");
        }
        else if(age>=19 && age<=60){
            System.out.println("Adult");
        }
        else{
            System.out.println("Old Age");
        }
        in.close();
    }
    
}
