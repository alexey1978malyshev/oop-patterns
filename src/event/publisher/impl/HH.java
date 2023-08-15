package event.publisher.impl;

import event.listener.Listener;
import event.publisher.Publisher;

import java.util.ArrayList;
import java.util.List;

public class HH implements Publisher {

    private List<String> vacansies;
    private List<Listener> listeners;

    public HH() {
        this.vacansies = new ArrayList<>();
        this.listeners = new ArrayList<>();
    }

    @Override
    public void add(Listener listener) {
        listeners.add(listener);
    }

    @Override
    public void remove(Listener listener) {
        listeners.remove(listener);
    }

    @Override
    public void notify(List<Listener> listeners) {
        for (Listener lisnr:
             listeners) {
            lisnr.handleEvent(vacansies);
        }
    }
    public void addVacancy(String vacancy){
        vacansies.add(vacancy);
        notify(listeners);
    }

    public void removeVacancy(String vacancy){
        vacansies.remove(vacancy);
        notify(listeners);
    }
}
