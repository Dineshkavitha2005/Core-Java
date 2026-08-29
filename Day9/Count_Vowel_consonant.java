
import java.util.Scanner;

public class Count_Vowel_consonant {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        int vowels=0;
        int consonants=0;

        // Approach 1
        for(int i=0;i<str.length();i++){
            char ch =str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowels++;
            }
            else{
                consonants++;
            }
            
            /*  Approach 2
            String vowel = "aeiou";
            if(vowel.contains(ch+"")){
                vowels++;
            }
            else{
                consonants++;
            }
            */

        }
        System.out.println("Vowels: "+ vowels + " Consonants: "+ consonants);
        sc.close();
    }
    
}
