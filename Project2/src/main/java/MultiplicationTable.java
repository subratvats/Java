public class MultiplicationTable {

    static void multiplication(int n){
        for (int i = 1; i <=10 ; i++) {
            System.out.println(n +" * "+ i + " = "+n*i);

        }
    }
    public static void main(String[] args) {
        multiplication(5);
        multiplication(6);
    }
}
