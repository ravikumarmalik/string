public class stringBuilder5 {
    public static void main(String[] args)
    {
        // create StringBuilder object
        StringBuilder str = new StringBuilder("GeeksforGeeks");
        System.out.println("StringBuilder = " + str);//StringBuilder = GeeksforGeeks

        // Append 'C'(67) to the String
        str.appendCodePoint(67);

        // Print the modified String
        System.out.println("Modified StringBuilder = " + str);//Modified StringBuilder = GeeksforGeeksC
    }
}
