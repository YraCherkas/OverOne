package by.ycherkas.HomeWorkOfArrays;

import java.util.Arrays;

public class WorkOfArray {



    public static void creatingAnArrayAndPrint() {
        int[] mas = new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 20) - 10;
        }
isSort(mas);
        System.out.println(Arrays.toString(mas));

    }



    public static int[] isSort(int[] mas) {
//       Arrays.sort(mas);
        int buffer = 0;
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    isSorted = false;
                    buffer = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = buffer;
                }
            }
        }
        return mas;
    }


}
