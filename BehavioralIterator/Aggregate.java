package BehavioralIterator;

public interface Aggregate<T> {
    Iterator<T> createIterator();
}
