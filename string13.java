public class string13 {
    public static void main(String args[]){
        System.out.println("Hashcode test of String:");
        String str="java";
        System.out.println(str.hashCode());
        str=str+"language";
        System.out.println(str.hashCode());

        System.out.println("Hashcode test of StringBuffer:");
        StringBuilder sb1=new StringBuilder("java");
        System.out.println(sb1.hashCode());
        sb1.append("language");
        System.out.println(sb1.hashCode());

        System.out.println("Hashcode test of StringBuffer:");
        StringBuffer sb=new StringBuffer("java");
        System.out.println(sb.hashCode());
        sb.append("language");
        System.out.println(sb.hashCode());
    }
}















/*

Hashcode test of String:
3254818
30473082
Hashcode test of StringBuffer:
764977973
764977973
----------------------------------------------------------
As we can see in the program given above,
String returns new hashcode while performing concatenation
But the StringBuffer class returns same hashcode.

 */
