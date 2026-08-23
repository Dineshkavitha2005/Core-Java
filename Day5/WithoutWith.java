public class WithoutWith {
    // without return type with argument
    public void addvalue(int a , int b){
        int sum = a+b;
        System.out.println("Sum:"+ sum);
    }
    public static void main(String[] args) {
        WithoutWith obj = new WithoutWith();
        obj.addvalue(8,5);
        obj.addvalue(10,20);

    }
    
}
