public class RemoveSpace {
    public static void main(String[] args) {
        String str="How are you?";
        System.out.println("Input: "+str);

        // Approach - 1 --> using replace
        String strreplace = str.replace(" ", "");
        System.out.println("After removing spaces: "+ strreplace);

        // Approach -2 --> using for loop
        String newstr = "";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch!=' '){
                newstr = newstr + ch;
            }
        }
        System.out.println("After removing space using for loop: "+ newstr);
    }
    
}
