import java.util.StringTokenizer;
public class string16 {
    public static void main(String args[]){
        StringTokenizer st = new StringTokenizer("my name is ravi"," ");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}

/*

my
name
is
ravi
===================

Let's see an example of the StringTokenizer class that tokenizes a string
"my name is ravi" on the basis of whitespace.

The java.util.StringTokenizer class allows you to break a String into tokens.
It is simple way to break a String. It is a legacy class of Java.

It doesn't provide the facility to differentiate numbers, quoted strings, identifiers etc.
like StreamTokenizer class. We will discuss about the StreamTokenizer class in I/O chapter.

In the StringTokenizer class, the delimiters can be provided at the time of creation or one by one to the tokens.

Methods	                                     Description
boolean hasMoreTokens()	            It checks if there is more tokens available.
String nextToken()	                It returns the next token from the StringTokenizer object.
String nextToken(String delim)	    It returns the next token based on the delimiter.
boolean hasMoreElements()	        It is the same as hasMoreTokens() method.
Object nextElement()	            It is the same as nextToken() but its return type is Object.
int countTokens()	                It returns the total number of tokens.



 */
