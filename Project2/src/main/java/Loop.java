public class Loop {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Number: " + i);
        }
        System.out.println("===============");
        int i = 1;
        while (i <= 5) {
            System.out.println("Number: " + i);
            i++;
        }
        System.out.println("===============");
        i = 1;
        do {
            System.out.println("Number: " + i);
            i++;
        } while (i <= 5);
        System.out.println("===============");
        int[] numbers = {10, 20, 30, 40, 50};
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }



    }
}
