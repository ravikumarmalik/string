public class stringBuilder6 {
    public static void main(String[] args)
    {

        // create a StringBuilder object,
        // default capacity will be 16
        StringBuilder str = new StringBuilder();

        // get default capacity
        int capacity = str.capacity();

        System.out.println("Default Capacity of StringBuilder = " + capacity);
        //Default Capacity of StringBuilder = 16


        // add the String to StringBuilder Object
        str.append("Geek");

        // get capacity
        capacity = str.capacity();

        // print the result
        System.out.println("StringBuilder = " + str);//StringBuilder = Geek
        System.out.println("Current Capacity of StringBuilder = " + capacity);
        //Current Capacity of StringBuilder = 16
    }
}
