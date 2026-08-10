
import java.util.Scanner;

public class ProfitorLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value:");
        int num = sc.nextInt();
        if(num==0){
            System.out.println("No profit or loss");
        }
        else if (num>0){
            System.out.println("Profit");
        }
        else{
            System.out.println("Loss");
        }
        sc.close();
        }
        }
    
