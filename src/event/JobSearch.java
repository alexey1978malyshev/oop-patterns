package event;

import event.listener.impl.Subscriber;
import event.publisher.impl.HH;

public class JobSearch{
    public static void main(String[] args) {
        HH hh = new HH();
        hh.addVacancy("Junior Java Developer");
        hh.addVacancy("Middle Java Developer");
        hh.addVacancy("Senior Java Developer");

        hh.add(new Subscriber("Vanya"));
        hh.add(new Subscriber("Kirill"));
        hh.add(new Subscriber("Alexey"));

        hh.addVacancy("Senior Python Developer");

        hh.removeVacancy("Senior Java Developer");

    }
}
