public class Stringlen {
    public static void main(String[] args) {
        String str="Java Programming";
        // length of the string length()
        System.out.println("Given string is: "+str);
        int len=str.length();
        System.out.println("Length of the string is: "+ len);
        // charAt() --> access a specific character
        char ch = str.charAt(13);
        System.out.println("Access character: "+ ch);
        //  substring(begin index, end index + 1) --> to find the substring 
        String substr =str.substring(5,12);
        System.out.println("Substring: "+substr);
        // convert to upper case
        System.out.println("Uppercase:" + str.toUpperCase());
        // convert to lower case
        System.out.println("Lowercase: "+ str.toLowerCase());
        // to check a substring contains by the string or not <str.contains()>
        System.out.println("Is The string contains <Java>: "+ str.contains("Java"));
        // to replace substring or character
        System.out.println("Replace java into python: "+ str.replace("Java", "Python"));
        // ---compare---
        String name="Rahul";
        boolean issame = name.equals("rahul");
        System.out.println("Compare the given string is same or not: "+ issame); // false
        // Without case sensitive
        boolean issamecase = name.equalsIgnoreCase("rahul");
        System.out.println("Without case sensitive: " + issamecase);  // true

    }   
}