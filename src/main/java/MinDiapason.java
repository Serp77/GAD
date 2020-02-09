public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start; i < finish; i++) {
            if (array[i] > array[i + 1]) {
                min = array[i + 1];
            }
        }
        return min;
    }
}
