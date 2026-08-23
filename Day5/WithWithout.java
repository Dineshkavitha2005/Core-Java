public class WithWithout {
    // with return type and without argument
    public int addvalue(){
        int a=5;
        int b=4;
        int sum= a+b;
        return sum;
    }
    public static void main(String[] args) {
        WithWithout obj = new WithWithout();
        int res = obj.addvalue();
        System.out.println("Result:"+ res);
    }
}