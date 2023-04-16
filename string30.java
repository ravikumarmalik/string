public class string30 {
    public static void main(String[] args) {
        String date = String.join("/","25","06","2018");
        System.out.print(date);

        String time = String.join(":", "12","10","10");
        System.out.println(" "+time);

        String date1 =String.join("/","23","12","2002");
        System.out.println(date1);
    }
}

/*

25/06/2018 12:10:10

Java String join()
The Java String class join() method returns a string joined with a given delimiter.
 In the String join() method, the delimiter is copied for each element. The join() method is included in the Java string since JDK 1.8.

There are two types of join() methods in the Java String class.

Signature
The signature or syntax of the join() method is given below:

public static String join(CharSequence delimiter, CharSequence... elements)
and
public static String join(CharSequence delimiter, Iterable<? extends CharSequence> elements)

 */
