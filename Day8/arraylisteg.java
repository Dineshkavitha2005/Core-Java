import java.util.*;
public class arraylisteg {
    public static void main(String[] args) {
        // Declare Arraylist -> String
        ArrayList<String> list = new ArrayList<>();
        // add() --> to insert the element at the end of the arraylist
        list.add("is");
        list.add("a");
        //  To add the element before addlast element of the list 
        System.out.println("Add:"+ list.add("Very"));
        // addFirst() --> to add the element at the front of the array
        list.addFirst("He");
        // addLast() --> to ensure adding elemenet at the end of the list
        list.addLast("Good");
        list.addLast("Boy");
        // set() --> to replace the element in an specific index position
        list.set(4, "bad");
        // list.add(index_value, element) --> to add an specific element at specific index location
        list.add(2, "also");
        // To print the arraylist
        System.out.println("List:" + list); 
        // to find the size of the array list
        System.out.println("Size:"+ list.size()); 
        // get(index) --> to retrive an single element in a list
        System.out.println("Second element:"+ list.get(2));
        // to retrive all the element in alist
        System.out.println("Using for loop to retrive the list:");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        // to retrive element using for-each loop
        System.out.println();
        System.out.println("Using for-each loop to retrive the list:");
        for(String s:list){
            System.out.print(s+" ");
        }
        System.out.println();
        // remove() --> using object
        list.remove("Boy");
        // remove() --> using index
        list.remove(4);
        Collections.sort(list);
        System.out.println(list);
        ArrayList<Integer>nums=new ArrayList<>();
        nums.add(5);
        nums.add(3);
        nums.add(6);
        // sort the list
        Collections.sort(nums);
        System.out.println(nums);
    }
    
}
