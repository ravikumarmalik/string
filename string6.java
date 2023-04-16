public class string6 {
    public static void main(String[] args) {
        String name="hello";
        String fullName="INDIA";
        System.out.println(name.toUpperCase());//HELLO
        System.out.println(fullName.toLowerCase());//india
        System.out.println(name.replaceAll("hello","HELLO"));//HELLO
        System.out.println(name.replace('h','y'));//yello
        System.out.println(name.compareToIgnoreCase(fullName));// -1
        System.out.println(name.equalsIgnoreCase(fullName));//false
    }
}
