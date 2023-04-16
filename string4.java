public class string4 {
    //concatenation
    public static void main(String[] args) {
        String firstName="hello";
        String lastName="world";
        String fullName= firstName+lastName;
        System.out.println(fullName);//helloworld
        System.out.println(firstName.concat(lastName));//helloworld
        System.out.println(fullName.length());//10 length() function

        System.out.println(fullName.substring(4,9));//oworl
        System.out.println(fullName.substring(0,9));//helloworl

    }
}
