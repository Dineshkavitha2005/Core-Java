public class printing {
    public static void main(String[] args) {
        String name = "Rajesh";
        int age = 20;
        double salary = 97500.0245;
        //System.out.println("Name:" +name+ ", Age:" +age);
        System.out.printf("Name: %s, Age: %d%n" ,name,age);
        // Formatting
        // %n - used for creating new line or next line.
        System.out.printf("Salary: $%,.2f", salary);
    }
    
}
