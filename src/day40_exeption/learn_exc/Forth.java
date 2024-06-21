package day40_exeption.learn_exc;

public class Forth {
    public static void main(String[] args) {
        try {
            System.out.println("Start");
            Thread.sleep(-200);  // IllegalArgumentException
            System.out.println("End");
        } catch (Exception e){
            e.printStackTrace();
            //System.out.println(e.getMessage());
        }


        System.out.println("END-2");







    }
}

