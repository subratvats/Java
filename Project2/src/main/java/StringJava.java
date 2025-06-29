public class StringJava {
    int max(int x,int y){
        if (x>y){
            return x;
        }
        else {
            return y;
        }
    }
    public static void main(String[] args) {
        char[] c = {'A','B','c','D','F'};
        String str1 = new String(c);
        System.out.println(str1);
        System.out.println(str1.length()); // there are many medhos we can a[pply on string


        String[] car = {"BMW", "Tata","Volvo","Ford" };
        for (int i = 0; i < car.length; i++) {
            System.out.println(car[i]);
        }
        System.out.println("============");
        for (String i : car){
            System.out.println(i);
        }

    }
}
