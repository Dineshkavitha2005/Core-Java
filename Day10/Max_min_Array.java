import java.util.Scanner;
public class Max_min_Array {

    // For finding minimum value
    public static void findMin(int[]nums){
        int min = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        System.out.println("The minimum value is : "+ min);
    }

    // For finding maximum value
    public static void findMax(int[]nums){
        int max= nums[0];
        for(int i=1;i<nums.length;i++){
            if (nums[i]>max){
                max=nums[i];
            }
        }
        System.out.println("The Maximum value is : "+max);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n =sc.nextInt();
        System.out.println("Enter the values:");
        int [] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }

// Methods to find maximum value
        findMax(nums);
        
// Method to find minimum
        findMin(nums);
        sc.close();
    }
}