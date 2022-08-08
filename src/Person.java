public class Person {

    String name;
    String surname;
    int ticket;

    public Person(String name, String surname, int ticket) {
        this.name = name;
        this.surname = surname;
        this.ticket = ticket;
    }

    public int getTicket() {
        return ticket;
    }

    public boolean userTicket() {
        if (ticket > 0) {
            ticket--;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return name + surname + " осталось билетов " + ticket;
    }
}