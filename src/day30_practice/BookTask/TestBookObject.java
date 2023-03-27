package day30_practice.BookTask;

import day30_practice.BookTask.AudioBook;
import day30_practice.BookTask.Book;
import day30_practice.BookTask.EBook;

public class TestBookObject {
    public static void main(String[] args) {

        Book book1 = new Book("Kurt Seyid ve Sura","Novel","Nermin Bezmen",20);

        EBook eBook = new EBook("Simyaci","Novel","Paulo Coelho",25,"Small",150);

        AudioBook audioBook = new AudioBook("Kucuk bir kis masali","Novel","Maeve Bincy",30,4.0,"Tugba Bal");

        System.out.println(book1);
        System.out.println(eBook);
        System.out.println(audioBook);
    }
}
