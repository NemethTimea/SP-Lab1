package ro.uvt.sabloane.models;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;

@Component
public class Subject {

    Collection<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void add(Book book) {
        observers.forEach(observer -> observer.update(book));
    }
}