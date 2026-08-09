
import java.util.Scanner;

class userinput{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the name:");
        String name = sc.nextLine(); 
        System.out.println("Enter your Department:");
        String dept = sc.nextLine();
        System.out.println("Enter your CGPA:");
        float cgpa = sc.nextFloat();
        System.out.println("Enter your register number:");
        long reg_no = sc.nextLong();

sc.close();

        System.out.println("Name:" +name);
        System.out.println("Register Number:" +reg_no);
        System.out.println("Department:" +dept);
        System.out.println("CGPA:" +cgpa);
        
    }
}
