package day35_inheritance.book;

public class AudioBook extends Book {

    /*
        String title;
    Author author;
    // String authorName;
    // int authorAge;
    String genre;
    int chapters;
    double price;
    boolean hasMovie;
     */

    double duration; // 30min
    String narrator;


    public void listen (){
        System.out.println("Listening to " + title + " narrated by" + narrator );
    }

}
