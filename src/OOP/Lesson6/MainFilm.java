package OOP.Lesson6;


public class MainFilm {
    public static void main(String[] args) {
        Film film = new Film(Film.Duration.LONG, Film.Genre.COMEDY, Film.Director.SPILBERG);
        System.out.println(film.duration.time);
        System.out.println(film.genre);
        System.out.println(film.director);
    }
}
