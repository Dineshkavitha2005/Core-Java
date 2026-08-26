
import java.util.Scanner;

public class SumofArray {
    public static int  addarray(int[]num){
        int sum=0;
        for(int i=0;i<num.length;i++){
            sum=sum+num[i];
        }
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n=sc.nextInt();
        System.out.println("Enter the values: ");
        int [] num=new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        // Call the method
        int res = addarray(num);
        System.out.println("Sum: "+ res);
        sc.close();
    }
    
}
