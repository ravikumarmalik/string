public class stringBuffer7 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("ravi");
        sb.append("kumar");
        System.out.println("Capacity before applying trimToSize() = "
                + sb.capacity());
        //Capacity before applying trimToSize() = 20


        sb.trimToSize();
        System.out.println("String = " + sb.toString());//String = ravikumar

        System.out.println("Capacity after applying trimToSize() = "
                + sb.capacity());//Capacity after applying trimToSize() = 9
    }
}

/*
The trimToSize() method of
StringBuffer class is the inbuilt method used to trim the capacity used for the character
sequence of StringBuffer object. If the buffer used by StringBuffer object is larger than necessary to
hold its current sequence of characters, then this method is called to resize the StringBuffer object for
converting this object to more space efficient. Calling this method may, but is not required to, affect the value
returned by a subsequent call to the capacity() method.
 */
