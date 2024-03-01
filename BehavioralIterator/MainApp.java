package BehavioralIterator;

public class MainApp {
    public static void main(String[] args) {
        ConcreteAggregate<String> aggregate = new ConcreteAggregate<>();
        aggregate.addElement("Item 1");
        aggregate.addElement("Item 2");
        aggregate.addElement("Item 3");

        Iterator<String> iterator = aggregate.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
