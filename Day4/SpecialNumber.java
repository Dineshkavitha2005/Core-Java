import java.util.Scanner;
public class SpecialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting number:");
        int m= sc.nextInt();
        System.out.println("Enter the last number:");
        int n= sc.nextInt();
        for(int i=m; i<=n;i++){
            int digit1= i%10;
            int digit2= i/10;
            int sum = digit1 + digit2;
            int product = digit1 * digit2;
             int result = sum + product;       
            if(result==i){
                System.out.print(i+ " ");
            }
sc.close();
        }
    }
}
