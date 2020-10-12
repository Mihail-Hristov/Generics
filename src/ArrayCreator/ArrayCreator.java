package ArrayCreator;

import java.lang.reflect.Array;

public class ArrayCreator {

    @SuppressWarnings("unchecked")
    public static <T> T[] create(int length, T item) {
        T[] arr = (T[])Array.newInstance(item.getClass(), length);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = item;
        }
        return (T[])arr;
    }

    public static <T> T[] create(Class<T> tClass, int length, T item) {
        T[] arr = (T[]) Array.newInstance(tClass, length);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = item;
        }
        return arr;
    }
}
