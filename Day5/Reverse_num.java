public class Reverse_num {
    public int reversenumber(int n){
        int rev = 0;
        while(n>0){
            int rem=n%10;
            rev = rev*10 + rem;
            n=n/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        Reverse_num obj = new Reverse_num();
        System.out.println("Reverse of number 1234 is :"+ obj.reversenumber(1234));
        System.out.println("Reverse of number 9876 is :"+ obj.reversenumber(9876));
        System.out.println("Reverse of number 5296 is :"+ obj.reversenumber(5296));
    }   
}
