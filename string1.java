public class string1 {
    public static void main(String[] args) {
        char[] str1={'r','a','v','i'};
        String str2="ravi";
        String str3=new String("ravi");
        String str4="ravi";
        //string are immutable.
        System.out.println(str1);//ravi
        System.out.println(str2);//ravi
        System.out.println(str3);//ravi

        System.out.println(str1.equals(str3));//false
        System.out.println(str2.equals(str3));//true(correct way)
        System.out.println(str2==str3);//false,this is not a correct way to compare two string
        System.out.println(str2==str4);//true
    }
}
/*
NOTE- If we want to compare of any two string then
If I will use(.equals()) method will get correct output every time
but if you use(==) this is not give the correct output in every case.
 */
