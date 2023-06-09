package day30_practice.BookTask;

import day30_practice.BookTask.Book;

public class EBook extends Book {

    private String size;
    private int pages;

    public EBook(String title, String type, String author, double price, String size, int pages) {
        super(title, type, author, price);
        setSize(size);
        setPages(pages);
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if(pages <= 0){
            System.err.println("Pages can not be zero or negative ");
            System.exit(1);
        }
        this.pages = pages;
    }
    public void readBook(String name){

            System.out.println(name+ " is reading " + getTitle());
        }
    }

