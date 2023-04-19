public class Main {
    public static void main(String[] args) {

        int array[] = {7, 6, 5, 2, 1};
        int array2[] = {43, 47, 27, 42, 23, 3};

        bubbleSort(array);
        bubbleSort(array2);

        System.out.println("First Array:  \n");
        for (int i : array) {
            System.out.println(i);
        }

        System.out.println("Second Array:  \n");


        for (int i : array2) {
            System.out.println(i);
        }



    }

    public static void bubbleSort(int array[]) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {                 // this checks adjacent element swap > with < for descending
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;

                }


            }


        }

    }
}


