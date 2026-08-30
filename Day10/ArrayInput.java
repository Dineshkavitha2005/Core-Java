
import java.util.Scanner;

public class ArrayInput {
    static void printArray(String[]names) {
        // print an array
        System.out.println("Names:");
        for(int i=0;i<names.length;i++){
            System.out.println(names[i]+" ");
        }
        
    }
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the Size of the array:");
        int size = scan.nextInt();
        // Declaring array
        String names[]=new String[size];
        System.out.println("Enter the names:");
        // user input for array
        for(int i=0;i<size;i++){
            names[i]=scan.next();
        }
        // calling method to print array
        printArray(names);
        scan.close();
    }
    
}
