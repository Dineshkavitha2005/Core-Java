
import java.util.Scanner;

public class MultiplicationTable{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value(multiply num):");
        int n=sc.nextInt();
        System.out.println("Enter the m value:");
        int m= sc.nextInt();
        for(int i=1; i<=m; i++){
            System.out.println(i+" * "+n+" = "+i*n);
        }
sc.close();
    }
}
