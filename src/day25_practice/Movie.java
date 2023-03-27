package day25_practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class Movie {
    public String country,title,Genre,director;
    ArrayList<String> casts = new ArrayList<>();
    public LocalDate releaseDate;

    public Movie(String country, String title, String genre, String director, LocalDate releaseDate) {
        this.country = country;
        this.title = title;
        Genre = genre;
        this.director = director;
        this.casts = casts;
        this.releaseDate = releaseDate;
    }
    public void addCast(String cast){
        this.casts.add(cast);//adds the given String argument to the array list
    }
    public void addCast(String[]casts){
        this.casts.addAll(Arrays.asList(casts));//adds the giving array argument to the array list
    }


    public String toString() {
        return "Movie{" +
                "country='" + country + '\'' +
                ", title='" + title + '\'' +
                ", Genre='" + Genre + '\'' +
                ", director='" + director + '\'' +
                ", casts=" + casts +
                ", releaseDate=" + releaseDate.format(DateTimeFormatter.ofPattern("MM/dd/y")) +
                '}';
    }
}
/*
Create a custom class named  Movie:
        Attributes:
            country, title, Genre, releaseDate, director, casts (ArrayList<String>)

        Add a constructor to set the country, title, release date, and director of the Movie

        Actions
            addCast(String): adds the given string argument to the arrayList casts
            addCasts(String[]): adds the given string array argument to the arrayList casts
            toString(): returns the name of country, title, release date, and total number of casts

    2. create a class called TestMovieObjects
            1. create an object of the movie:
                    title: Java Developer: Zero to Hero
                    country: USA
                    Genre: Adventure, Comedy, Thriller
                    release date: 04/18/2021
                    director: Kuzzat Altay
                    Casts: Ozzy, Ali, Muhtar and 5 more students from your group

        print the full info of the movie
 */