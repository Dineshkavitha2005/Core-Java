import java.util.Scanner;

class Find_prime_num {
    static void findPrimes(int num) {
        boolean[] prime = new boolean[num + 1];
        for (int i = 2; i * i <= num; i++) {
            if (prime[i] == false) {
                for (int j = i * i; j <= num; j += i) {
                    prime[j] = true;
                }
            }
        }
        System.out.println("Prime numbers:");
        for (int k = 2; k <= num; k++) {
            if (prime[k] == false) {
                System.out.print(k + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        findPrimes(num);
        sc.close();
    }
}