public class Sorted <T extends Comparable<T>> {

    public static void sort(Box box) {
        for (int i = 0; i < box.size(); i++) {
            String firstElement = (String) box.get(i);
            for (int j = i + 1; j < box.size() ; j++) {
                String secondElement = (String) box.get(j);
                if (firstElement.compareTo(secondElement) > 0) {
                    box.swap(i, j);
                }
            }
        }
    }
}
