
import java.util.Scanner;

public class Count_frequent_array_nums {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n=sc.nextInt();
        int [] nums= new int[n];
        System.out.println("Enter the values: ");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        
        int len=nums.length;
        boolean visited[]= new  boolean[len];
        for (int i = 0; i < len; i++) {
            if(visited[i]==false){
                int count=1;
                visited[i]=true;
                for(int j=i+1;j<len;j++){
                    if(nums[i]==nums[j]){
                        count++;
                        visited[j]=true;
                    }
                }
                System.out.println("Number: "+nums[i]+" --> "+"Count: "+count);
            }
        }
        sc.close();
    }
    }

