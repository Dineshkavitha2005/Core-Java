
import java.util.Scanner;

public class Reversearray {
    public static void reversearray(int[]nums){
        int l =0;
        int r =nums.length-1;
        while(l<r){
                int temp=nums[l];
                nums[l]=nums[r];
                nums[r]=temp;
                l++;
                r--;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = scan.nextInt();
        System.out.println("Enter the values: ");
        int[]nums=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=scan.nextInt();
        }
        reversearray(nums);
        System.out.println("After reversing: ");
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+ " ");
            }
            scan.close();
        }
    }