public class string14 {

    public static void main(String args[]) {
        College s1 = new College(101, "Ram", "lucknow");
        College s2 = new College(102, "Vinay", "ghaziabad");

        System.out.println(s1);//compiler writes here s1.toString()

        System.out.println(s2);//compiler writes here s2.toString()

    }
}
     class College{
        int rollno;
        String name;
        String city;

        College(int rollno, String name, String city){
            this.rollno=rollno;
            this.name=name;
            this.city=city;
        }
         public String toString() {//overriding the toString() method
             return rollno + " " + name + " " + city;
         }
    }






