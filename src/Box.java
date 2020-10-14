import java.util.ArrayList;
import java.util.List;

public class Box<T extends Comparable<T>> {

    private List<T> list;

    public Box() {
        this.list = new ArrayList<>();
    }

    public void add(T item){
        this.list.add(item);
    }

    public T remove(int index) {
        T element = this.list.remove(index);
        return element;
    }

    public boolean contains(T element) {
        return this.list.contains(element);
    }



    private void set(int index, T element) {
        this.list.set(index, element);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (T element : this.list) {
            result.append(String.format("%s: %s", element.getClass().getName(), element));
            result.append(System.lineSeparator());
        }

        return result.toString();
    }

    public  void swap(int firstIndex, int secondIndex){
        T firstElement = list.get(secondIndex);
        T secondElement = list.get(firstIndex);

        this.list.set(firstIndex, firstElement);
        this.list.set(secondIndex, secondElement);
    }

    public T get(int index) {
        return this.list.get(index);
    }

    public int size() {
        int size = this.list.size();
        return size;
    }

    public int countGreaterThan(T element) {
        int count = (int) this.list.stream().filter(e -> e.compareTo(element) > 0).count();

        return count;
    }

    public T getMax() {
        T element = this.list.get(0);

        for (T item : this.list) {
            if (element.compareTo(item) < 0) {
                element = item;
            }
        }

        return  element;
    }

    public T getMin() {
        T element = this.list.get(0);

        for (T item : this.list) {
            if (element.compareTo(item) > 0) {
                element = item;
            }
        }

        return  element;
    }

    public void print() {
        for (T item : this.list) {
            System.out.println(item);
        }
    }

}
