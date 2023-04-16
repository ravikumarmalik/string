public class string11 {
    public static String largestValue(String[] fruits,String largest) {
        for (int i=1; i<fruits.length;i++){
            if (largest.compareTo(fruits[i])<0){
                largest=fruits[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        String[] fruits={"apple","mango","banana"};
        String largest=fruits[0];
        System.out.println(largestValue(fruits,largest));//mango
    }
}
