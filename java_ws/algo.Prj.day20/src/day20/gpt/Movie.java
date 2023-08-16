package day20.gpt;

public class Movie {
    private String title;
    private int releaseYear;
    private String director;

    public Movie(String title, int releaseYear, String director) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getDirector() {
        return director;
    }

    public void printMovieInfo() {
        System.out.println("Title: " + title);
        System.out.println("Release Year: " + releaseYear);
        System.out.println("Director: " + director);
    }

    public static void main(String[] args) {
        Movie movie = new Movie("Inception", 2010, "Christopher Nolan");
        movie.printMovieInfo();
    }
}