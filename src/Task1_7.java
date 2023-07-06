public class Task1_7 {
    public static void main(String args[]) {
        //task 1

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 2;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();


        //task 2

        int[] arr2 = new int[1000];

        for (int i = 0; i < 1000; i++) {
            arr2[i] = i;
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        //task 3

        int[] arr3 = new int[20];
        int size = 0;

        for (int i = -20; i <= 20; i++) {
            if (i % 2 != 0) {
                arr3[size++] = i;
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr3[i] + " ");
        }
        System.out.println();

        // task 4

        int[] arr4 = {1, 7, 5, 15, 21, 23, 25, 43, 67, 55};

        for (int i = 0; i < arr4.length; i++) {
            if (arr4[i] % 5 == 0) {
                System.out.print(arr4[i] + " ");
            }
        }
        System.out.println();

        //task 5

        double[] arr5 = {2.3, 25.65, 12.85, 75.36, -4.91, 100.125, 99.4, 251.99, -400.1, 450.12, 500};

        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i] >= 24.12 && arr5[i] <= 467.23) {
                System.out.print(arr5[i] + " ");
            }
        }
        System.out.println();


        // task 7

        int N = 8;
        int maxMultiple = 10;

        for(int i = 1; i <= maxMultiple; i++) {
            System.out.println(N + " X " + i + " = " + (N * i));
        }


    }
}
