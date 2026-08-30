public class Arraytype1{
    public static void main(String[] args) {
        // type 1- using new keyword
        int size=3;
        int[] nums= new int[size];
        // initialize the array value
        nums[0]=10;
        nums[1]=20;
        nums[2]=30;
        // print array
        for(int i=0;i<size;i++){
         System.out.println(nums[i]);   
        }
    }
}