package Box;

public class Box<T> {

    private T element;

    public Box(T element) {
        this.element = element;
    }

    @Override
    public String toString() {
        String[] tokens = element.getClass().toString().split("\\s+");
        String classOfTheElement = tokens[1];

        String result = String.format("%s: %s", classOfTheElement, element);

        return result;
    }
}
