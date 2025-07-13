//Array has a fixed length so value stored in object itself so length is a property not method()
package Array;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        int[] arr1 = new int[5];
//        for (int i = 0; i < arr1.length; i++) {
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[3]);
        System.out.println(arr1[4]);
        System.out.println(Arrays.toString(arr1));
        Arrays.fill(arr1,100);
        System.out.println(Arrays.toString(arr1));



//        }

        int[] marks = {84,76,98,72,69};
        System.out.println(marks.length);

        Arrays.sort(marks);
        System.out.println(Arrays.toString(marks));

        int[] arr2 = {50};
        System.out.println(arr2.length);

        Arrays.equals(arr1,arr2);
    }
}
