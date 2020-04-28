/*
Задача 1:
-------------------------------------------
Створити клас Фільм з внутрішнім класом, за допомогою об'єктів якого можна
зберігати інформацію про тривалість, жанри і режисерів
фільму.
 */
package OOP.Lesson6;
public class Film {

    Duration duration;
    Genre genre;
    Director director;

        Film(Duration duration, Genre genre, Director director) {
            this.duration = duration;
            this.genre = genre;
            this.director = director;
        }
        enum Duration {
            SHORT (60), LONG (120);
            int time;
            Duration (int time) {
                this.time = time;
            }
        }
        enum Genre {
            COMEDY, DRAMA;
        }
        enum Director {
            LINCH, SPILBERG;
        }
}

