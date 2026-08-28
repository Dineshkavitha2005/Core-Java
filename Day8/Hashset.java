import java.util.HashSet;

public class Hashset {
    public static void main(String[] args) {
        // Declaring hashset
        HashSet<Integer> set = new HashSet<>();
        // add() --> to add the element in set
        set.add(5);
        set.add(15);
        set.add(8);
        set.add(29);
        set.add(206);
        System.out.println("Original Hashset: "+set);
        // Again adding the 15 , it doesn't allow duplicate inside the hashset
        set.add(15);
        System.out.println("After adding again 15: "+ set);
        // to check element is contains by hashset or not 
        System.out.println("is 15 contains? --> "+ set.contains(15));
        // remove element
        set.remove(206);
        System.out.println("After removing 206: "+ set);
        // to iterate over hashset
        System.out.println("The iteration of the set: ");
        for(int num:set){
            System.out.print(num+" ");
        }
        // remove everything from hashset
        set.clear();
    }    
}
