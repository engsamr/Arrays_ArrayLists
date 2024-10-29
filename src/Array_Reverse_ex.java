public class Array_Reverse_ex {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6};

        // Create a temporary array
        int temp[] = new int[array.length];
        //copy elements of original array in you temp array
        for (int i = 0; i < array.length; i++) {
            temp[array.length - i - 1] = array[i];
        }
        //copy back your reversed temp array put it in the original array
        for (int i = 0; i < array.length; i++) {
            array[i] = temp[i];
        }

        // Print reversed array
        for (int num : array) {

            System.out.println(num);
        }


//        int[] temp = new int[array.length];
//
//        // Reverse array by assigning elements from end to start
//        for (int i = 0; i < array.length; i++) {
//            temp[i] = array[array.length - i - 1];
//        }
//
//        // Copy temp to original array by re-assigning each element
//        for (int i = 0; i < array.length; i++) {
//            array[i] = temp[i];
//        }
//
//        // Print reversed array
//        for (int num : array) {
//            System.out.println(num);
//        }
    }
}

