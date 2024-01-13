public class Main {
    public static void main(String[] args) {
       /*String is a Sequence of Character
       * */
        /*
        * What is a String?
        * String is a sequence character.
        * There are two ways to create a string.
        * 1. String literal
        * 2. Using new Keyword.
        * */
        /*When we use String literal It will store in the String constant pool.
        First it will check in the string constant pool, and if the value is present it will map the value with
        the same instance.
        * */
        String str1="Welcome";
        String str2="Welcome";
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());

        /*Both will have the same memory location
        * */
        str2="Hello World";
        System.out.println(str2.hashCode());
        String str3=new String("Welcome");
        System.out.println(str3.hashCode());
        char[] ch={'W','e','l','c','o','m','e'};
        String str4=new String(ch);
        System.out.println(str4.hashCode());
        /*String Methods*/
        String s=new String("Hello World");
        System.out.println(s.charAt(2));
        s=String.format("Hello Java to %s",s);
        System.out.println(s);
        //Substring
        System.out.println(s.substring(2,6));
        System.out.println(s.contains("World"));



    }
}