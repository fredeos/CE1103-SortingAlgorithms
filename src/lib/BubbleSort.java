package lib;

import java.util.Random;

public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Crear una matriz de 10000 datos aleatorios
        int[] arr = new int[10000];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(10000); // Genera números aleatorios entre 0 y 9999
        }

        // Medir el tiempo antes de ordenar
        long startTime = System.nanoTime();

        // Llamar al algoritmo de ordenamiento
        bubbleSort(arr);

        // Medir el tiempo después de ordenar
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        // Convertir nanosegundos a milisegundos
        double milliseconds = (double) duration / 1_000_000.0;

        System.out.println("Tiempo de ejecución: " + milliseconds + " milisegundos");
    }
}
