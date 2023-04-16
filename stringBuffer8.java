public class stringBuffer8 {
    public static void main(String[] args)
    {

        // Reading passed string
        StringBuffer sb = new StringBuffer("Geeksforgeeks");
        // Printing the string
        System.out.println("String buffer = " + sb);//String buffer = Geeksforgeeks

        // Appending the CodePoint as String to the string
        // buffer
        sb.appendCodePoint(65);

        // Printing the string after code appending.
        System.out.println("After appending CodePoint is = "
                + sb);//After appending CodePoint is = GeeksforgeeksA
    }
}
