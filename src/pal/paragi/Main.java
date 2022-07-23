package pal.paragi;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[]array = {1, 3, 44, 66, 888};
        System.out.println("Array = " + Arrays.toString(array));
        reverse(array);
        System.out.println("Reversed array = " + Arrays.toString(array));

    }

    private static void reverse(int[]array){
        int maxIndex = array.length -1;
        int halfLength = array.length / 2;
        for(int i=0; i< halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex -i];
            array[maxIndex - i] = temp;
        }
    }

}
