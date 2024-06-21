package day40_exeption.learn_exc;

public class FirstTry {
    public static void main(String[] args) {
        System.out.println("First print out");
        String str= "loopcamp";
 //                  01234567

        try {
            System.out.println(str.charAt(8));
        } catch(Exception e) {
            System.out.println("Exception is caught");
        }



        System.out.println("Last print out");
    }
}
