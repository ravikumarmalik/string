public class string22 {
    public static void main(String args[]) {
        String s1 = "ABCDEFG";
        byte[] barr = s1.getBytes();
        for (int i = 0; i < barr.length; i++) {
            System.out.print(barr[i]+" ");
        }
    }
}























/*

65
66
67
68
69
70
71

Java String getBytes()
The Java String class getBytes() method does the encoding of string into the sequence of bytes
and keeps it in an array of bytes.

Exception Throws
UnsupportedEncodingException: It is thrown when the mentioned charset is not supported by the method.

There are three variants of getBytes() method.
public byte[] getBytes()
public byte[] getBytes(Charset charset)
public byte[] getBytes(String charsetName)throws UnsupportedEncodingException

 */
