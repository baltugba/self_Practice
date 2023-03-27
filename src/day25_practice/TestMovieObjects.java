package day25_practice;

import java.time.LocalDate;

public class TestMovieObjects {
    public static void main(String[] args) {
        Movie movie1 = new Movie("USA","Java Develop[er:Zero to Hero",
                "Adventure,Comedy,Thriller","KuzzatAltay", LocalDate.of(2021,4,18));

        movie1.addCast("Ozzy");
        String[] casts = {"Ali","Muhtar","Tugba","Pinar"};

        movie1.addCast(casts);
        System.out.println(movie1);


    }
}
