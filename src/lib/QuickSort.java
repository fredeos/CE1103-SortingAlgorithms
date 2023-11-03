package lib;

public class QuickSort {

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = new int[100000]; // Crea un arreglo de un millón de datos

        // Llena el arreglo con valores aleatorios (puedes cambiar este paso si tienes tus propios datos)
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000000);
        }

        // Mide el tiempo antes de ordenar
        long startTime = System.nanoTime();

        // Llama al algoritmo QuickSort
        quickSort(arr, 0, arr.length - 1);

        // Mide el tiempo después de ordenar
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        double milliseconds = (double) duration / 1_000_000.0;

        System.out.println("Tiempo de ejecución: " + milliseconds + " milisegundos");
    }
}

