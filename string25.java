public class string25 {

    public static void main(String args[]) {
        String s1 = "this is index of example";
//passing substring
        int index1 = s1.indexOf("is");//returns the index of is substring
        int index2 = s1.indexOf("index");//returns the index of index substring
        System.out.println(index1 + "  " + index2);//2 8

//passing substring with from index
        int index3 = s1.indexOf("is", 4);//returns the index of is substring after 4th index
        System.out.println(index3);//5 i.e. the index of another is

//passing char value
        int index4 = s1.indexOf('s');//returns the index of s char value
        System.out.println(index4);//3
    }
}

/*

2  8
5
3

ava String indexOf()
The Java String class indexOf() method returns the position of the first occurrence of the
specified character or string in a specified string.

Signature
There are four overloaded indexOf() method in Java. The signature of indexOf() methods are given below:

1   int indexOf(int ch)-It returns the index position for the given char value
2	int indexOf(int ch, int fromIndex)-It returns the index position for the given char value and from index
3	int indexOf(String substring)-It returns the index position for the given substring
4	int indexOf(String substring, int fromIndex)-It returns the index position for the given substring and from index


 */
