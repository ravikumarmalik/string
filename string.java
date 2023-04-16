/*
Note: All objects in Java are stored in a heap.
The reference variable is to the
object stored in the stack area or they can be contained in other objects which puts them in the heap area also.

public class string {
    public static void main(String[] args) {
        String str="ravi";
        System.out.println(str);
    }
}

 */



/*
public class string {
    public static void main(String[] args) {
        String sb=new String("ravi");
        sb=sb.concat(" kumar");
        System.out.println(sb);
    }
}

 */


/*
public class string {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("ravi kumar");
        sb.append(" raj");
        System.out.println(sb);//ravi kumar raj->The append() method concatenates the given argument with this string.

    }
}


 */

/*
public class string {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("ravi");
        sb.insert(0,"kumar");
        System.out.println(sb);//kumarravi->The insert() method inserts the given string with this string at the given position.
    }
}

 */

/*
public class string {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("ravi");
        sb.replace(1,3,"kumar");
        System.out.println(sb);//rkumari->The replace() method replaces the given string from the specified beginIndex and endIndex-1.
    }
}

 */

/*
public class string {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("ravi");
        sb.delete(1,3);
        System.out.println(sb);//ri->always deleted till last index.->The delete() method of StringBuffer class deletes the string from the specified beginIndex to endIndex-1.
    }
}

 */

/*
public class string {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("kumarravi");
        sb.deleteCharAt(1);
        System.out.println(sb);//kmarravi->Deletes the character at the index specified by loc
    }
}

 */





/*
public class string {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("kumarravi");
        sb.reverse();
        System.out.println(sb);//ivarramuk->The reverse() method of StringBuffer class reverses the current string.
    }
}

 */

/*
The capacity() method of StringBuffer class returns the current capacity of the buffer.
The default capacity of the buffer is 16. If the number of character increases from its current capacity,
it increases the capacity by (oldcapacity*2)+2.
For example if your current capacity is 16, it will be (16*2)+2=34
 */

/*
public class string {
    public static void main(String[] args) {
            StringBuffer sb = new StringBuffer();
            System.out.println(sb.capacity()); // default 16
            sb.append("Hello");
            System.out.println(sb.capacity()); // now 16
            sb.append("java is my favourite language");
            System.out.println(sb.capacity());
            // Now (16*2)+2=34     i.e (oldcapacity*2)+2
        }
}

 */

/*
public class string {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("ravi");
        sb.append("kumar");
        System.out.println("string="+sb.toString());//string=ravikumar

    }
}

 */



/*
public class string {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("ravi");
        System.out.println("string="+sb.toString());//string=ravi

    }
}


 */

/*
public class string {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder(10);
        System.out.println("string="+sb.capacity());//string=16 default

    }
}

 */




/*
public class string {
    public static void main(String[] args) {
        String s1 = "TAT";//store in scp-string constent pool.
        String s2 = "TAT";//store in scp-string constent pool.
        String s3 = new String("TAT");//store in heap area
        String s4 = new String("TAT");
        System.out.println(s1);//TAT
        System.out.println(s2);//TAT
        System.out.println(s3);//TAT
        System.out.println(s4);//TAT
    }
}

 */

/*
public class string {
    public static void main(String[] args) {
        String str="ravi";
        //str.concat("kumar");//only possible with stringbuffer class or stringbuilder class.
        str=str.concat("kumar");//ravikumar->correct way for simple string literals
        System.out.println(str);
    }
}

 */






/*
public class string {
    public static void main(String[] args) {
        String str="ravi";
        System.out.println(str.length());
    }
}

 */

/*
public class string {
    public static void main(String[] args) {
        String str1="ravi";
        String str2="ravi";
        System.out.println(str1==str2);
    }
}

 */

/*
public class string {
    public static void main(String[] args) {
        String str1="ravi";
        String str2="ravi";
        String str3=new String("ravi");
        System.out.println(str1==str2);//true
        System.out.println(str1==str3);//false
        System.out.println(str1.equals(str3));//true
    }
}

 */

/*
public class string {
    public static void main(String[] args) {
        String str1="ravi";
        String str2=" kumar";
        System.out.println(str1+str2);//ravi kumar(concatanation)
    }
}

 */

/*
class string{
    public static void main(String[] args) {
        String str=new String("ravi");
        System.out.println(str);
    }
}

 */

/*
import java.util.*;
class string{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //String str=sc.next();//ravi(it's print only sinle word)
        String str1=sc.nextLine();//ravi kumar(it's print complete line include space)
        //System.out.println(str);//ravi
          System.out.println(str1);//ravi kumar
    }
}

 */



/*
public class string {
    public static void main(String[] args) {
        String str="ravi";
        for (int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }
}

 */


/*
public class string {
    public static boolean isPalindrome(String str) {
        for (int i=0;i<str.length()/2;i++){
            int n=str.length();
            if (str.charAt(i)!=str.charAt(n-i-1)){
                return false;
            }
        }
        return true;

    }
    public static void main(String[] args) {
        String str="noon";
        System.out.println(isPalindrome(str));
    }
}

 */


/*
public class string {
    public static float sortestPath(String path) {
        int x=0;
        int y=0;
        for (int i=0; i<path.length(); i++) {
            char dir=path.charAt(i);
            if (dir == 'S') {
                y--;
            } else if (dir == 'N') {
                y++;
            } else if (dir == 'W') {
                x--;
            } else {
                x++;
            }
        }
        int x2=x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);

    }
    public static void main(String[] args) {
        String path= "WNEENESENNSSNWENSN";
        System.out.println(sortestPath(path));
    }
}

 */


/*
public class string {
    public static String subString(String str, int si, int ei) {
        String substring="";
        for (int i=0;i<ei;i++){
            substring=substring+str.charAt(i);
        }
        return substring;

    }
    public static void main(String[] args) {
        String str="helloworld";
        System.out.println(str.substring(5, 9));//(str.subtring) function we can use also(worl)
        //System.out.println(subStrimg(str,5,9));//function call
    }
}

 */




/*
public class string {
    public static void main(String[] args) {
        String[] fruits={"apple","mango","banana","orange"};
        String largest=fruits[0];
        for (int i=0;i<fruits.length;i++){
         if (largest.compareTo(fruits[i])<0){ //compareTo() function used for the finding largest number between them.
                largest=fruits[i];
            }
        }
        System.out.println(largest);
    }
}

 */


/*
public class string {

    public static void main(String[] args) {
        Integer a=97;
        System.out.println(a.toString());//97

        Character ch='a';
        System.out.println(ch.toString());//a
// we change anything in string using (toString() function but that variable should be object)

   }
}

 */


/*
public class string {

    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("");
        for (char ch='a';ch<='z';ch++){
            sb.append(ch);

        }
        System.out.println(sb +" ");//abcdefghijklmnopqrstuvwxyz
        System.out.println(sb.length());//26

    }
// we change anything in string using (toString() function but that variable should be object)

}

 */


/*
public class string {

    public static String compression(String str) {
        String newstr="";
        for (int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            newstr += str.charAt(i);
            if (count>1){
                newstr=newstr+count.toString();
            }
        }
        return newstr;
    }
    public static void main(String[] args) {
        String str="aaabbeeecccdd";
        System.out.println(compression(str));//a3b2e3c3d2

    }

}

 */
