public class SelectionSort {
    /*Code created by Chio Code: https://youtu.be/ACFZn_xQcz8?si=qTm5y03Lf-zbuKSR*/
    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minimo = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minimo] > arr[j]) {
                    minimo = j;
                }
            }
            int temp = arr[i];
            arr[1] = arr[minimo];
            arr[minimo] = temp;
        }

        return arr;
    }
}
