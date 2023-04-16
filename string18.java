public class string18 {
    public static void main(String[] args) {
        String str = "I am ravi kumar from india";
        for (int i=0; i<=str.length()-1; i++) {
            if(i%2==0) {
                System.out.println("Char at "+i+" place :"+str.charAt(i));
            }
        }
    }
}


















/*

odd places:
Char at 1 place :
Char at 3 place :m
Char at 5 place :r
Char at 7 place :v
Char at 9 place :
Char at 11 place :u
Char at 13 place :a
Char at 15 place :
Char at 17 place :r
Char at 19 place :m
Char at 21 place :i
Char at 23 place :d
Char at 25 place :a

even places
if(i%2==0) {
                System.out.println("Char at "+i+" place :"+str.charAt(i));
            }
Char at 0 place :I
Char at 2 place :a
Char at 4 place :
Char at 6 place :a
Char at 8 place :i
Char at 10 place :k
Char at 12 place :m
Char at 14 place :r
Char at 16 place :f
Char at 18 place :o
Char at 20 place :
Char at 22 place :n
Char at 24 place :i


 */
