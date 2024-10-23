import java.util.ArrayList;


public static void sort(ArrayList<Integer> list) {
    if (list == null) {
        throw new IllegalArgumentException("The list cannot be null.");
    }

    int n = list.size();

    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - 1 - i; j++) {
            if (list.get(j) > list.get(j + 1)) {
                int temp = list.get(j);
                list.set(j, list.get(j + 1));
                list.set(j + 1, temp);
            }
        }
    }
}