import java.util.Comparator;

public class OrderedChecker {
    public static boolean ordered(int[] list) {
        return ordered(list, true);
    }
    public static boolean ordered(int[] list, boolean ascending) {
        if (list == null || list.length <= 1) {
            return true;
        }
        for (int i = 1; i < list.length; i++) {
            if (ascending && list[i - 1] > list[i]) {
                return false;
            } else if (!ascending && list[i - 1] < list[i]) {
                return false;
            }
        }
        return true;
    }
    public static boolean ordered(double[] list) {
        return ordered(list, true);
    }
    public static boolean ordered(double[] list, boolean ascending) {
        if (list == null || list.length <= 1) {
            return true;
        }
        for (int i = 1; i < list.length; i++) {
            if (ascending && list[i - 1] > list[i]) {
                return false;
            } else if (!ascending && list[i - 1] < list[i]) {
                return false;
            }
        }
        return true;
    }
    public static <E extends Comparable<E>> boolean ordered(E[] list) {
        return ordered(list, true);
    }
    public static <E extends Comparable<E>> boolean ordered(E[] list, boolean ascending) {
        if (list == null || list.length <= 1) {
            return true;
        }
        for (int i = 1; i < list.length; i++) {
            int comparison = list[i - 1].compareTo(list[i]);
            if ((ascending && comparison > 0) || (!ascending && comparison < 0)) {
                return false;
            }
        }
        return true;
    }
    public static <E> boolean ordered(E[] list, Comparator<? super E> comparator) {
        return ordered(list, comparator, true);
    }
    public static <E> boolean ordered(E[] list, Comparator<? super E> comparator, boolean ascending) {
        if (list == null || list.length <= 1) {
            return true;
        }
        for (int i = 1; i < list.length; i++) {
            int comparison = comparator.compare(list[i - 1], list[i]);
            if ((ascending && comparison > 0) || (!ascending && comparison < 0)) {
                return false;
            }
        }
        return true;
    }
}
