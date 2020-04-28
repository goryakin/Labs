/*
Задача 1:​ Перед концертом классической музыки перед филармонией собрались дамы и джентльмены с целью купить билеты.
Они, как воспитанные, уважающиедруг-друга люди, пропускают более уважаемых вперед.
Уважение у них измеряется длинной усов у джентльменов и количеством брошек у дам.
Дамы, конечно вперед джентльменов.Напишите класс Слушателя с соответствующими полями и организуйте им очередь поуважению,
пожалуйста. Примените оба подхода - с Comparator и Comparable (помнимпро объектно-ориентированный подход)
Очередь выводите в консоль после каждого добавления нового Слушателя
 */
package Сoncert;
import lombok.Data;
@Data
public class Listener implements Comparable <Listener>{
    private String gender;
    private int longMustache;
    private int amountBrooches;

    public Listener(String gender, int longMustache, int amountBrooches) {
        this.gender = gender;
        this.longMustache = longMustache;
        this.amountBrooches = amountBrooches;
    }
    @Override
    public int compareTo(Listener anotherListener) {
        if (this.getGender().equals("woman"))
            return -1;
        if (this.getGender().equals("man"))
            return +1;
        else
            return 0;
    }
    @Override
    public String toString() {
        return "пол - " +gender + " длина усов - " +longMustache + " количество брошек - " +amountBrooches;
    }
}