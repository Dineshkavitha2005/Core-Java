public class WithWith {
    // with return type and with argument
    public int  addvalue(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        WithWith obj = new WithWith();
        int res = obj.addvalue(8, 5);
        System.out.println(res);
    }
    
}
