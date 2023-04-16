public class string24 {
    public static void main(String args[]) {
        String str = new String("hello javatpoint how r u");
        char[] ch = new char[10];
        try {
            str.getChars(6, 16, ch, 0);
            System.out.println(ch);
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}

/*

javatpoint

Java String getChars()
The Java String class getChars() method copies the content of this string into a specified char array.
There are four arguments passed in the getChars() method. The signature of the getChars() method is given below:

Signature
public void getChars(int srcBeginIndex, int srcEndIndex, char[] destination, int dstBeginIndex)

 */
