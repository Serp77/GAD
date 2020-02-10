public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = data[i];
            int min_i = i;

            for (int j = i+1; j < data.length; j++) {
                if (data[j] < min) {
                    min = data[j];
                    min_i = j;
                }
            }

            if (i != min_i) {
                int tmp = data[i];
                data[i] = data[min_i];
                data[min_i] = tmp;
            }
        }
        return data;
    }
}



