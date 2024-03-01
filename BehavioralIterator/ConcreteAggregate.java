package BehavioralIterator;

import java.util.ArrayList;
import java.util.List;

class ConcreteAggregate<T> implements Aggregate<T> {
    private List<T> elements;

    public ConcreteAggregate() {
        this.elements = new ArrayList<>();
    }

    public void addElement(T element) {
        elements.add(element);
    }

    @Override
    public Iterator<T> createIterator() {
        return new ConcreteIterator<>(elements);
    }
}
