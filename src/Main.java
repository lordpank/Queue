import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Deque<Person> deque = new ArrayDeque<>();
        for (Person person : generateClients()) {
            deque.offer(person);
        }

        while (!deque.isEmpty()) {
            Person person = deque.removeFirst();
            System.out.println(person + " прокатился на аттракционе");
            person.userTicket();
            if (person.getTicket() > 0) {
                deque.addLast(person);
            }
        }
    }

    private static List<Person> generateClients() {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("Виктор ", "Воронков", 5));
        list.add(new Person("Станислав ", "Егоров", 2));
        list.add(new Person("Николай ", "Маслов", 9));
        list.add(new Person("Константин ", "Ванеев", 6));
        list.add(new Person("Александр ", "Шиморин", 11));
        return list;
    }
}